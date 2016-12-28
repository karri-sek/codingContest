package com.numberconvertor.builder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sekhar on 27/12/16.
 */
public class NamesBuilder {
    private Map<Integer, String> numberStringMap = new HashMap<Integer,String>();

    public static NamesBuilder namesBuilder(){
        return new NamesBuilder();
    }

    public NamesBuilder put(Integer number, String value){
        numberStringMap.put(number,value);
        return this;
    }

    public Map<Integer,String> build(){
        return numberStringMap;
    }
}
