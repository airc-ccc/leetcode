<?php

$x = $argv[1] ?? 123;

echo reverse($x);

function reverse($x) {
	if ($x == 0) {
            return $x;
        }
	$arr = str_split($x);
	$result = [];
	$code = '';
	foreach($arr as $k => $v) {
		if ($v == '-') {
			$code = $v;
			continue;
		}
		array_unshift($result, $v);
	}
	if (! empty($code)) {
		array_unshift($result, $code);
	}
	$result = (int)implode('', $result);
	if (pow(-2, 31) <= $result && $result <= pow(2, 31)) {
		return $result;
	}
	return 0;
}
