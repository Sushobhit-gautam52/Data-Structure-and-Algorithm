import java.util.*;
import java.io.*;

class GFG{
    static String replaceCharacter(String str,char c1, char c2) {
        if (str.length() == 1) {
            return str;
        }
        char x = str.charAt(0);
        if (str.charAt(0) == c1) {
            x = c2;
            str = c2 + str.substring(1);
        }

        return x + replaceCharacter(str.substring(1),
                c1, c2);
    }
    public static void main(String[] args)
    {
        String str = "abacd";
        char c1='a';
        char c2='x';
        replaceCharacter(str,c1,c2);
    }
}
