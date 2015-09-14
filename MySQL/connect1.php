<?php



		
			
				$host = "localhost";
				$db_user = "root";
				$db_password = "";
				$db_name = "tilecontents";
				
				$connect = @new mysqli($host, $db_user, $db_password, $db_name);
				
				if($connect->connect_errno!=0)
				{
					echo "Error: ". $connect->connect_errno;
				}
				else
				{
					//$sql="DELETE FROM content WHERE id='whyyou' ";
					//$sql="DELETE FROM content WHERE id='index' ";
					//$sql="DELETE FROM content WHERE id='contact' ";
					//$sql="DELETE FROM content WHERE id='whyyou' ";
					//$sql="DELETE FROM content WHERE id='whatcan' ";
					//$sql="INSERT INTO content SET id='whoiam', tile='Kim jestem? <br/> <br/>Zorganizowanym adeptem sztuki programowania, nastawionym na pożeranie wiedzy i ciągły progres. Chcącym uczyć sie od najlepszych, rewanżując się efektywną pracą.'";
					
					//$sql="INSERT INTO content SET id='index', tile='Witam w moim portfolio! <br/></br>Państwa ogłoszenie o pracę pchnęło mnie do działania i tak powstała niniejsza strona. Jej wykonaniem prezentuję co już potrafię. Zapraszam do przeglądania. Czekam na kontakt.'";
					
				/*	$sql="INSERT INTO content SET id='whatcan', tile='Co potrafię? <br/>
						<ul>
							<li>PHP (objektowość, funkcje stringów i tablic, wzorce projektowe -podstawy)</li>
							<li>HTML (jak w zakresie tej strony) </li>
							<li>CSS  (jak w zakresie tej strony) </li>
							<li>MySQL (podstawy) </li>
							<li>C++ (podstawy)</li>
							<li>Java (podstawy) </li>
						</ul>'"; */
					
					/*$sql="INSERT INTO content SET id='contact', tile='Kontakt ze mną: <br/></br>
					  Telefon: 690 879 724<br/> 
					  E-mail: tomasz.majka@wp.pl<br/> 
					  Srebrnogórska 23/13 Wrocław<br/><br/><br/><br/>
					  media społecznościowe:'"; */
					  
					//$sql="INSERT INTO content SET id='whyyou', tile=' Dlaczego Wasz Team?<br/><br/>Jak twiedzą niektórzy autorzy frameworków, można je opanować w weekend. Jak usłyszałem na jednym z fimików z Drupal Camp, by poznać Drupala potrzeba co najmniej roku. To jest wyzwanie, a praca z ludzmi, którzy się tym pasjonujom to najlepsza droga, aby to osiągnąć.'";
					
					  
					
					
					
					$result = @$connect->query($sql);
					echo"poszło";
					//$record=$result->fetch_assoc();
					//$result->close();
					$connect->close();
					
				}
				
				?>