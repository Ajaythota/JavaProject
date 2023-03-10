import java.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main (String [] args){

        String input="hello in inthe";
        String regex="\\b(\\w+)(\\W+\\1\\b)+";

        // Step 1: Compile a regex via static method Pattern.compile(), default is case-sensitive
        Pattern pattern= Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        // Step 2: Allocate a matching engine from the compiled regex pattern,
        //         and bind to the input string
        Matcher M= pattern.matcher(input);

        // Step 3: Perform matching and Process the matching results
        // Try Matcher.find(), which finds the next match

        while(M.find()){
            input=input.replaceAll(M.group(),M.group(1));
        }

        System.out.println(input);

    }
}
