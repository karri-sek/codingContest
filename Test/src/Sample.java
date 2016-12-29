/**
 * Created by sekhar on 26/12/16.
 */
public class Sample {

    public static void main(String[] args){
        Sample obj = new Sample();
        System.out.println(obj.Solution("a10","10a"));
        System.out.println("1  "+obj.getNumber("ab10"));
        System.out.println("2  "+obj.getNumber("10a"));
        System.out.println("3  "+obj.transformString("ab5"));
        System.out.println("4  "+obj.transformString("10ab"));
    }

    public boolean Solution(String S, String T){

        String str1 = transformString(S);
        String str2 = transformString(T);

        if (str1.length() != str2.length()) {
            return true;
        }

        for (int i=0 ; i < str1.length() ; i++) {
            if (str1.charAt(i) != '?' && str2.charAt(i) != '?' && str1.charAt(i) != str2.charAt(i))
                return false;
        }

        return true;
    }

    /* Get string with number at the beginning of it and returns the number value. for example: "120ab" --> 120 */
    public int getNumber(String str) {
        int size = str.length();
        int value = 0;

        for (int i=0 ; i < size ; i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return value;
            }
            value *= 10;
            value += (str.charAt(i)-'0');
        }
        return value;
    }

    public String transformString(String str){
        int i = 0;
        int j = 0;
        char[] charArray = new char[100];
        while(i<str.length()){
            if((str.charAt(i) >= 'a' && str.charAt(i) <='z') || (str.charAt(i) >= 'A' && str.charAt(i) <='Z')){
                charArray[j] = str.charAt(i);
                i++;
                j++;
            }else if(str.charAt(i) >= '0' && str.charAt(i) <='9'){
                int value = getNumber(str);
                for (int t=0 ; t < value ; t++) {
                    charArray[j] = '?';
                    j++;
                }
                while (i<str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    i++;
                }

            }
        }
        return new String(charArray);
    }
}
