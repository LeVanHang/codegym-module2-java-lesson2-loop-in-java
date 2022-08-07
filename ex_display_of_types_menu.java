import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ex_display_of_types_menu {
    public static void main(String[] args) {
        int choice = -1;
            Scanner input = new Scanner(System.in);
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left,botton-right");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                for (int i = 0; i <3 ; i++) {
                    System.out.println("* * * * * * *");
                }
                case 2:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                case 3:
                    for (int i =6; i >=1; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");

                        }
                        System.out.println();
                    }
                case 4:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 6; j > i ; j--) {
                            System.out.println(" ");
                        }
                        for (int h = -1; h < 2*i ; h++) {
                            System.out.println("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println(0);
                default:
                    System.out.println("No choice");

            }
    }
}