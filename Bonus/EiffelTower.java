package OldExams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EiffelTower {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            System.out.println(String.format("%s**%s", repeatString("-", n + 2),
                    repeatString("-", n+2)));

        }
        for (int i = 0; i < n - 3; i++) {
            System.out.println(String.format("%s****%s", repeatString("-", n + 1),
                    repeatString("-", n + 1)));

        }
        System.out.println(String.format("%s%s%s",repeatString("-", n),repeatString("*", 6),
                repeatString("-", n)));
        for (int i = 0; i < n - 4; i++) {
            System.out.println(String.format("%s**--**%s",repeatString("-", n),repeatString("-", n)));
            
        }
        for (int i = 0; i < n - 3; i++) {
            System.out.println(String.format("%s**----**%s", repeatString("-", n-1),repeatString("-", n-1)));

        }
        System.out.println(String.format("%s%s%s", repeatString("-", n-2), repeatString("*", 10),
                repeatString("-", n-2)));
        for (int i = 0; i < n-3; i++) {
            System.out.println(String.format("%s**%s**%s", repeatString("-", n - 3 - i),repeatString("-", 8 + 2 * i),
                    repeatString("-", n -3 -i)));

        }
        System.out.println(String.format("***%s***", repeatString("-", n*2)));

    }
    public static String repeatString(String text, int count){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);

        }
        return result.toString();
    }
}
