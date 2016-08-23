import java.util.*;
class Seed
{
  public static void main(String args[])
  {
    int n=new Scanner(System.in).nextInt();
    if(n<=0)
    {
      System.out.println("Number should be greater than zero");
      return;
    }
    for(int i=1;i<=n;i++)
    {
      String s=i+"";
      int t=1;
      for(int j=0;j<s.length();j++)
      t*=Integer.parseInt(s.charAt(j)+"");
      if(i*t==n)
      System.out.println(i);
    }
  }
}
