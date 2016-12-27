package com.numberconvertor;

import com.numberconvertor.impl.NamesImpl;
import com.numberconvertor.impl.WholeNumberToWordsImpl;
import com.numberconvertor.interfaces.Names;
import com.numberconvertor.interfaces.WholeNumberToWords;

/**
 * Created by sekhar on 27/12/16.
 */
public class Driver {

    public static  void main(String[] args){

        Names implObject = new NamesImpl();
        WholeNumberToWords numberToWords = new WholeNumberToWordsImpl(implObject.forms());
        numberToWords.numberToWord(1234);

    }
}
