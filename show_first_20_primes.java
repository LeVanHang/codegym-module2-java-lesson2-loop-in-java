import java.util.Scanner;

public class show_first_20_primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int count = 1;
        boolean check = false;
        if(number < 1) {
            System.out.println(" invalid number");
        } else if (number == 1) {
            System.out.println('2');
        }
        else {
            System.out.println("20 first prime: ");
            System.out.println('2');
            int i = 3;
            while (count < number){
                for (int j = 2; j <i; j++) {
                    if(i%2 == 0){
                        check = false;
                    }
                }
               if(check){
                   count++;
                   System.out.println(i);
               }
            }
           i++;
            check = true;
        }
    }
}
