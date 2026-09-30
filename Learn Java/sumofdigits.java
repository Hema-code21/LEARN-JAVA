import java.io.*;
import java.util.*;
public class sumofdigits {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int s=0;
    while(n!=0){
        int r=n%10;
        s+=r;
        n=n/10;
        
        }
    System.out.print(s);
   }
}