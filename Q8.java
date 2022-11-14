import java.util.Scanner;
public class Q8 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int x=sc.nextInt();
        for(int i=2;i<x;i++){
            Boolean a=true;
            for(int j=2;j<i;j++){
                if(i%j==0) {
                    a=false;
                    break;
                }
            }
            if(a) System.out.println(i);
        }
    }
}


