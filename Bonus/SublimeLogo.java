package OldExams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SublimeLogo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int spaceCount = 0;
        int starsCount = 0;
        spaceCount = 2 * n - starsCount;

        for (int i = 0; i < n; i++) {
            starsCount+=2;
            spaceCount = 2 * n - starsCount;
            System.out.print(repeatString(" ", spaceCount));
            System.out.println(repeatString("*", starsCount));

        }
        for (int i = 0; i < 4; i++) {
            if (i < 2){
                starsCount-=2;
            } else {
                starsCount+=2;
            }
            spaceCount = 2 * n - starsCount;
            System.out.print(repeatString("*", starsCount));
            System.out.println(repeatString(" ", spaceCount));

        }
        for (int i = 0; i < 4; i++) {
            if (i < 2){
                starsCount-=2;
            } else {
                starsCount+=2;
            }
            spaceCount = 2 * n - starsCount;
            System.out.print(repeatString(" ", spaceCount));
            System.out.println(repeatString("*", starsCount));
            
        }
        for (int i = 0; i < n; i++) {
            spaceCount+=2;
            starsCount = 2 * n - spaceCount;
            System.out.print(repeatString("*", starsCount));
            System.out.println(repeatString(" ", spaceCount));

        }


    }
    public static String repeatString(String text, int count){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);

        }
        return result.toString();
    }
}
