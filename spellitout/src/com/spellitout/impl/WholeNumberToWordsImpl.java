package com.spellitout.impl;

import com.spellitout.builder.IntegerToNumberMapper;
import com.spellitout.interfaces.WholeNumberToWords;

import java.util.*;

/**
 * Created by sekhar on 27/12/16.
 */
public class WholeNumberToWordsImpl implements WholeNumberToWords {

    private final List<String> notations;
    private final IntegerToNumberMapper integerToNumberMapper;
    private static final Integer SPLIT_BASE = 1000;

    public WholeNumberToWordsImpl(List<String> notations, IntegerToNumberMapper integerToNumberMapper) {
	this.notations = notations;
	this.integerToNumberMapper = integerToNumberMapper;
    }

    @Override
    public String numberToWord(Integer number) throws IllegalArgumentException {
	if (number <= 0) {
	    throw new IllegalArgumentException("Number cannot be less than zero");
	} else {
	    List<Integer> numberSplits = splitNumber(number);
	    List<String> notations = getNotationList(numberSplits.size() - 1);
	    List<String> numberInWordsList = matchNotationsWithSplits(numberSplits, notations);
	    return joinWords(numberInWordsList);
	}
    }

    private String joinWords(List<String> numberInWordsList) {
	StringBuilder words = new StringBuilder();
	for (String word : numberInWordsList) {
	    words.append(word).append(" ");
	}
	return words.toString().trim();
    }

    /**
     * Splits the input number based on the base of 1000 Example : 1049875
     * splits into 1 49 875
     * 
     * @param number
     * @return
     */
    public List<Integer> splitNumber(Integer number) {
	List<Integer> numberSplits = new LinkedList<Integer>();
	while (number > 0) {
	    numberSplits.add(number % SPLIT_BASE);
	    number /= SPLIT_BASE;
	}
	Collections.reverse(numberSplits);
	return numberSplits;
    }

    /**
     * Returns the notation list contains (million, billion etc)
     * 
     * @param endIndex
     * @return
     */

    private List<String> getNotationList(int endIndex) {
	List<String> notationList = new LinkedList<String>();
	if (notations.size() >= endIndex) {
	    while (endIndex >= 0) {
		notationList.add(notations.get(endIndex--));
	    }
	}
	return notationList;
    }

    /**
     * Matches the notations with Splits(generated from the input number)
     * 
     * @param numberSplits
     * @param notations
     */

    private List<String> matchNotationsWithSplits(List<Integer> numberSplits, List<String> notations) {
	List<String> numberInWordsList = new ArrayList<String>();
	Iterator<Integer> splitsIterator = numberSplits.iterator();
	Iterator<String> notationsIterator = notations.iterator();
	while (splitsIterator.hasNext() && notationsIterator.hasNext()) {
	    Integer splitValue = splitsIterator.next();
	    String notationValue = notationsIterator.next();
	    if (splitValue > 0) {
		numberInWordsList.add(integerToNumberMapper.getWordsForNumber(splitValue));
		numberInWordsList.add(notationValue);
	    }
	}
	return numberInWordsList;
    }
}
