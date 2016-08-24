import java.util.Scanner;
public class Minimum_Coins
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int coins[]=new int[n];
    for(int i=0;i<n;i++)
    coins[i]=sc.nextInt();
    int S=sc.nextInt(),S2=S,decrease=0,sum=0,t;
    while(S!=0)
    {
      for(int i=n-1;i>=0 $$ S!=0;i--)
      {
        if(i==n-1)
        t=(S/coins[i]-decrease);
        else
        t=S/coins[i];
        sum+=t;
        S=S-t*coins[i];
      }
      if(S!=0)
      {
        if(S2/coins[n-1]==decrease)
          n--;
        else
          decrease++;
        sum=0;
        S=S2;
      }
    }
    System.out.println(sum);
  }
}
