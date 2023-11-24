import java.util.Scanner;

public class array {
    public static void main(String args[]){
    int s, i, OddSum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		s = sc.nextInt();	
		int [] a = new int[s];
        System.out.print("Enter elements in an array : ");
        for(i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<s;j++)
        {
            if(a[j]%2!=0)
            {
                OddSum+=a[j];
            }
        }
        System.out.println("Odd sum: " +OddSum);
    }
}
