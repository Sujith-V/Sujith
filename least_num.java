
class least_num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
ArraList<Integer> list=new ArrayList<Integer>();
int i=0,k=sc.nextInt();
if(s.charAt(0)=='-')
  i=1;
for(;i<s.length();i++)
list.add(Integer.parseInt(s.charAt(i)+""));
Collections.sort(list);
if(s.charAt(0)=='-')
{
  Collections.reverse(list);
  System.out.print('-');
}
for(i=0;i<set.size()-k;i++)
System.out.print(list.get(i));
}
}
