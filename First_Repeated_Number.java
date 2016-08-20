import java.util.ArraList;
import java.util.LinkedHashSet;
import java.util.Scanner;
class First_Repeated_Number
{
  Scanner sc=new Scanner(System.in);
  int x=0,n=sc.nextInt();
  LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
  for(int i=0;i<n;i++)
  {
    x=sc.nextInt();
    if(!set.add(x))
    break;
  }
  if(set.size()==0)
  {
    System.out.println("No numbers were found");
    return;
  }
  System.out.println(x);
}
