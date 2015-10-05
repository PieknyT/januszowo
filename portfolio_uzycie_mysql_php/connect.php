<?php
	class ShowTextTaile
	{
		function polaczenie($input='index')
		{
			try
			{
				$hostname = 'localhost';
				$username = 'root';
				$password = '';

				$dbh = new PDO("mysql:host=$hostname;dbname=tilecontents;encoding=utf8", $username, $password); 
				$dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
				
				
				
				$stmt=$dbh->prepare('SELECT `tile` FROM `content` WHERE `id` =:id');
				$stmt->bindParam(':id', $input, PDO::PARAM_STR); 
				$stmt -> execute();
				$result = $stmt->fetch(PDO::FETCH_ASSOC);
				$stmt -> closeCursor();
				$dbh = null;
				
				if($result ==false)
				{
					return 'Nie ma takiej tresci';
				}
				else
				{
					return $result['tile'];
				}	
			}
			catch(PDOException $e)
			{
			
				die('Połaczenie z bazą nie mogło zostać utworzone.');
			}
		}
	
	}
?>