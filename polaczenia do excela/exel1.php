<?php
header("Content-type: application/vnd.ms-exel");

$dane = array(
	array('abrus',145),
	array('banan',78),
	array('ananas',32),
	array('marchew',66),
	array('kartofel',45323),
	array('pietruszka',234),
	array('zielenina',105)
);



?>

<!DOCTYPE HTML>

<html lang ="pl">
	<head>
		<meta charset="utf-8"/>
		<meta http-equiv = "X-UA-Compatible" content="IE=edge,chrome=1"/>
		<title>gimnastyka z exelem 2</title>
		<link rel="stylesheet" href ="style.css" type="text/css"/>
	</head>
	<body>
	<table>
	<?php
	foreach ($dane as $record)
	{
		echo '<tr>';
		echo"<td>$record[0]</td>";
		echo "<td>$record[1]</td>";
		echo '<tr>';
	}
	?>
	
	</table>
	
	</body>
	
	
</html>