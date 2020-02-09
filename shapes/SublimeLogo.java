package DrawShapes.shapes;

import DrawShapes.exceptions.NumberNotOddException;
import DrawShapes.exceptions.NumberNotPositiveException;
import DrawShapes.exceptions.NumberTooBigException;
import DrawShapes.shapes.base.Drawable;
import DrawShapes.shapes.base.Shape;

public class SublimeLogo extends Shape implements Drawable {

    public SublimeLogo(int size) throws NumberTooBigException, NumberNotPositiveException, NumberNotOddException {
        super(size);
    }

    @Override
    public void drawShape() {
        int spaceCount;
        int starsCount = 0;
        spaceCount = 2 * getSize() - starsCount;

        for (int i = 0; i < getSize(); i++) {
            starsCount += 2;
            spaceCount = 2 * getSize() - starsCount;
            System.out.print(repeatString(" ", spaceCount));
            System.out.println(repeatString("*", starsCount));

        }
        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                starsCount -= 2;
            } else {
                starsCount += 2;
            }
            spaceCount = 2 * getSize() - starsCount;
            System.out.print(repeatString("*", starsCount));
            System.out.println(repeatString(" ", spaceCount));

        }
        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                starsCount -= 2;
            } else {
                starsCount += 2;
            }
            spaceCount = 2 * getSize() - starsCount;
            System.out.print(repeatString(" ", spaceCount));
            System.out.println(repeatString("*", starsCount));

        }
        for (int i = 0; i < getSize(); i++) {
            spaceCount += 2;
            starsCount = 2 * getSize() - spaceCount;
            System.out.print(repeatString("*", starsCount));
            System.out.println(repeatString(" ", spaceCount));

        }
    }
}
