package DrawShapes.shapes;

import DrawShapes.exceptions.NumberNotOddException;
import DrawShapes.exceptions.NumberNotPositiveException;
import DrawShapes.exceptions.NumberTooBigException;

public class SublimeLogo {
    private int size;

    public SublimeLogo(int size) throws NumberTooBigException, NumberNotPositiveException, NumberNotOddException {
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

    public void printSublimeLogo() {
        int spaceCount = 0;
        int starsCount = 0;
        spaceCount = 2 * size - starsCount;

        for (int i = 0; i < size; i++) {
            starsCount += 2;
            spaceCount = 2 * size - starsCount;
            System.out.print(repeatString(" ", spaceCount));
            System.out.println(repeatString("*", starsCount));

        }
        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                starsCount -= 2;
            } else {
                starsCount += 2;
            }
            spaceCount = 2 * size - starsCount;
            System.out.print(repeatString("*", starsCount));
            System.out.println(repeatString(" ", spaceCount));

        }
        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                starsCount -= 2;
            } else {
                starsCount += 2;
            }
            spaceCount = 2 * size - starsCount;
            System.out.print(repeatString(" ", spaceCount));
            System.out.println(repeatString("*", starsCount));

        }
        for (int i = 0; i < size; i++) {
            spaceCount += 2;
            starsCount = 2 * size - spaceCount;
            System.out.print(repeatString("*", starsCount));
            System.out.println(repeatString(" ", spaceCount));

        }
    }

    public static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);

        }
        return result.toString();
    }
}
