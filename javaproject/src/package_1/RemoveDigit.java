package package_1;

public class RemoveDigit {

    public static int lastDigit(int num) {
        return num % 10;
    }

    public static int firstDigit(int num) {
        while(num >= 10) {
            num = num / 10;
        }
        return num;
    }

    public static void main(String[] args) {
        int number = 78542;

        System.out.println("First Digit = " + firstDigit(number));
        System.out.println("Last Digit = " + lastDigit(number));
    }
}

