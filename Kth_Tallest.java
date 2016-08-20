import java.util.*;
class Kth_Tallest
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[50];
    for(int i=0;i<50;i++)
    arr[i]=sc.nextInt();
    int k=sc.nextInt();
    System.out.println("4th Tallest : "+arr[arr.length-4]+"\n"+k+"th Tallest : "+arr[arr.length-k]);
  }
}
