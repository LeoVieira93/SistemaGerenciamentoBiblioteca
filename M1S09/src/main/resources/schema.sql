CREATE TABLE Bibliotecarios
(
    id    INT PRIMARY KEY,
    nome  VARCHAR(255),
    email VARCHAR(255),
    senha VARCHAR(255)
);

CREATE TABLE Membros
(
    id       INT PRIMARY KEY,
    nome     VARCHAR(255),
    endereco VARCHAR(255),
    telefone VARCHAR(20)
);

CREATE TABLE Visitantes
(
    id       INT PRIMARY KEY,
    nome     VARCHAR(255),
    telefone VARCHAR(20)
);

CREATE TABLE Livros
(
    id            INT PRIMARY KEY,
    titulo        VARCHAR(255),
    autor         VARCHAR(255),
    anoPub INT
);

CREATE TABLE Emprestimos
(
    id             INT PRIMARY KEY,
    livro_id       INT,
    membro_id      INT,
    dataEmprestimo DATE,
    dataDevolucao  DATE,
    FOREIGN KEY (livro_id) REFERENCES Livro (id),
    FOREIGN KEY (membro_id) REFERENCES Membros (id)
);