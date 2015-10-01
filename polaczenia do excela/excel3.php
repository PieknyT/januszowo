<?php
// druk 2wóch arkuszy z pliku
	require_once 'Excel/reader.php';
	$xls= new Spreadsheet_Excel_Reader();
	$xls->setOutputEncoding('cp1250');
	$xls->read('swiss.xls');
	
	for($i=1; $i<=$xls->sheets[0]['numRows'];$i++)
	{
		for($j=1; $j<=$xls->sheets[0]['numCols'];$j++)
		{
			echo $xls->sheets[0]['cells'][$i][$j]." ";
		}
		echo"</br>";
	}
	
		for($i=1; $i<=$xls->sheets[1]['numRows'];$i++)
	{
		for($j=1; $j<=$xls->sheets[1]['numCols'];$j++)
		{
			echo $xls->sheets[1]['cells'][$i][$j]." ";
		}
		echo"</br>";
	}


?>