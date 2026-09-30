import java.io.*;
import java.util.*;
public class selection {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
        int m=i;
        for(int j=i+1;j<n;j++){
            if(a[m]>a[j]){
                m=j;
            }
            
        }
        int temp=a[i];
        a[i]=a[m];
        a[m]=temp;
    }
    for(int i:a){
        
      System.out.println(i+" ");
    }
    }
}
