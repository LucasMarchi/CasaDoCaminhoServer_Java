/*-- Insere Voluntários
INSERT INTO voluntario (id, nome) VALUES (-1, 'voluntario teste -1');

INSERT INTO voluntario 
	( id, nome, identidade, cpf, nacionalidade, endereco, bairro, cep, estado_civil, telefone) 
VALUES 
	(-2, 'Lucas William Marchi Silva', '39.694.254-4', '464.684.228-92', 'Brasileiro', 'Estrada do Rio Acima', 'Rio Acima', '07600-000', 'Solteiro', '(11) 999994256');

-- Insere Beneficiários
INSERT INTO beneficiario (id, nome) VALUES (-1, 'beneficiario teste -1');

-- Insere Doadores
INSERT INTO doador (id, nome, documento) VALUES (-1, 'doador teste -1', '464.684.228-92');

-- Insere Projetos
INSERT INTO projeto (id, nome) VALUES (-1, 'projeto teste -1');

-- Insere Doações
INSERT INTO doacao (id, doador_id) VALUES (-1, -1);*/