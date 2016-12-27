package com.numberconvertor.impl;

import com.numberconvertor.interfaces.WholeNumberToWords;

import java.util.*;

/**
 * Created by sekhar on 27/12/16.
 */
public class WholeNumberToWordsImpl implements WholeNumberToWords {

    private final List<String> forms;

    private static final Integer SPLIT_BASE = 1000;

    public WholeNumberToWordsImpl(List<String> forms){
        this.forms=forms;
    }

    @Override
    public String numberToWord(Integer number) throws IllegalArgumentException{
        if(number <=0){
            throw new IllegalArgumentException("Number cannot be less than zero");
        }else{
            List<Integer> numberSplits = splitNumber(number);
            List<String> formsToUse = forms.subList(0,numberSplits.size());
            Collections.reverse(formsToUse);
        }
        return "";
    }

    public List<Integer> splitNumber(Integer number) {
        List<Integer>  numberSplits = new LinkedList();

        while (number > 0) {
            numberSplits.add(number % SPLIT_BASE);
            number /= SPLIT_BASE;
        }
        Collections.reverse(numberSplits);
        return numberSplits;
    }
}
