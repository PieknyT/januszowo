<?php

	require('./libs/Smarty.class.php'); 
	require_once ('connect.php');
	require_once('check.php');
	
	$tpl = new Smarty; 
	$tpl -> template_dir = './templates/';
	$tpl -> compile_dir = './templates_c/';
	
	$kafel= new ShowTextTaile;
	$show = new Check;
	$tresc=$kafel->polaczenie($show->getInput('tiletitle'));
	
	
	$tpl -> assign('kafelek', $tresc ); 
	$tpl -> display('szablon.tpl'); 
 
?>
