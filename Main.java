import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Date: ");
        int date = scanner.nextInt();

        if (date%100==0){
            if (date%400==0){
                System.out.println("This is a leap yar.");
            }
            else {
                System.out.println("This is a not leap year.");
            }
        }
        else if (date%4==0) {
            System.out.println("This is a leap year.");
        }
        else {
            System.out.println("This is a not leap year.");
        }
    }
}