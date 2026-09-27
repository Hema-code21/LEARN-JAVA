import java.io.*;
import java.util.*;
public class armstrong {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int n1=n,n2=n;
    int c=0;
    while(n1!=0){
        n1=n1/10;
        c++;
    }
    int s=0;
    while(n2!=0){
        int r=n2%10;
        s+=Math.pow(r,c);
        n2=n2/10;
    }
    System.out.println(s==n?"Armstrong":"Not an armstrong");
    }
}
