import java.util.*;
class I_plus_J_equals_K
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),arr[]=new int[n];
    String s="";
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    for(int i=0;i<n;i++)
    for(int j=0;j<i;j++)
    for(int k=i;k<n;k++)
    if(arr[i]+arr[j]==arr[k])
    s=s+arr[j]+" + "+arr[i]+" = "+arr[k]+"\n";
    System.out.println((s=="")?"No numbers were found":s);
  }
}
