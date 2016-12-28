package test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.spellitout.impl.WholeNumberToWordsImpl;

public class NumberToWordConverterTest {
    
    @Rule
    public ExpectedException thrown= ExpectedException.none();
    List<String> notations = new ArrayList<String>(Arrays.asList(" ","thousand","million","billion"));
    
    WholeNumberToWordsImpl impl = new WholeNumberToWordsImpl(notations);
   
    @Test(expected = IllegalArgumentException.class)
    public void throwsException(){
	impl.numberToWord(0);
    }
    
    @Test
    public void expectSomeOutput(){
	impl.numberToWord(1049875);
    }

}
