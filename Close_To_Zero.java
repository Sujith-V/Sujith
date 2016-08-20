import java.util.*;
class Close_To_Zero
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int x=0,y=0,n=sc.nextInt();
    if(n==0)
    {
      System.out.println("Input list is empty");
      return;
    }
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    Arrays.sort(arr);
    int diff=arr[arr.length-1];
    for(int i=0;i<n-1;i++)
    for(int j=i+1;j<n;j++)
    if(Math.abs(arr[i]+arr[j]<diff)
    {
      x=arr[i];
      y=arr[j];
      diff=Math.abs(x+y);
    }
    System.out.println(x+" "+y);
  }
}
