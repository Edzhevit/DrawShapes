package DrawShapes.shapes.base;

import DrawShapes.exceptions.NumberNotOddException;
import DrawShapes.exceptions.NumberNotPositiveException;
import DrawShapes.exceptions.NumberTooBigException;

public abstract class Shape implements Drawable {

    private int size;

    public Shape(int size) throws NumberTooBigException, NumberNotPositiveException, NumberNotOddException {
        this.setSize(size);
    }

    public int getSize() {
        return size;
    }

    protected void setSize(int number) throws NumberNotOddException, NumberNotPositiveException, NumberTooBigException {
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

    protected String repeatString(String stringToRepeat, int times) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < times; i++) {
            text.append(stringToRepeat);
        }
        return text.toString();
    }
}
