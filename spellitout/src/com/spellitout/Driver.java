package com.spellitout;

import com.spellitout.impl.NamesImpl;
import com.spellitout.impl.WholeNumberToWordsImpl;
import com.spellitout.interfaces.Names;
import com.spellitout.interfaces.WholeNumberToWords;

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
