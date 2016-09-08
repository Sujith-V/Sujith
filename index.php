<?php
$name1="";$name2="";
if(isset($_REQUEST['name1']) && isset($_REQUEST['name2']))
{
  $name1=$_REQUEST['name1'];
  $name2=$_REQUEST['name2'];
}
function calculate()
{
  if(isset($_REQUEST['name1']) && isset($_REQUEST['name2']))
  {
    $sum=0;
    global $name1,$name2;
    $str=$name1.$name2;
    for($i=0;$i<strlen((String)str);$i=$i+1)
      $sum=($sum+ord($str[$i]))%100;
      return "Love Percentage : $x %";
  }
  return "";
}
?>
<html>
  <head>
    <title>Love Calculator</title>
    <script>
      function check()
      {
        var value=name1.value+name2.value;
        for(var i=0;i<value.length;i++)
        if(!((value.charAt(i)>='a'&&value.charAt(i)<='z')|| value.charAt(i)<='A'&&value.charAt(i)>='Z')||value.charAt(i)==' ')
      }
    </script>
  </head>
</html>
