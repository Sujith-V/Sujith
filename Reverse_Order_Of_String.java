import java.util.*;
class Reverse_Order_Of_String
{
  static String Reverse_Order(String str[])
  {
    String s="";
    for(int i=str.length-1;i>=0;i--)
    s+=str[i]+" ";
    return s;
  }
  public static void main(String args[])
  {
    String s=new Scanner(System.in).nextLine();
    if(s.isEmpty())
    {
      System.out.println("Input String is Empty");
      return;
    }
    String str[]=s.split(" ");
    System.out.println(Reverse_Order(s));
  }
}
