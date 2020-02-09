package DrawShapes.shapes;

import DrawShapes.exceptions.NumberNotOddException;
import DrawShapes.exceptions.NumberNotPositiveException;
import DrawShapes.exceptions.NumberTooBigException;
import DrawShapes.shapes.base.Drawable;
import DrawShapes.shapes.base.Shape;

public class EiffelTower extends Shape implements Drawable {

    public EiffelTower(int size) throws NumberTooBigException, NumberNotPositiveException, NumberNotOddException {
        super(size);
    }

    @Override
    public void drawShape() {
        printUpperPart();
        printLowerPart();
    }

    private void printUpperPart() {
        for (int i = 0; i < getSize(); i++) {
            System.out.println(String.format("%s**%s", repeatString("-", getSize() + 2),
                    repeatString("-", getSize() + 2)));
        }
        for (int i = 0; i < getSize() - 3; i++) {
            System.out.println(String.format("%s****%s", repeatString("-", getSize() + 1),
                    repeatString("-", getSize() + 1)));
        }
        System.out.println(String.format("%s%s%s", repeatString("-", getSize()), repeatString("*", 6),
                repeatString("-", getSize())));
        for (int i = 0; i < getSize() - 4; i++) {
            System.out.println(String.format("%s**--**%s", repeatString("-", getSize()), repeatString("-", getSize())));
        }
    }

    private void printLowerPart() {
        for (int i = 0; i < getSize() - 3; i++) {
            System.out.println(String.format("%s**----**%s", repeatString("-", getSize() - 1), repeatString("-", getSize() - 1)));
        }
        System.out.println(String.format("%s%s%s", repeatString("-", getSize() - 2), repeatString("*", 10),
                repeatString("-", getSize() - 2)));
        for (int i = 0; i < getSize() - 3; i++) {
            System.out.println(String.format("%s**%s**%s", repeatString("-", getSize() - 3 - i), repeatString("-", 8 + 2 * i),
                    repeatString("-", getSize() - 3 - i)));
        }
        System.out.println(String.format("***%s***", repeatString("-", getSize() * 2)));
    }

}
