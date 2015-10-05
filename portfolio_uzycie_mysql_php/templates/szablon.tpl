<!DOCTYPE HTML>
<html lang = "pl">
	<head>
		<meta charset = "utf-8"/>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		
		<title>Tomasz Majka - Portfolio</title>
		
		<meta name ="description" content= "Programista webowy jakiego Ci potrzeba: PHP, HTML, CSS, MySQL, C++"/>
		<meta name="keywords" content="strony www, tworzenie, developer, junior, www, programista, porfolio, php, html, css, MySQL "/>
		
		<link rel="stylesheet" href="style.css" type="text/css" />
		<link rel="stylesheet" href="css/fontello.css" type="text/css" />
		<link href='https://fonts.googleapis.com/css?family=Ubuntu:400,700|Josefin+Sans&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
		<script src="timer.js"></script>
		
	</head>

	<body onload="odliczanie();">
	
		<div id="container">
		
			<div class="rectangle">
			
				<div id="logo"><a href="php-developer-junior" class = "tilelink" >Tomasz Majka</a></div>
				<div id="zegar"><br/></div>
				<div style="clear:both;"></div>
			
			</div>
					
			<div class="square">
			
				<form  metod="get">
					<button name ="tiletitle" type="submit" value="whoiam"  class="tile1" >
						<i class="icon-user"></i><br/>Kim jestem?
					</button> 
				</form>

				<form  metod="get">
					 <button name ="tiletitle" type="submit" value ="whatcan" class="tile1" >
						<i class="icon-laptop"></i><br/>Co potrafię?
					</button>
				</form>
		
				  <div style="clear:both;"></div>
				  
				 <form  metod="get">
					<button name ="tiletitle" type="submit" value ="whyyou" class="tile2" >
						<i class="icon-drupal"></i><br/>Dlaczego Wasz Team?
					</button>
				</form>
				
				<form  metod="get">
					 <button name ="tiletitle" type="submit" value ="contact" class="tile3" >
						<i class="icon-mail"></i><br/>Kontakt ze mną?
					</button>
				</form>
			
					<div style="clear:both;"></div>

				<div class="tile4">
					<i>Talk is cheap. Show me the code!</i><br/> - Linus Torvalds, twórca Linuxa
				 </div>
				
			</div>
			
			<div class="square">
			
				<div class="tile5">
				
				{$kafelek}
					
				</div>
				
				<div class="gitHub">
					<a href = "https://github.com/PieknyT" target="_blank" class="sociallink"><i class="icon-github-circled-alt2"></i></a>
				</div>
				
				<div class="linkedin">
					<a href = "https://pl.linkedin.com/pub/tomasz-majka/a6/4/b22" target="_blank" class="sociallink"><i class="icon-linkedin"></i> </a>
				</div>
				
				<div class="fb">
					<a href = "https://www.facebook.com/tomasz.majka.56" target="_blank" class="sociallink"><i class="icon-facebook"></i></a>
				</div>
				
			    <div style = "clear:both";></div>
				
			</div>
			
			<div style = "clear:both";></div>
	
			<div class="rectangle">2015 &copy; Tomasz Majka - Junior Developer PHP - Twój nowy pracownik :) <a href = "mailto:tomasz.w.majka@wp.pl" class = "tilelink"><i class="icon-mail-alt"></i>  tomasz.w.majka@wp.pl</a></div>
	
		
		</div>





	</body>
</html>