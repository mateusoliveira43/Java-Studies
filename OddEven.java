public class OddEven {

    public static void printOddEvenNumbers(int start, int end, boolean odd) {
        String msg;
        if (odd) {
            msg = "Odd numbers from " + start + " to " + end + ":";
            if (start % 2 == 0) {
                start += 1;
            }
        } else {
            msg = "Even numbers from " + start + " to " + end + ":";
            if (start % 2 == 1) {
                start += 1;
            }
        }
        System.out.println(msg);
        for (int i = start; i <= end; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printOddEvenNumbers(0, 10, true);
        printOddEvenNumbers(0, 10, false);
    }
}
