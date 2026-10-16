import java.util.Scanner;
public class Calculator {
    int add (int a, int b) {
        return a + b;

    }
    int add (int x, int y, int z) {
        return x + y + z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum of two numbers is: " + c.add(a,b));

            System.out.println("Enter three numbers:");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z= sc.nextInt();
            System.out.println("Sum of three numbers is: " + c.add(x, y,z));

        }
    }
