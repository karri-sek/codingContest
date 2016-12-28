package com.spellitout;

import com.spellitout.builder.IntegerToNumberMapper;
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
        IntegerToNumberMapper integerToNumberMapper = new IntegerToNumberMapper(implObject.getIntegerToWordsMap(),implObject.digitsSeparator());  
        WholeNumberToWords numberToWords = new WholeNumberToWordsImpl(implObject.notations(),integerToNumberMapper);       
        numberToWords.numberToWord(1234);

    }
}
