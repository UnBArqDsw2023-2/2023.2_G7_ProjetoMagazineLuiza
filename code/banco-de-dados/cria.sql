-- SCRIPT DE CRIAÇÃO
-- Banco de Dados: MySQL 8.0
-- Base de Dados: magaluDB

-- BASE DE DADOS
CREATE DATABASE 
    IF NOT EXISTS magaluDB;

USE magaluDB;

-- TABELAS
CREATE TABLE DEPARTAMENTO (
    idDepartamento BIGINT NOT NULL AUTO_INCREMENT,
    nomeDepartamento VARCHAR(50) NOT NULL,
    CONSTRAINT DEPARTAMENTO_PK PRIMARY KEY (idDepartamento)
) ENGINE = INNODB;

CREATE TABLE PRODUTO (
    idProduto BIGINT NOT NULL AUTO_INCREMENT,
    nomeProduto VARCHAR(50) NOT NULL,
    descricao VARCHAR(100) NOT NULL,
    valorProduto DECIMAL(7,2) NOT NULL,
    idDepartamento BIGINT,
    CONSTRAINT PRODUTO_PK PRIMARY KEY (idProduto),
    CONSTRAINT PRODUTO_DEPARTAMENTO_FK FOREIGN KEY (idDepartamento)
        REFERENCES DEPARTAMENTO (idDepartamento)
          ON DELETE SET NULL
		  ON UPDATE CASCADE
) ENGINE = INNODB;

CREATE TABLE COMPRADOR (
    idComprador BIGINT NOT NULL AUTO_INCREMENT,
    cpf VARCHAR(11) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL,
    telefone CHAR(11) NOT NULL,
    CONSTRAINT COMPRADOR_PK PRIMARY KEY (idComprador),
    CONSTRAINT COMPRADOR_UK UNIQUE (cpf)
) ENGINE = INNODB;

CREATE TABLE ENDERECO (
    idEndereco BIGINT NOT NULL AUTO_INCREMENT,
    nomeEndereco VARCHAR(50) NOT NULL,
    cep CHAR(8) NOT NULL,
    numero INT(5) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    estado CHAR(2) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    complemento VARCHAR(20),
    referencia VARCHAR(50),
    CONSTRAINT ENDERECO_PK PRIMARY KEY (idEndereco)
) ENGINE = INNODB;

CREATE TABLE possui (
    idEndereco BIGINT NOT NULL,
    idComprador BIGINT NOT NULL,
    CONSTRAINT COMPRADOR_POSSUI_ENDERECO_UK UNIQUE (idEndereco, idComprador),
    CONSTRAINT POSSUI_COMPRADOR_FK FOREIGN KEY (idComprador)
        REFERENCES COMPRADOR (idComprador)
		  ON DELETE CASCADE
		  ON UPDATE CASCADE,
    CONSTRAINT POSSUI_ENDERECO_FK FOREIGN KEY (idEndereco)
        REFERENCES ENDERECO (idEndereco)
		  ON DELETE CASCADE
		  ON UPDATE CASCADE
) ENGINE = INNODB;

CREATE TABLE PEDIDO (
    idPedido BIGINT NOT NULL AUTO_INCREMENT,
    status VARCHAR(30) NOT NULL,
    totalPedido DECIMAL(8,2) NOT NULL,
    dataPedido DATETIME NOT NULL,
    idComprador BIGINT NOT NULL,
    idEnderecoEntrega BIGINT,
    CONSTRAINT PEDIDO_PK PRIMARY KEY (idPedido),
    CONSTRAINT PEDIDO_COMPRADOR_FK FOREIGN KEY (idComprador)
        REFERENCES COMPRADOR (idComprador)
		  ON DELETE CASCADE
		  ON UPDATE CASCADE,
    CONSTRAINT PEDIDO_ENDERECO_FK FOREIGN KEY (idEnderecoEntrega)
        REFERENCES ENDERECO (idEndereco)
		  ON DELETE SET NULL
		  ON UPDATE SET NULL
) ENGINE = INNODB;

