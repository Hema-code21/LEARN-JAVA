import java.io.*;
import java.util.*;
public class palindrome{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int rev=0;
    int r=0,n1=n;
    while(n!=0){
        r=n%10;
        rev=rev*10+r;
        n=n/10;
    }
    System.out.println(rev==n1?"Palindrome":"Not a Palindrome");
    }
}