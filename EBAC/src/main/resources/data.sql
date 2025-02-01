
--Animais Adotados
INSERT
INTO
  animal
  (nome_provisorio, idade_estimada, especie, raca, data_entrada, condicoes_chegada, nome_recebedor, porte)
VALUES
  ('Lola', 2, 'cachorro' ,'Shih Tzu', current_date-100, 'Magro', '03525412545', 'Pequeno');

INSERT
INTO
  animal
  (nome_provisorio, idade_estimada, especie, raca, data_entrada, condicoes_chegada, nome_recebedor, porte)
VALUES
  ('Toto', 7, 'cachorro' ,'Vira lata', current_date-300, 'Normal', '03854215744', 'Medio');

INSERT
INTO
  animal
  (nome_provisorio, idade_estimada, especie, raca, data_entrada, condicoes_chegada, nome_recebedor, porte)
VALUES
  ('Roscan Dog', 12, 'cachorro' ,'Tomba lata', current_date, 'Super Magro', '03525412545', 'Grande');

INSERT
INTO
  animal
  (nome_provisorio, idade_estimada, especie, raca, data_entrada, data_adocao, condicoes_chegada, nome_recebedor, porte)
VALUES
  ('Roscan', 10, 'cachorro' ,'Pintcher', current_date-500, current_date-10, 'gordo', '02541578547', 'Pequeno');

--Funcionarios
INSERT
INTO
  funcionario
  (nome, cpf, admissao)
VALUES
  ('Fernanda', '03525412545', current_date-200);

INSERT
INTO
  funcionario
  (nome, cpf, admissao)
VALUES
  ('Vilnei', '03854215744', current_date-300);

INSERT
INTO
  funcionario
  (nome, cpf, admissao, demissao)
VALUES
  ('Rodrigo', '02541578547', current_date-364, current_date-2);
