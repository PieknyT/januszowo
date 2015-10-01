<?php

//odczyt pliku xls

	require_once 'Excel/reader.php';
	$xls = new Spreadsheet_Excel_Reader();
	$xls->setOutputEncoding('cp1250');
	$xls->read('slownik.xls');
	var_dump($xls->sheets[1]);  //zawartosc 2iego arkusza
	echo "<br></br>";
	echo $xls->sheets[0] ['numRows']; //liczba wierszy w pierwszym arkuszu
	echo "<br></br>";
	echo $xls->sheets[0]['numCols']; //liczba kolumn w pierwszym arkuszu
	echo "<br></br>";
	echo $xls->sheets[1]['cells'][5][2]; // komórka[wiersz], [koumna]
	echo "<br></br>";
	
	for($i=1;$i<=$xls->sheets[0]['numRows'];$i++)
	{
		for($j=1;$j<=$xls->sheets[0]['numCols'];$j++)
		{
	    echo $xls->sheets[0]['cells'][$i][$j]." ";
		}
		echo'<br/>';
	}
	


?>
