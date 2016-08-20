
import java.util.*;
class Array_Subset
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<Integer> list1=new ArrayList<Integer>();
    ArrayList<Integer> list2=new ArrayList<Integer>();
    for(int i=0;i<n;i++)
    list1.add(sc.nextInt());
    n=sc.nextInt();
    for(int i=0;i<n;i++)
    list2.add(sc.nextInt());
    System.out.println(list1.containsAll(list2));
  }
}
