-- SCRIPT DE BUSCAR
-- Banco de Dados: MySQL 8.0
-- Base de Dados: magaluDB

-- BASE DE DADOS
USE magaluDB;

-- Obter detalhes do produto por departamento:
SELECT p.idProduto, p.nomeProduto, p.descricao, p.valorProduto, d.nomeDepartamento
FROM PRODUTO p
JOIN DEPARTAMENTO d ON p.idDepartamento = d.idDepartamento
WHERE d.nomeDepartamento = 'Eletrônicos';

-- Obter todos os pedidos de um comprador específico:
SELECT pe.idPedido, c.nome AS nomeComprador, pe.status, pe.totalPedido, pe.dataPedido, e.nomeEndereco AS enderecoEntrega
FROM PEDIDO pe
JOIN COMPRADOR c ON pe.idComprador = c.idComprador
LEFT JOIN ENDERECO e ON pe.idEnderecoEntrega = e.idEndereco
WHERE c.nome = 'João Silva';

-- Obter detalhes do item em um pedido específico:
SELECT  p.nomeProduto, p.valorProduto, i.quantidade, (i.quantidade * p.valorProduto) AS subtotal
FROM ITEM i
JOIN PRODUTO p ON i.idProduto = p.idProduto
WHERE i.idPedido = 1;

-- Obter o total gasto por todos os compradores:
SELECT c.nome, SUM(pe.totalPedido) as totalGasto
FROM COMPRADOR c
JOIN PEDIDO pe ON c.idComprador = pe.idComprador
GROUP BY c.nome;