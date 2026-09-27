import java.io.*;
import java.util.*;
public class prime{
  public static void main(String[] arraysStrings){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  if(n<=1){
    System.out.print("Not a Prime number");
    return;
  }
  for(int i=2;i<Math.sqrt(n);i++){
    if(n%2==0){
      System.out.println("Not a Prime number");
      return;
    }
  }
  System.out.print("Prime");
  }
  }

