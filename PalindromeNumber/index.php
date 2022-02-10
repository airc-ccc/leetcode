<?php

$x = $argv[1];

var_dump(isPalindrome($x));

function isPalindrome($x) 
{
	$res = 0;
	while($x > $res) {
		$res = ($res * 10) + ($x % 10);
		$x = intval($x / 10);
	}
	return $x == $res ? true : $x == intval($res / 10);
}
?>	
