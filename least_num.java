import java.util.Scanner;
import java.util.ArrayList;
class least_num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
ArrayList<Integer> list=new ArrayList<Integer>();
int i=0,k=sc.nextInt();
if(n<0)
  i=1;
for(;i<(n+"").length();i++)
list.add(Integer.parseInt((n+"").charAt(i)+""));
Collections.sort(list);
if(n<0)
{
  Collections.reverse(list);
  System.out.print('-');
}
if((n+"").length()<k)
System.out.println(n);
else
for(i=0;i<list.size()-k;i++)
System.out.print(list.get(i));
}
}
