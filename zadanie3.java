package pl.edu.uwm.wmii.kordowskijakub.kolokwium01;
import java.lang.StringBuffer;

public class zadanie3 {
    public static void main(String[] args){
        String s = "middle";
        System.out.println(modify(s));
        String ss = "ada";
        System.out.println(modify(ss));
    }
    public static String modify(String str){
        StringBuffer wynik = new StringBuffer();
        int i = str.length()/2;
        if(str.length()%2!=0){
            return str;
        }
        else{
            wynik.append(str);
            str = str.toUpperCase();
            wynik.setCharAt(i-1, str.charAt(i-1));
            wynik.setCharAt(i, str.charAt(i));
        }
        return wynik.toString();
    }
}
