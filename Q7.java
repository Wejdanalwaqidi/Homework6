import java.util.Scanner;
public class Q7 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int X=sc.nextInt();
        int n=X;
        while(n!=0){
            System.out.println(n%2);
            n/=2;
        }
    }
}


