package DrawingFiguresWithLoops;

public class MM {

    private int size;

    public MM(int size) throws NumberNotOddException, NumberNotPositiveException {
        this.setSize(size);
    }

    public void setSize(int number) throws NumberNotOddException, NumberNotPositiveException {
        if (number < 2){
            throw new NumberNotPositiveException("Number cannot be negative or 1");
        }
        if (number % 2 == 0){
            throw new NumberNotOddException("Number must be odd!");
        }

        this.size = number;
    }

    public void printMM(){
        printUpperPart();
        printLowerPart();
    }

    private void printLowerPart() {
        for (int i = 0; i < size / 2 + 1; i++) {
            System.out.println(String.format("%s%s%s%s%s%s%s%s%s%s%s%s%s", repeatStr("-", size / 2 - i), repeatStr("*", size),
                    repeatStr("-", i + i + 1), repeatStr("*", size * 2 - 1 - i - i), repeatStr("-", i + i + 1),
                    repeatStr("*", size), repeatStr("-", size - i - i - 1), repeatStr("*", size),
                    repeatStr("-", i + i + 1), repeatStr("*", size * 2 - 1 - i - i), repeatStr("-", i + i + 1),
                    repeatStr("*", size), repeatStr("-", size / 2 - i)));
        }
    }

    private void printUpperPart() {
        for (int i = 0; i < size / 2 + 1; i++) {
            System.out.println(String.format("%s%s%s%s%s%s%s%s%s", repeatStr("-", size - i), repeatStr("*", size + i + i),
                    repeatStr("-", size - i - i), repeatStr("*", size + i + i), repeatStr("-", size * 2 - i - i),
                    repeatStr("*", size + i + i), repeatStr("-", size - i - i), repeatStr("*", size + i + i),
                    repeatStr("-", size - i)));
        }
    }

    private String repeatStr(String strToRepeat, int times) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < times; i++) {
            text.append(strToRepeat);
        }
        return text.toString();
    }
}
