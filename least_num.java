
class least_num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
if(s.charAt(0)=='-')
{
System.out.println(s);
return;
}
ArraList<Integer> list=new ArrayList<Integer>();
int k=sc.nextInt();
for(int i=0;i<s.length();i++)
list.add(Integer.parseInt(s.charAt(i)+""));
Collections.sort(list);
for(int i=0;i<set.size()-k;i++)
System.out.print(list.get(i));
}
}