CREATE TABLE SACOLA (
    idSacola BIGINT NOT NULL AUTO_INCREMENT,
    idComprador BIGINT NOT NULL,
    totalSacola DECIMAL(8,2) NOT NULL,
    CONSTRAINT SACOLA_PK PRIMARY KEY (idSacola),
    CONSTRAINT SACOLA_COMPRADOR_FK FOREIGN KEY (idComprador)
        REFERENCES COMPRADOR (idComprador)
		  ON DELETE CASCADE
		  ON UPDATE CASCADE
) ENGINE = INNODB;

CREATE TABLE ITEM (
    idItem BIGINT NOT NULL AUTO_INCREMENT,
    quantidade INT(2) NOT NULL,
    idProduto BIGINT NOT NULL,
    idPedido BIGINT,
    idSacola BIGINT,
    CONSTRAINT ITEM_PK PRIMARY KEY (idItem),
    CONSTRAINT ITEM_PEDIDO_FK FOREIGN KEY (idPedido)
        REFERENCES PEDIDO (idPedido)
		  ON DELETE CASCADE
		  ON UPDATE CASCADE,
    CONSTRAINT ITEM_SACOLA_FK FOREIGN KEY (idSacola)
        REFERENCES SACOLA (idSacola)
		  ON DELETE CASCADE
		  ON UPDATE CASCADE,
    CONSTRAINT PEDIDO_PRODUTO_FK FOREIGN KEY (idProduto)
        REFERENCES PRODUTO (idProduto)
		  ON DELETE CASCADE
		  ON UPDATE CASCADE
) ENGINE = INNODB AUTO_INCREMENT = 1;

CREATE TABLE PAGAMENTO (
    idPagamento BIGINT NOT NULL AUTO_INCREMENT,
    métodoPagamento VARCHAR(50) NOT NULL,
    valorPagamento DECIMAL(8,2) NOT NULL,
    dataPagamento DATETIME NOT NULL,
    idComprador BIGINT NOT NULL,
    idPedido BIGINT NOT NULL,
    CONSTRAINT PAGAMENTO_PK PRIMARY KEY (idPagamento),
    CONSTRAINT PAGAMENTO_COMPRADOR_FK FOREIGN KEY (idComprador)
        REFERENCES COMPRADOR (idComprador)
		  ON DELETE CASCADE
		  ON UPDATE CASCADE,
    CONSTRAINT PAGAMENTO_PEDIDO_FK FOREIGN KEY (idPedido)
        REFERENCES PEDIDO (idPedido)
		  ON DELETE CASCADE
		  ON UPDATE CASCADE
) ENGINE = INNODB;

-- View para os produtos mais vendidos
CREATE VIEW ProdutosMaisVendidos AS
SELECT p.nomeProduto, d.nomeDepartamento, SUM(i.quantidade) as quantidadeVendida
FROM ITEM i
JOIN PRODUTO p ON i.idProduto = p.idProduto
JOIN DEPARTAMENTO d ON p.idDepartamento = d.idDepartamento
GROUP BY p.nomeProduto, d.nomeDepartamento
ORDER BY quantidadeVendida DESC;

-- View para o valor total de vendas por departamento
CREATE VIEW VendasPorDepartamento AS
SELECT d.nomeDepartamento, SUM(i.quantidade) as qtdTotalVendas, SUM(p.valorProduto * i.quantidade) as valorTotalVendas
FROM ITEM i
JOIN PRODUTO p ON i.idProduto = p.idProduto
JOIN DEPARTAMENTO d ON p.idDepartamento = d.idDepartamento
GROUP BY d.nomeDepartamento;

-- View para o método de pagamento mais popular
CREATE VIEW MetodoPagamentoMaisPopular AS
SELECT métodoPagamento, COUNT(*) as quantidade
FROM PAGAMENTO
GROUP BY métodoPagamento
ORDER BY quantidade DESC;
