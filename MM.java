package DrawingFiguresWithLoops;

public class MM {

    private int n;

    public MM(int n) throws NumberNotOddException, NumberNotPositiveException {
        this.setTimes(n);
    }

    public void setTimes(int n) throws NumberNotOddException, NumberNotPositiveException {
        if (n < 2){
            throw new NumberNotPositiveException("Number cannot be negative or 1");
        }
        if (n % 2 == 0){
            throw new NumberNotOddException("Number must be odd!");
        }
        this.n = n;
    }

    public void printMM(){
        printUpperPart();
        printLowerPart();
    }

    private void printLowerPart() {
        for (int i = 0; i < n / 2 + 1; i++) {
            System.out.println(String.format("%s%s%s%s%s%s%s%s%s%s%s%s%s", repeatStr("-", n / 2 - i), repeatStr("*", n),
                    repeatStr("-", i + i + 1), repeatStr("*", n * 2 - 1 - i - i), repeatStr("-", i + i + 1),
                    repeatStr("*", n), repeatStr("-", n - i - i - 1), repeatStr("*", n),
                    repeatStr("-", i + i + 1), repeatStr("*", n * 2 - 1 - i - i), repeatStr("-", i + i + 1),
                    repeatStr("*", n ), repeatStr("-", n / 2 - i)));
        }
    }

    private void printUpperPart() {
        for (int i = 0; i < n / 2 + 1; i++) {
            System.out.println(String.format("%s%s%s%s%s%s%s%s%s", repeatStr("-", n - i), repeatStr("*", n + i + i),
                    repeatStr("-", n - i - i), repeatStr("*", n + i + i), repeatStr("-", n * 2 - i - i),
                    repeatStr("*", n + i + i), repeatStr("-", n - i - i), repeatStr("*", n + i + i),
                    repeatStr("-", n - i)));
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
