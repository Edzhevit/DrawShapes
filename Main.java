package DrawShapes;

import DrawShapes.exceptions.NumberNotOddException;
import DrawShapes.exceptions.NumberNotPositiveException;
import DrawShapes.exceptions.NumberTooBigException;
import DrawShapes.shapes.*;
import DrawShapes.shapes.base.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to DrawShapes Game! Choose a shape to draw.");
        System.out.println("Type MM, Eiffel, Sublime or Sunglasses please...");
        String input = scanner.nextLine().toLowerCase();
        int size;

        while (!input.equalsIgnoreCase("Exit")) {
            System.out.println("Please enter an odd number between 2 and 10000...");
            size = Integer.parseInt(scanner.nextLine());
            Shape shape;
            try {
                switch (input) {
                    case "mm":
                        shape = new MM(size);
                        shape.drawShape();
                        break;
                    case "eiffel":
                        shape = new EiffelTower(size);
                        shape.drawShape();
                        break;
                    case "sublime":
                        shape = new SublimeLogo(size);
                        shape.drawShape();
                        break;
                    case "sunglasses":
                        shape = new Sunglasses(size);
                        shape.drawShape();
                        break;
                }
                System.out.println("Try Again!");
                System.out.println("Type MM, Eiffel, Sublime, Sunglasses or type Exit to quit the game...");
                input = scanner.nextLine();
            } catch (NumberNotOddException | NumberTooBigException | NumberNotPositiveException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
