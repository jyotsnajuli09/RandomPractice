package Numbers;
import java.io.*;
import java.util.*;
 
// Class of ReverseString
class ReverseWords
{
    public static void main(String[] args)
    {
        String input = "Hello World";
 
        StringBuffer input1 = new StringBuffer();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1 = input1.reverse();
 
        // print reversed String
        for (int i=0; i<input1.length(); i++)
            System.out.print(input1.charAt(i));
    }
}

