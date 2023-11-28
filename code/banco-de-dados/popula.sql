-- SCRIPT DE POPULAR
-- Banco de Dados: MySQL 8.0
-- Base de Dados: magaluDB

-- BASE DE DADOS
USE magaluDB;

-- INSERTS
INSERT INTO DEPARTAMENTO (nomeDepartamento) 
VALUES 
('Eletrônicos'), 
('Livros'), 
('Roupas'), 
('Casa e Cozinha');

INSERT INTO PRODUTO (nomeProduto, descricao, valorProduto, idDepartamento) 
VALUES 
('iPhone 13', 'Smartphone da Apple', 6999.99, 1),
('O Alquimista', 'Livro de Paulo Coelho', 29.90, 2),
('Camiseta Polo', 'Camiseta da marca X', 89.90, 3),
('Panela de Pressão', 'Panela de pressão de 5L', 79.90, 4);

INSERT INTO COMPRADOR (cpf, nome, email, telefone) 
VALUES 
('12345678901', 'João Silva', 'joao.silva@gmail.com', '11987654321'),
('23456789012', 'Maria Santos', 'maria.santos@gmail.com', '21987654321'),
('34567890123', 'Pedro Costa', 'pedro.costa@gmail.com', '31987654321'),
('45678901234', 'Ana Pereira', 'ana.pereira@gmail.com', '41987654321');

INSERT INTO ENDERECO (nomeEndereco, cep, numero, bairro, estado, cidade) 
VALUES 
('Casa', '12345678', 123, 'Centro', 'SP', 'São Paulo'),
('Trabalho', '23456789', 456, 'Jardins', 'RJ', 'Rio de Janeiro'),
('Casa dos Pais', '34567890', 789, 'Bela Vista', 'MG', 'Belo Horizonte'),
('Casa de Praia', '45678901', 101, 'Copacabana', 'RJ', 'Rio de Janeiro');

INSERT INTO possui (idEndereco, idComprador) 
VALUES 
(1, 1), 
(2, 2), 
(3, 3), 
(4, 4);

INSERT INTO PEDIDO (status, totalPedido, dataPedido, idComprador, idEnderecoEntrega) 
VALUES 
('Em processamento', 13999.98, NOW(), 1, 1),
('Entregue', 109.80, NOW(), 2, 2),
('Cancelado', 169.80, NOW(), 3, 3),
('Em transporte', 8599.89, NOW(), 4, 4);

INSERT INTO SACOLA (idComprador, totalSacola) 
VALUES 
(1, 0), 
(2, 0), 
(3, 0), 
(4, 0);

INSERT INTO ITEM (quantidade, idProduto, idPedido, idSacola) 
VALUES 
(2, 1, 1, 1), 
(1, 2, 2, 2), 
(1, 3, 3, 3), 
(1, 4, 4, 4);

INSERT INTO PAGAMENTO (métodoPagamento, valorPagamento, dataPagamento, idComprador, idPedido) 
VALUES 
('Cartão de Crédito', 7299.89, NOW(), 1, 1),
('Boleto Bancário', 109.80, NOW(), 2, 2),
('Débito Online', 169.80, NOW(), 3, 3),
('Cartão de Crédito', 8599.89, NOW(), 4, 4);
