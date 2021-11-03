package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.lang.StringBuffer;
public class Main {

    public static String delete(String str,String substr)
    {
        StringBuffer sb = new StringBuffer(str);
        String s = str.replaceAll(substr,"");
        return s;
    }
    public static void main(String[] args) {

        String str = "kaszgnkaszzssz";
        String substr ="sz";
        System.out.println(delete(str,substr));

    }
}
