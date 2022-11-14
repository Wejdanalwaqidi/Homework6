import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        String X;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The word : ");
        X=in.next();
        int n=0;
        for (int i=0;i<X.length();i++)
        {
            char r = X.charAt(i);
            if(r=='X'||r=='o'||r=='i'||r=='e'||r=='u'||r=='y')
                n++;
        }
        System.out.println(n);
    }
}


