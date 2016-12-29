// Java program to count squares between a and b
class CountSquares
{

    public boolean solution(String S,String T) {
        int SLength = 0;
        int TLength = 0;

        String[] SParts = S.split("[^\\d]+");
        String[] TParts = T.split("[^\\d]+");

        for (int i = 0; i < SParts.length; i++) {
            if (!SParts[i].equals("")) {
                SLength += Integer.parseInt(SParts[i]);
            }
        }

        for (int i = 0; i < TParts.length; i++) {
            if (!TParts[i].equals("")) {
                TLength += Integer.parseInt(TParts[i]);
            }
        }

        for (int i = 0; i < S.length(); i++) {
            if (!Character.isDigit(S.charAt(i))) {
                SLength += 1;
            }
        }

        for (int i = 0; i < T.length(); i++) {
            if (!Character.isDigit(T.charAt(i))) {
                TLength += 1;
            }
        }

        if (TLength != SLength) {
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args){
        CountSquares obj = new CountSquares();
        System.out.println(obj.solution("ba1","1Ad"));
    }
}

