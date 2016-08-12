import java.util.Scanner;
import java.util.ArrayList;
class hunter3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
ArrayList<Integer> list=new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
if(i==sc.nextInt())
list.add(i);
}
if(list.size()==0)
System.out.println(0);
else
for(int i:list)
System.out.println(i);
}
}
