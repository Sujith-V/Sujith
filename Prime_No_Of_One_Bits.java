import java.util.Scanner;
public class Prime_No_Of_One_Bits
{
  static boolean isPrime(int n)
  {
    if(n==0 || n==1) return false;
    for(int i=2;i<=n/2;i++)
      if(n%i==0)
        return false;
    return true;
  }
  static int No_Of_Int(int start,int end)
  {
    int count=0;
    for(int i=start;i<=end;i++)
    {
      int c=0;
      String s=Integer.toBinaryString(i);
      for(int j=0;j<s.length();j++)
      if(s.charAt(j)=='1')
      c++;
      if(isPrime(c))
      count++;
    }
    return count;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int start=sc.nextInt(),end=sc.nextInt();
    if(start>end || start<=0 || end<=0)
    System.out.println("Invalid Data");
    else
    System.out.println(No_Of_Int(start,end));
  }
}
