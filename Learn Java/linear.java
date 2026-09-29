import java.io.*;
import java.util.*;
public class linear {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int key=sc.nextInt();
    for(int i=0;i<n;i++){
        if(a[i]==key){
            System.out.print("Key found at "+(i+1));
            return;
        }
    }
    System.out.println("Key not found");
    }
}
