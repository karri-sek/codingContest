package com.spellitout.builder;

import java.util.List;
import java.util.Map;

public class IntegerToNumberMapper {
    
    private final Map<Integer, String> integerToWordsMap;
    
    private final char digitsSeprator;
    
    public IntegerToNumberMapper(Map<Integer,String> integerToWordsMap, char digitsSeprator){
	this.integerToWordsMap = integerToWordsMap;
	this.digitsSeprator = digitsSeprator;
    }
    
    public String getWordsForNumber(Integer number) {
	if (integerToWordsMap.containsKey(number)) {
	    return integerToWordsMap.get(number);
	} else if (number > 20 && number < 100) {
	    return twoDigitNumberAsWord();
	} else if (number > 100 && number < 1000) {
	    return threeDigitNumberAsWord();
	}
    }
    
    private String twoDigitNumberAsWord(Integer number){
	
    }
    
    private String threeDigitNumberAsWord(Integer number){
	
    }
}
