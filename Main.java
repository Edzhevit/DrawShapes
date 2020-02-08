package DrawingFiguresWithLoops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an odd number between 2 and 10000...");
        int n = Integer.parseInt(scanner.nextLine());
        try {
            MM mm = new MM(n);
            mm.printMM();
        } catch (NumberNotOddException | NumberNotPositiveException ex){
            System.out.println(ex.getMessage());
        }
    }
}
