package com.spellitout.interfaces;

import java.util.List;
import java.util.Map;

/**
 * Created by sekhar on 27/12/16.
 */
public interface Names {

    Map<Integer,String> getIntegerToWordsMap();

    char digitsSeparator();

    List<String> notations();
}
