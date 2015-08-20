<!DOCTYPE HTML>
<html lang="pl">
<head>
	<meta charset="utf-8"/>
	<title>Podsumowanie zamówienia</title>
</head>
<body>

<?php

	$x = $_POST['plotek'];    //wysyła dane z formularza index w paczce, może prze get wysyła w adresie url
	$y = $_POST['karasi'];
	$naleznosc= $x * 1. + $y * 2.5;
	

echo<<<END


	<h2>Podsumowanie zamówienia</h2>
	<table border="1" cellpadding="10" cellspacing="0">
	<tr>
		<td>Liczba płotek (1,99 PLN/szt)</td><td>$x</td>
	</tr>
	<tr>
		<td>Liczba karasi (2,50 PLN/szt)</td><td>$y</td>
	</tr>
	<tr>
		<td>Należność:</td><td>$naleznosc PLN</td>
	</tr>
	<table/>
	<br ><a href="index.php">Powrót do strony głównej</a>
	
END;
	
	//po endzie musi być enter
?>


</body>
</html>