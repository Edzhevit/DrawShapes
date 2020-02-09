package DrawShapes;

import DrawShapes.exceptions.NumberNotOddException;
import DrawShapes.exceptions.NumberNotPositiveException;
import DrawShapes.exceptions.NumberTooBigException;
import DrawShapes.shapes.EiffelTower;
import DrawShapes.shapes.MM;
import DrawShapes.shapes.SublimeLogo;
import DrawShapes.shapes.Sunglasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to DrawShapes Game! Choose a shape to draw.");
        System.out.println("Type MM, Eiffel, Sublime or Sunglasses please...");
        String shape = scanner.nextLine().toLowerCase();
        int size;

        while (!shape.equalsIgnoreCase("Exit")) {
            System.out.println("Please enter an odd number between 2 and 10000...");
            size = Integer.parseInt(scanner.nextLine());
            try {
                switch (shape) {
                    case "mm":
                        MM mm = new MM(size);
                        mm.printMM();
                        break;
                    case "eiffel":
                        EiffelTower eiffelTower = new EiffelTower(size);
                        eiffelTower.printEiffelTower();
                        break;
                    case "sublime":
                        SublimeLogo sublime = new SublimeLogo(size);
                        sublime.printSublimeLogo();
                        break;
                    case "sunglasses":
                        Sunglasses sunglasses = new Sunglasses(size);
                        sunglasses.printSunglasses();
                        break;
                }
                System.out.println("Try Again!");
                System.out.println("Type MM, Eiffel, Sublime, Sunglasses or type Exit to quit the game...");
                shape = scanner.nextLine();
            } catch (NumberNotOddException | NumberTooBigException | NumberNotPositiveException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
