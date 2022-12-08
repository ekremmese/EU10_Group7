public class Benjamin_Math {

    public static void main(String[] args) {
        System.out.println(remainingBy11(98765));
        System.out.println(divisibleBy9(4512587));
    }

    public static int remainingBy11 (int number) {
        int result = number%11;
        return result;
    }

    public static boolean divisibleBy9 (int number) {
        boolean result = false;
        if (number%9 == 0) {
            result = true;
        }
        return result;
    }

}
