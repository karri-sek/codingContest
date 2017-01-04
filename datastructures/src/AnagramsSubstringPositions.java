import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sekhar on 4/1/17.
 */
public class AnagramsSubstringPositions {

    static String  text = "BACDGABCDA";
    static String pattren = "ABCD";

    public Map<Character,Integer> pattrenHashMap = new HashMap<Character,Integer>();


    public static void main(String[] args){
        AnagramsSubstringPositions obj = new AnagramsSubstringPositions();
        obj.constructHashIndexes(pattren);
        obj.indexListOfAnagramSubString(pattren,text);
    }


    public  List<Integer> indexListOfAnagramSubString(String pattren, String text){
        List<Integer> listOfAnagramIndexSubstrings = new ArrayList<Integer>();

        for(int i=0;i<(text.length()-pattren.length());i++){
            System.out.print("  "+i);
            Map<Character,Integer> slidingWindowHash = getSlidingTextHashMap(i);
            if(isAnagramSubStringFound(slidingWindowHash)){
                listOfAnagramIndexSubstrings.add(i);
            }
        }
        System.out.print(listOfAnagramIndexSubstrings);
        return listOfAnagramIndexSubstrings;
    }

    public Map<Character,Integer> getSlidingTextHashMap(int startIndex){
        Map<Character,Integer> slidingMap = new HashMap<Character,Integer>();
        int index = 0;
        if(startIndex <text.length()) {
            while (index < pattren.length()) {
                if(slidingMap.get(text.charAt(startIndex)) == null){
                    slidingMap.put(text.charAt(startIndex),1);
                }else{
                    slidingMap.put(text.charAt(startIndex),slidingMap.get(text.charAt(startIndex))+1);
                }
                startIndex++;
                index++;
            }
        }
        return slidingMap;
    }

    public boolean isAnagramSubStringFound(Map<Character,Integer> slidingTextHashMap){
        if(pattrenHashMap.keySet().size() != slidingTextHashMap.keySet().size()){
            return false;
        }
        for(char c:slidingTextHashMap.keySet()){
            if(pattrenHashMap.keySet().contains(c)){
                if(pattrenHashMap.get(c) == slidingTextHashMap.get(c)){
                    continue;
                }else{
                    return false;
                }

            }else{
                return false;
            }
        }
        return true;
    }

    public void constructHashIndexes(String pattren){
        for(int i=0; i<pattren.length();i++){
            if(pattrenHashMap.get(pattren.charAt(i)) != null){
                int count = pattrenHashMap.get(pattren.charAt(i));
                pattrenHashMap.put(pattren.charAt(i),count +1);
            }else{
                pattrenHashMap.put(pattren.charAt(i),1);
            }
        }
    }

}
