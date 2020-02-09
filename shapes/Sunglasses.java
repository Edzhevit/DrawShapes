package DrawShapes.shapes;

import DrawShapes.exceptions.NumberNotOddException;
import DrawShapes.exceptions.NumberNotPositiveException;
import DrawShapes.exceptions.NumberTooBigException;
import DrawShapes.shapes.base.Drawable;
import DrawShapes.shapes.base.Shape;

public class Sunglasses extends Shape implements Drawable {

    public Sunglasses(int size) throws NumberTooBigException, NumberNotPositiveException, NumberNotOddException {
        super(size);
    }

    @Override
    public void drawShape() {
        System.out.print(repeatString("*", getSize() * 2));
        System.out.print(repeatString(" ", getSize()));
        System.out.println(repeatString("*", getSize() * 2));

        for (int i = 1; i <= getSize() - 2; i++) {
            System.out.print(repeatString("*", + 1));
            System.out.print(repeatString("/", getSize() * 2 - 2));
            System.out.print(repeatString("*", + 1));
            if (i == (getSize() - 1) / 2) {
                System.out.print(repeatString("|", getSize()));
            } else {
                System.out.print(repeatString(" ", getSize()));
            }
            System.out.print(repeatString("*",  + 1));
            System.out.print(repeatString("/", getSize() * 2 - 2));
            System.out.println(repeatString("*", + 1));
        }
        System.out.print(repeatString("*", getSize() * 2));
        System.out.print(repeatString(" ", getSize()));
        System.out.println(repeatString("*", getSize() * 2));
    }
}
