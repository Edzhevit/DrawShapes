package DrawShapes.shapes;

import DrawShapes.exceptions.NumberNotOddException;
import DrawShapes.exceptions.NumberNotPositiveException;
import DrawShapes.exceptions.NumberTooBigException;
import DrawShapes.shapes.base.Drawable;
import DrawShapes.shapes.base.Shape;

public class MM extends Shape implements Drawable {

    public MM(int size) throws NumberTooBigException, NumberNotPositiveException, NumberNotOddException {
        super(size);
    }

    @Override
    public void drawShape(){
        printUpperPart();
        printLowerPart();
    }

    private void printUpperPart() {
        for (int i = 0; i < getSize() / 2 + 1; i++) {
            System.out.println(String.format("%s%s%s%s%s%s%s%s%s", repeatString("-", getSize() - i), repeatString("*", getSize() + i + i),
                    repeatString("-", getSize() - i - i), repeatString("*", getSize() + i + i), repeatString("-", getSize() * 2 - i - i),
                    repeatString("*", getSize() + i + i), repeatString("-", getSize() - i - i), repeatString("*", getSize() + i + i),
                    repeatString("-", getSize() - i)));
        }
    }

    private void printLowerPart() {
        for (int i = 0; i < getSize() / 2 + 1; i++) {
            System.out.println(String.format("%s%s%s%s%s%s%s%s%s%s%s%s%s", repeatString("-", getSize() / 2 - i), repeatString("*", getSize()),
                    repeatString("-", i + i + 1), repeatString("*", getSize() * 2 - 1 - i - i), repeatString("-", i + i + 1),
                    repeatString("*", getSize()), repeatString("-", getSize() - i - i - 1), repeatString("*", getSize()),
                    repeatString("-", i + i + 1), repeatString("*", getSize() * 2 - 1 - i - i), repeatString("-", i + i + 1),
                    repeatString("*", getSize()), repeatString("-", getSize() / 2 - i)));
        }
    }
}
