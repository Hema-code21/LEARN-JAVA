import java.io.*;
import java.util.*;
 public class evenoddarr {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];

    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    System.out.print("Even numbers:");
    for(int i=0;i<n;i++){
        if(a[i]%2==0){
            System.out.println(a[i]);
        }
    }
    System.out.print("Odd numbers:");
    for(int i=0;i<n;i++){
        if(a[i]%2!=0){
            System.out.println(a[i]);
    }
}
    }
}
