import java.util.Scanner;
public class ftoc {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner obj= new Scanner(System.in);
        int f=obj.nextInt();
        float c= (f-32)*5/9;
        System.out.println(f + " degree fahrenheit is equal to " + c +" celsius");
    }
}
