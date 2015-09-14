<?php



		function showTextTaile($input)
			{
				$host = "localhost";
				$db_user = "pieknytomasz";
				$db_password = "klmt22";
				$db_name = "pieknytomasz_cba_pl";
				
				$connect = @new mysqli($host, $db_user, $db_password, $db_name);
				
				if($connect->connect_errno!=0)
				{
					echo "Error: ". $connect->connect_errno;
				}
				else
				{
					
					$sql = "SELECT tile FROM content WHERE id = '$input'";
					$result = @$connect->query($sql);
					$record=$result->fetch_assoc();
					$result->close();
					$connect->close();
					return $texttile=$record['tile'];
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