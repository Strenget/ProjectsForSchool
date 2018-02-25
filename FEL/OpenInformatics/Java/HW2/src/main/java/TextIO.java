import java.util.Scanner;

public class TextIO {

    public static boolean isInteger(String s){
        boolean ret = true;
        try{
            Integer.parseInt(s);
        }catch (NumberFormatException e){
            ret = false;
        }
        return ret;
    }


    public static boolean isFloat(String s){
        boolean ret = true;
        try {
            Float.parseFloat(s);
        }catch (NumberFormatException e){
            ret = false;
        }
        return ret;
    }

    public static boolean isDouble(String s){
        boolean ret = true;
        try {
            Double.parseDouble(s);
        }catch (NumberFormatException e){
            ret = false;
        }
        return ret;
    }

    public String getLine(){
        return stdin.hasNext() ? stdin.nextLine() : "EOF";
    }

    public TextIO(){
        stdin = new Scanner(System.in);
    }

    Scanner stdin;
}