import java.util.Scanner;
public class Division
{
    public static void main(String [] args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.print("enter the first number: ");
       int num1 = sc.nextInt();
       System.out.print("enter the second number: ");
       int num2 = sc.nextInt();
       System.out.print("Divion of two number: ");
       System.out.print(num1/num2);
    }
}