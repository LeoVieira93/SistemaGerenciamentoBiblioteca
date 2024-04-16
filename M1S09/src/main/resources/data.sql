INSERT INTO Bibliotecarios (id, nome, email, senha)
VALUES (1, 'Salesio', 'salesio@biblioteca.com', '9876'),
       (2, 'Ilma', 'ilma@biblioteca.com', '5432');

INSERT INTO Membros (id, nome, endereco, telefone)
VALUES (1, 'Leonardo', 'Rua JHG, 230', '48999999999'),
       (2, 'Julia', 'Rua JHG, 230', '48999999998');
       (3, 'Kethrin', 'Rua FHI, 48', '48999999997');

INSERT INTO Visitantes (id, nome, telefone)
VALUES (1, 'Jorge', '47999989999'),
       (2, 'Roberto', '49999979999');

INSERT INTO Livros (id, titulo, autor, anoPub)
VALUES (1, 'Prince of Thorns', 'Mark Lawrence', 2011),
       (2, 'King of Thorns', 'Mark Lawrence', 2012),
       (3, 'Emperor of Thorns', 'Mark Lawrence', 2013);
       (4, 'A Torre Negra', 'Stephen King', 2004);

INSERT INTO Emprestimos (id, livro_id, membro_id, dataEmprestimo, dataDevolucao)
VALUES (1, 1, 1, '2024-04-10', '2024-04-15'),
       (2, 2, 1, '2024-04-10', '2024-04-15');
       (3, 3, 2, '2024-04-02', '2024-04-13');
       (4, 4, 3, '2024-04-05', '2024-04-10');



