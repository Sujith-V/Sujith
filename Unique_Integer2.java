import java.util.*;
class Unique_Integer2
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int x=0,n=sc.nextInt();
  LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
  for(int i=0;i<n;i++)
  {
    x=sc.nextInt();
    if(!set.add(x))
    set.remove(x);
  }
  Iterator<Integer> itr=set.iterator();
  if(set.size()==0)
  {
    System.out.println("No numbers were found");
    return;
  }
  System.out.println(itr.next());
  }
}
