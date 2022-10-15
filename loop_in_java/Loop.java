package loop_in_java;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
int sum = 1;
int number;
Scanner scanner = new Scanner(System.in);
do {
    System.out.println("Enter a number: ");
    number = scanner.nextInt();
    sum = sum + number;
} while (number != 0);
        System.out.println("The sum is: " + sum);
    }
}