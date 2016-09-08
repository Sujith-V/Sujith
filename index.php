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
<script type="text/javascript">
function check()
{
	var value=name1.value.trim()+name2.value.trim();
	value=value.toLowerCase();
	for(var i=0;i<value.length;i++)
		if(!((value.charAt(i)>='a'&&value.charAt(i)<='z')||(value.charAt(i)>='A'&&value.charAt(i)<='Z')||value.charAt(i)==' '))
		{
			window.alert("Only Alphabets are allowed");
			return false;
		}
	return true;
}
</script>
</head>
<body align="center">
<fieldset style="display:inline-block;">
<form onsubmit="return check()">
<table >
	<tr>
		<td align="right">Your Name : </td>
		<td align="left"><input required type="text" id="name1" name="name1" value="<?php echo $name1; ?>"/></td>
	</tr>
	<tr></tr>
	<tr>
		<td align="right">Partner Name : </td>
		<td align="left"><input required type="text" id="name2" name="name2" value="<?php echo $name2; ?>"/></td>
	</tr>
	<tr></tr>
	<tr>
		<td></td>
		<td align="left">
			<input type="submit" value="Calulate"/>
			<input type="reset" value="Reset"/>
		</td>
	</tr>
	<tr>
		<td colspan="2"><h1><?php echo calculate(); ?></h1></td>
	</tr>
</table>
</form>
</fieldset>
</body>
</html>
