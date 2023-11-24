import java.util.Scanner;
public class table{
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner obj= new Scanner(System.in);
        int x=obj.nextInt();
        System.out.println("Table of " + x);
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*x);
        }
    }
}