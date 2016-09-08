<?php
$name1="";$name2="";
if(isset($_REQUEST['name1']) && isset($_REQUEST['name1']))
{
	$name1=$_REQUEST['name1'];
	$name2=$_REQUEST['name2'];
}
function calculate()
{
	if(isset($_REQUEST['name1']) && isset($_REQUEST['name1']))
	{
		$x=0;$c=0;
		$flames="flames";
		global $name1,$name2;
		$name1=strtolower(trim(str_replace(' ','',$name1)));
		$name2=strtolower(trim(str_replace(' ','',$name2)));

		$count=strlen($name1)+strlen($name2);
		for($i=0;$i<strlen($name1);$i=$i+1)
			for($j=0;$j<strlen($name2);$j=$j+1)
				if($name1[$i]==$name2[$j])
				{
					$count=$count-2;
					$name1=str_replace($name1[$i],'',$name1);
					$name2=str_replace($name2[$j],'',$name2);
					$i=$i-1;
					$j=strlen($name2);
				}
		if($count<=0)
			return "No odd characters found";
		for($i=0;strlen($flames)>1;$i=($i+1)%strlen($flames))
		{
			$c=$c+1;
			if($c==$count)
			{
				$c=0;
				$flames=str_replace($flames[$i],'',$flames);
				$i=$i-1;
			}
		}
		switch($flames)
		{
			case "f":
			return "Friends !";
			case "l":
			return "Lovers !";
			case "a":
			return "Affectionate !";
			case "m":
			return "Marriage !";
			case "e":
			return "Enemies !";
			case "s":
			return "Siblings !";
		}
		return $flames;
	}
	return "";
}
?>
<html>
<head>
<title>Flames</title>
<script type="text/javascript">
function check()
{
	var value=name1.value.trim()+name2.value.trim();
	value=value.toLowerCase();
	for(var i=0;i<value.length;i++)
		if(!((value.charAt(i)>='a'&&value.charAt(i)<='z')||(value.charAt(i)>='A'&&value.charAt(i)<='Z')))
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
			<input type="submit" value="Find"/>
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
