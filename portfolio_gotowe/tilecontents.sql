-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Czas generowania: 14 Wrz 2015, 03:15
-- Wersja serwera: 5.6.24
-- Wersja PHP: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Baza danych: `tilecontents`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `content`
--

CREATE TABLE IF NOT EXISTS `content` (
  `id` text COLLATE utf8_polish_ci NOT NULL,
  `tile` text COLLATE utf8_polish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;

--
-- Zrzut danych tabeli `content`
--

INSERT INTO `content` (`id`, `tile`) VALUES
('whoiam', 'Kim jestem? <br/> <br/>Zorganizowanym adeptem sztuki programowania, nastawionym na poÅ¼eranie wiedzy i ciÄ…gÅ‚y progres. ChcÄ…cym uczyÄ‡ sie od najlepszych, rewanÅ¼ujÄ…c siÄ™ efektywnÄ… pracÄ….'),
('whatcan', 'Co potrafiÄ™? <br/>\r\n						<ul>\r\n							<li>PHP (objektowoÅ›Ä‡, funkcje stringÃ³w i tablic, wzorce projektowe -podstawy)</li>\r\n							<li>HTML (jak w zakresie tej strony) </li>\r\n							<li>CSS  (jak w zakresie tej strony) </li>\r\n							<li>MySQL (podstawy) </li>\r\n							<li>C++ (podstawy)</li>\r\n							<li>Java (podstawy) </li>\r\n						</ul>'),
('index', 'Witam w moim portfolio! <br/></br>PaÅ„stwa ogÅ‚oszenie o pracÄ™ pchnÄ™Å‚o mnie do dziaÅ‚ania i tak powstaÅ‚a niniejsza strona. Jej wykonaniem prezentujÄ™ co juÅ¼ potrafiÄ™. Zapraszam do przeglÄ…dania. Czekam na kontakt.'),
('contact', 'Kontakt ze mnÄ…: <br/></br>\r\n					  Telefon: 690 879 724<br/> \r\n					  E-mail: tomasz.majka@wp.pl<br/> \r\n					  SrebrnogÃ³rska 23/13 WrocÅ‚aw<br/><br/><br/><br/>\r\n					  media spoÅ‚ecznoÅ›ciowe:'),
('whyyou', ' Dlaczego Wasz Team?<br/><br/>Jak twiedzom niektÃ³rzy autorzy frameworkÃ³w, moÅ¼na je opanowaÄ‡ w weekend. UsÅ‚yszaÅ‚em na jednym z filmikÃ³w z Drupal Camp, aby poznaÄ‡ Drupala potrzeba co najmniej roku. To jest wyzwanie, a praca z ludÅºmi, ktÃ³rzy siÄ™ tym pasjonujom to najlepsza droga, by to osiÄ…gnÄ…Ä‡.');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
