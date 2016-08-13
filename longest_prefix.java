import java.util.Scanner;
class longest_prefix
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s="",str[]=sc.nextLine().split(" ");
    int count=0;
    for(int i=0;i<str.length-1;i++)
    {
      for(int j=i+1;j<str.length;j++)
      {
        count=0;
        for(int k=0;k<str[i].length()&&k<str[j].length();k++)
          if(str[i].charAt(k)==str[j].charAt(k))
            count++;
          else
            break;
        if(count>s.length())
          s=str[i].substring(0,count);
      }
    }
    if(s=="")
    System.out.println("null");
    else
    System.out.println(s);
  }
}
