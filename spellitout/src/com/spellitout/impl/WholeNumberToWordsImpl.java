package com.spellitout.impl;

import com.spellitout.interfaces.WholeNumberToWords;

import java.util.*;

/**
 * Created by sekhar on 27/12/16.
 */
public class WholeNumberToWordsImpl implements WholeNumberToWords {

    private final List<String> forms;

    private static final Integer SPLIT_BASE = 1000;

    public WholeNumberToWordsImpl(List<String> forms) {
	this.forms = forms;
    }

    @Override
    public String numberToWord(Integer number) throws IllegalArgumentException {
	if (number <= 0) {
	    throw new IllegalArgumentException("Number cannot be less than zero");
	} else {
	    List<Integer> numberSplits = splitNumber(number);
	    List<String> notations = getNotationList(numberSplits.size() - 1);
	    matchNotationsWithSplits(numberSplits, notations);
	}
	return "";
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
	if (forms.size() >= endIndex) {
	    while (endIndex >= 0) {
		notationList.add(forms.get(endIndex--));
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

    private void matchNotationsWithSplits(List<Integer> numberSplits, List<String> notations) {
	Iterator<Integer> splitsIterator = numberSplits.iterator();
	Iterator<String> notationsIterator = notations.iterator();
	while (splitsIterator.hasNext() && notationsIterator.hasNext()) {

	}
    }
}
