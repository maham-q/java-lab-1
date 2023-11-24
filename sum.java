import java.util.Scanner;

public class sum {
    public static void main(String args[]){
        System.out.println("Enter a number between 0 and 1000");
        Scanner obj= new Scanner(System.in);
        int x=obj.nextInt();
        int n1=x%10;
        int r= x/10;
        int n2=r%10;
        r=r/10;
        int n3=r%10;
        r=r/10;
        int n4=r%10;
        int sum= n1+n2+n3+n4;
         System.out.println("Sum of " +x+ " is " +sum);
        
    }
}

