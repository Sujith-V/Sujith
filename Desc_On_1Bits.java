import java.util.*;
class Desc_On_1Bits.java
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> nums=new ArrayList<Integer>(),counts=new ArrayList<Integer>();
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      int x=sc.nextInt(),count=0;
      String s=Integer.toBinaryString(x);
      for(int j=0;j<s.length();j++)
      if(s.charAt(j)=='1')
      count++;
      nums.add(x);counts.add(count);
    }
    int len=counts.size();
    for(int i=0;i<len;i++)
    {
      int max=-1,max_num=nums.get(0),index=-1;
      for(int j=0;j<counts.size();j++)
      {
        if(counts.get(j)>max)
        {
          max=counts.get(j);
          max_num=nums.get(j);
          index=j;
        }
        else if(counts.get(j)==max)
        {
          if(nums.get(j)>max)
          {
            max_num=nums.get(j);
            index=j;
          }
        }
      }
      System.out.println(max_num);
      nums.remove(index);
      counts.remove(index);
      }
    }
  }
