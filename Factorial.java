public class Factorial {
    public static int factorial(int arg) {
        if (arg < 2) {
            return 1;
        }
        return arg * factorial(arg - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
    }
}
