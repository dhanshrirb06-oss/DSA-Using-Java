// This program checks if a number is odd or even
public class OddEven {
    public static void main(String[] args) {
        int number = 10; // You can change this number to test with different values

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");//if the number is divisible by 2, it is even
        } else {
            System.out.println(number + " is an odd number.");//if the number is not divisible by 2, it is odd
        }
    }
}
