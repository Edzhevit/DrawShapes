package DrawShapes.shapes;

import DrawShapes.exceptions.NumberNotOddException;
import DrawShapes.exceptions.NumberNotPositiveException;
import DrawShapes.exceptions.NumberTooBigException;

public class EiffelTower {

    private int size;

    public EiffelTower(int size) throws NumberTooBigException, NumberNotPositiveException, NumberNotOddException {
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

    public void printEiffelTower(){
        for (int i = 0; i < size; i++) {
            System.out.println(String.format("%s**%s", repeatString("-", size + 2),
                    repeatString("-", size+2)));

        }

        for (int i = 0; i < size - 3; i++) {
            System.out.println(String.format("%s****%s", repeatString("-", size + 1),
                    repeatString("-", size + 1)));

        }
        System.out.println(String.format("%s%s%s",repeatString("-", size),repeatString("*", 6),
                repeatString("-", size)));

        for (int i = 0; i < size - 4; i++) {
            System.out.println(String.format("%s**--**%s",repeatString("-", size),repeatString("-", size)));

        }

        for (int i = 0; i < size - 3; i++) {
            System.out.println(String.format("%s**----**%s", repeatString("-", size-1),repeatString("-", size-1)));

        }

        System.out.println(String.format("%s%s%s", repeatString("-", size-2), repeatString("*", 10),
                repeatString("-", size-2)));

        for (int i = 0; i < size-3; i++) {
            System.out.println(String.format("%s**%s**%s", repeatString("-", size - 3 - i),repeatString("-", 8 + 2 * i),
                    repeatString("-", size -3 -i)));

        }

        System.out.println(String.format("***%s***", repeatString("-", size*2)));
    }


    public static String repeatString(String text, int count){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);

        }
        return result.toString();
    }
}
