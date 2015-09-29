<?php
	function showTextTaile($input)
	{
		try
		{
			$hostname = 'localhost';
			$username = 'root';
			$password = '';

			$dbh = new PDO("mysql:host=$hostname;dbname=tilecontents;encoding=utf8", $username, $password); 
			$dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
			
			
			
			$stmt=$dbh->prepare('SELECT `tile` FROM `content` WHERE `id` =:id');
			$stmt->bindValue(':id', $input, PDO::PARAM_STR);
			$stmt -> execute();
			$result = $stmt->fetch(PDO::FETCH_ASSOC);
			$stmt -> closeCursor();
			$dbh = null;	
			return $result['tile'];
		
		}
		catch(PDOException $e)
		{
			echo 'Połaczenie nie mogło zostać utworzone.';
		}
	}

	if (isset($_GET['tiletitle']))
		{
			echo showTextTaile($_GET['tiletitle']);
		}
		else
		{
			echo showTextTaile('index');
		}
?>