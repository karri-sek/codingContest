package com.spellitout.builder;

import java.awt.font.NumericShaper.Range;
import java.util.Map;

public class IntegerToNumberMapper {

    private final Map<Integer, String> integerToWordsMap;

    private final char digitsSeprator;

    public IntegerToNumberMapper(Map<Integer, String> integerToWordsMap, char digitsSeprator) {
	this.integerToWordsMap = integerToWordsMap;
	this.digitsSeprator = digitsSeprator;
    }

    /**
     * Converts the given input number to words example: 49 will be forty-nine
     * 
     * @param number
     * @return
     */
    public String getWordsForNumber(Integer number) {
	if (integerToWordsMap.containsKey(number)) {
	    return integerToWordsMap.get(number);
	} else if (number > 20 && number < 100) {
	    return twoDigitNumberAsWord(number);
	} else if (number > 100 && number < 1000) {
	    return threeDigitNumberAsWord(number);
	}
	return null;
    }

    /**
     * Converts the two digit number into word form
	 * call recursively the method getWordsForNumber till get a map from integerToWordsMap.
     * 
     * @param number
     * @return
     */
    private String twoDigitNumberAsWord(Integer number) {
	Integer units = number % 10;
	Integer tens = number - units;
	return (getWordsForNumber(tens) + digitsSeprator + getWordsForNumber(units));
    }

    /**
     * Convert the three digit number into word form
     * 
     * @param number
     * @return
     */
    private String threeDigitNumberAsWord(Integer number) {
	Integer tens = number % 100;
	Integer hundreds = number - tens;
	return (getWordsForNumber(hundreds) + " " + getWordsForNumber(tens));
    }

}
