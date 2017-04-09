-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 31-Mar-2017 às 10:40
-- Versão do servidor: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quiz`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `questao`
--

CREATE TABLE `questao` (
  `id` int(11) NOT NULL,
  `pergunta` text NOT NULL,
  `opA` text NOT NULL,
  `opB` text NOT NULL,
  `opC` text NOT NULL,
  `resp` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `questao`
--

INSERT INTO `questao` (`id`, `pergunta`, `opA`, `opB`, `opC`, `resp`) VALUES
(1, 'O que você entende como doenças osteomuscular?', 'São doenças que acometem os ossos, as articulações e os músculos.', 'São doenças que acometem o somente os ossos.', 'São doenças que acometem somente os músculos.', '1'),
(2, 'Qual são as principais queixas de quem sofre com as doenças osteomusculares?', 'Normalmente não sente nada, porque não dói.', 'Dor, formigamento, sensação de peso, limitação de movimentos.', 'Muita vontade de praticar atividade física.', '2'),
(8, 'Quando utilizo o celular tenho o risco de ter doença osteomuscular?', 'Não, o telefone não é pesado.', 'Não, só preciso de um dedo para digitar.', 'Sim, preciso evitar inclinar a cabeça para um lado e permanecer por longos períodos na mesma posição.', '3'),
(6, 'Quem pode ter doenças osteomusculares?', 'Somente os idosos.', 'Somente pessoas que trabalham pegando peso.', 'Pessoa em faixa etária ativa.', '1'),
(7, 'Quais hábitos que você pode adotar para evitar o aparecimento de doenças osteomusculares durante seu trabalho?', 'Não preciso fazer nada.', 'Adequação do mobiliário, máquinas, dispositivos e equipamentos.', 'Uma boa noite de sono resolve tudo.', '2'),
(3, 'Por que o avanço da idade contribui para o aparecimento de doenças osteomusculares?', 'É um processo natural de desgaste orgânico.', 'Todo mundo de idade avançada tem essa doença.', 'Falta de exercícios.', '1'),
(4, 'Toda a doença osteomuscular está relacionada ao trabalho?', 'Sim, sempre por conta do trabalho.', 'Sim, o trabalho que provoca as doenças.', 'Não, existem predisposições individuais que aumentam a possibilidade de alguém desenvolver uma doença osteomuscular.  ', '3'),
(5, 'Quais hábitos diários que você pode fazer para evitar o aparecimento de doenças osteomusculares?', 'Manter o peso ideal, fazer exercícios, alongar-se.', 'Não fazer nada, porque não adianta.', 'Se alimentar e se hidratar bem.', '1'),
(9, 'Quando utilizo a mochila, posso adquirir doença osteomuscular?', 'Sim, a carga não pode pesar mais do que 10% do peso corporal.', 'Não, ela não cabe muita coisa dentro.', 'Sim, qualquer peso que pegar pode provocar a doença.', '1'),
(10, 'Atividade com computador pode provocar doença osteomuscular?', 'Não, trabalhar sentado não tem problema.', 'Não, trabalhar com computador não tem esforço físico.', 'Sim, é necessário realizar pausas de pequena duração a cada hora trabalhada para reduzir a fadiga.', '3');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `telefone` varchar(12) NOT NULL,
  `pontos` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `questao`
--
ALTER TABLE `questao`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `questao`
--
ALTER TABLE `questao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
