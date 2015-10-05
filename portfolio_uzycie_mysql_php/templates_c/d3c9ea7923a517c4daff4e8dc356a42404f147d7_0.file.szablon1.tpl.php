<?php /* Smarty version 3.1.27, created on 2015-10-02 11:55:29
         compiled from "C:\xampp\htdocs\portfolio2\templates\szablon1.tpl" */ ?>
<?php
/*%%SmartyHeaderCode:13776560e54910ca9d5_19034765%%*/
if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    'd3c9ea7923a517c4daff4e8dc356a42404f147d7' => 
    array (
      0 => 'C:\\xampp\\htdocs\\portfolio2\\templates\\szablon1.tpl',
      1 => 1443778816,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '13776560e54910ca9d5_19034765',
  'variables' => 
  array (
    'data' => 0,
  ),
  'has_nocache_code' => false,
  'version' => '3.1.27',
  'unifunc' => 'content_560e5491389bd9_02665446',
),false);
/*/%%SmartyHeaderCode%%*/
if ($_valid && !is_callable('content_560e5491389bd9_02665446')) {
function content_560e5491389bd9_02665446 ($_smarty_tpl) {

$_smarty_tpl->properties['nocache_hash'] = '13776560e54910ca9d5_19034765';
?>
<html>
 <head>
  <title>Smarty: pierwszy skrypt</title>
 </head>
 <body>
   <p>Hello world! Dzisiaj jest <?php echo $_smarty_tpl->tpl_vars['data']->value;?>
!</p>
 </body>
</html><?php }
}
?>