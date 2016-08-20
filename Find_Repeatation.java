import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Find_Repeatation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
ArrayList<Integer> list=new ArrayList<Integer>();
LinkedHashSet<Integer> set=new LinkedHashSet();
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
int x=sc.nextInt();
if(!set.add(x))
if(!list.contains(x))
list.add(x);
}
if(list.size()==0)
{
  System.out.println("No repeated numbers found");
  return 0;
}
for(int i:list)
System.out.println(i);
}
}
