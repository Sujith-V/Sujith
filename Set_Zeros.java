import java.util.Scanner;
public class Set_Zeros
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n<=0)
    {
      System.out.println("No matrix is created");
      return;
    }
    int arr[][]=new int[n][n],arr2[][]=new int[n][n];
    for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
    {
      arr[i][j]=sc.nextInt();
      arr2[i][j]=arr[i][j];
    }
    for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
    {
      if(arr[i][j]==0)
      for(int k=0;k<n;k++)
      arr[i][k]=0;
      if(arr2[j][i]==0)
      for(int k=0;k<n;k++)
      arr2[k][i]=0;
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      System.out.print(arr[i][j]*arr2[i][j]+" ");
      System.out.print("\n");
    }
  }
}
