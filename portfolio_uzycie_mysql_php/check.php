<?php

class Check{

	public $data_table;
	
	//function __construct ($_GET, $_POST)
	//{
		//$this->data_table[]=$_GET;
	//	$this->data_table[]=$_POST;
		
		
	//}

	

	function getInput($var)
		{
			return isset($_GET[$var])? $_GET[$var] : null;
		}
		
	}
?>