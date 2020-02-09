package DrawShapes.shapes;

import DrawShapes.exceptions.NumberNotOddException;
import DrawShapes.exceptions.NumberNotPositiveException;
import DrawShapes.exceptions.NumberTooBigException;

public class Sunglasses {

    private int size;

    public Sunglasses(int size) throws NumberTooBigException, NumberNotPositiveException, NumberNotOddException {
        this.setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int number) throws NumberNotOddException, NumberNotPositiveException, NumberTooBigException {
        if (number < 2){
            throw new NumberNotPositiveException("Number cannot be negative or 1");
        }
        if (number > 10000){
            throw new NumberTooBigException("Number must be less than 10000!");
        }
        if (number % 2 == 0){
            throw new NumberNotOddException("Number must be odd!");
        }
        this.size = number;
    }

    public void printSunglasses() {
        System.out.print(repeatString("*", size * 2));
        System.out.print(repeatString(" ", size));
        System.out.println(repeatString("*", size * 2));

        for (int i = 1; i <= size - 2; i++) {
            System.out.print(repeatString("*", size - size + 1));
            System.out.print(repeatString("/", size * 2 - 2));
            System.out.print(repeatString("*", size - size + 1));
            if (i == (size - 1) / 2) {
                System.out.print(repeatString("|", size));
            } else {
                System.out.print(repeatString(" ", size));
            }
            System.out.print(repeatString("*", size - size + 1));
            System.out.print(repeatString("/", size * 2 - 2));
            System.out.println(repeatString("*", size - size + 1));

        }
        System.out.print(repeatString("*", size * 2));
        System.out.print(repeatString(" ", size));
        System.out.println(repeatString("*", size * 2));
    }

    public static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
