import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int x= sc.nextInt();
        System.out.print("Enter another number: ");
        int y= sc.nextInt();
         System.out.print("Enter operator: ");
        char op = sc.next().charAt(0);
        if(op=='+')
        {
            System.out.print("Sum: " + (x+y));
        }
        else if(op=='-')
        {
            System.out.print("Subtraction: " + (x-y));
        }
        else if(op=='*')
        {
            System.out.print("Product: " + (x*y));
        }
        else if(op=='/')
        {
            System.out.print("Division: " + (x/y));
        }
        else
        {
            System.out.print("Invalid" );
        }
		
    }
}
