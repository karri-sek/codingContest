package test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import com.spellitout.builder.IntegerToNumberMapper;
import com.spellitout.impl.NamesImpl;
import com.spellitout.impl.WholeNumberToWordsImpl;
import com.spellitout.interfaces.Names;

public class NumberToWordConverterTest {
    
    Names implObject = new NamesImpl();      
    IntegerToNumberMapper integerToNumberMapper = new IntegerToNumberMapper(implObject.getIntegerToWordsMap(),implObject.digitsSeparator());    
    List<String> notations = new ArrayList<String>(Arrays.asList(" ","thousand","million","billion"));   
    
    WholeNumberToWordsImpl impl = new WholeNumberToWordsImpl(notations,integerToNumberMapper);
   
    @Test(expected = IllegalArgumentException.class)
    public void throwsException(){
	impl.numberToWord(0);
    }
    
    @Test
    public void expectSomeOutput(){
	impl.numberToWord(1049875);
    }

}
