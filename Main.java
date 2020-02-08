package DrawingFiguresWithLoops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an odd number between 2 and 10000...");
        int size = Integer.parseInt(scanner.nextLine());
        try {
            MM mm = new MM(size);
            mm.printMM();
        } catch (NumberNotOddException | NumberNotPositiveException ex){
            System.out.println(ex.getMessage());
        }
    }
}
