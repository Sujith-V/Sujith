import java.util.Iterator;
import java.util.LinkedHashSet;
impot java.util.Scanner;
public class Unique_Integer
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x,n=sc.nextInt();
LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
for(int i=0;i<n;i++)
{
x=sc.nextInt();
if(!set.add(x))
set.remove(x);
}
Iterator itr=set.iterator();
System.out.println(itr.next());
}
}
