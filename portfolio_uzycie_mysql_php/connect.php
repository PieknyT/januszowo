<?php


	function showTextTaile($input)
	{
		$needle= '\'';
		if(strlen($input) <=7 && strlen($input)>=5 && strpos($input,$needle)==false)
		{
			$hostname = 'localhost';
			$username = '';
			$password = '';

			$dbh = @new PDO("mysql:host=$hostname;dbname=tomaszm_cba_pl", $username, $password);
			$sql = "SELECT tile FROM content WHERE id = '$input'" ;
			$stmt=$dbh->query($sql);
			$result = $stmt->fetch(PDO::FETCH_ASSOC);
			return $texttile=$result['tile'];
			$dbh = null;	
		}
		
	}

	if (isset($_GET['tiletitle']))
		{
			
			$tiletitle = $_GET['tiletitle'];	
			
			echo showTextTaile($tiletitle);
		}
		else
		{
			$tiletitle='index';
			echo showTextTaile($tiletitle);
			
		}
		
?>