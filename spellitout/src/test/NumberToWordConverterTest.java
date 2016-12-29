package test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
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

    @Test
    public  final void expectWordsFormOfGivenMillionNumber(){
        Assert.assertEquals("one million forty-nine thousand eight hundred seventy-five",impl.numberToWord(1049875));
    }

    @Test
    public final void whenNumberInThousandThenWordsShouldBeInThousandNotation(){
        Assert.assertEquals("twenty-three thousand two hundred twelve",impl.numberToWord(23212));
    }

    @Test
    public final void whenNumberis1ThenWordShouldBeone(){
        Assert.assertEquals("one",impl.numberToWord(1));
    }

    @Test
    public final void whenNumberis10ThenWordShouldBeTen(){
        Assert.assertEquals("ten",impl.numberToWord(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenNumberIsInNegativeExpectIllegalArgumentException(){
        impl.numberToWord(-1);
    }

}
