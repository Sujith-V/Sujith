import java.math.BigInteger;
public class BigInteger1
{
  static boolean isPrime(BigInteger n)
  {
    BigInteger val0=new BigInteger("0"),val1=new BigInteger("1"),val2=new BigInteger("2"),limit=n.divide(val2);
    for(BigInteger i=new BigInteger("2");i.compareTo(limit)==-1;i=i.add(val1))
    {
      if(n.remainder(i).equals(val0))
      return false;
    }
    return true;
  }
  public static void main(String args[])
  {
    int sum=0;
    BigInteger n=new BigInteger("99999999999"),val=new BigInteger("1");
    for(BigIntger i=new BigInteger("2");true;i=i.add(val))
    {
      if(isPrime(i))
      {
        String s=i+"":
        sum=0;
        for(int j=0;j<s.length();j++)
        sum+=Integer.parseInt(s.charAt(j)+"");
      }
      if(sum<100)
      System.out.println(i);
      else
      break;
    }
  }
}
