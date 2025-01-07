import java.util.Scanner;
public class Addition
{
     public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the first number:");
      int num1 = sc.nextInt();
      System.out.print("enter the second number:");
      int num2 = sc.nextInt();
      System.out.print("Adding two number:");
      System.out.println(num1+num2);
     }

}