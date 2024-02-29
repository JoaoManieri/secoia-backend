INSERT INTO Departamento (nome)
VALUES ('Recursos Humanos'),
       ('Finanças'),
       ('Marketing'),
       ('Tecnologia');

INSERT INTO Usuario (nome, departamento_id)
VALUES ('Ana Silva', 1),
       ('João Santos', 1),
       ('Maria Oliveira', 2),
       ('Pedro Costa', 2),
       ('Carla Pereira', 3),
       ('Luiz Fernandes', 3),
       ('Mariana Rodrigues', 4),
       ('Rafael Almeida', 4);

INSERT INTO Entidade (id, nome)
VALUES (0, 'ISO'),
       (1, 'ABNT');


INSERT INTO Norma (id, codigo, ano, titulo, idioma,  entidade_id, usuario_criador_id)
VALUES (1, 'ISO 9001', 2022, 'Sistemas de gestão da qualidade - Requisitos', 'PORTUGUES', 1, 1),
       (2, 'ISO 14001', 2022, 'Sistemas de gestão ambiental - Requisitos com orientações para uso', 'PORTUGUES', 1, 1),
       (3, 'ABNT NBR 5410', 2004, 'Instalações elétricas de baixa tensão', 'PORTUGUES', 1, 1),
       (4, 'ISO 27001', 2013, 'Sistemas de gestão de segurança da informação - Requisitos', 'PORTUGUES', 1, 2),
       (5, 'ISO/IEC 27002', 2013, 'Tecnologia da informação - Técnicas de segurança - Código de prática para a gestão de segurança da informação', 'PORTUGUES', 1, NULL),
       (6, 'ABNT NBR 9050', 2021, 'Acessibilidade a edificações, mobiliário, espaços e equipamentos urbanos', 'PORTUGUES', 1, 2),
       (7, 'ISO 45001', 2018, 'Sistemas de gestão de segurança e saúde ocupacional - Requisitos', 'PORTUGUES', 1, 2),
       (8, 'ABNT NBR 5419', 2015, 'Proteção contra descargas atmosféricas', 'PORTUGUES', 1, 3),
       (9, 'ISO 26000', 2010, 'Diretrizes sobre responsabilidade social', 'PORTUGUES', 1, 4),
       (10, 'ABNT NBR 14724', 2011, 'Informação e documentação - Trabalhos acadêmicos - Apresentação', 'PORTUGUES', 1, 4),
       (11, 'ISO 31000', 2018, 'Gestão de riscos - Diretrizes', 'PORTUGUES', 1, 2),
       (12, 'ISO 9000', 2005, 'Sistemas de gestão da qualidade - Fundamentos e vocabulário', 'PORTUGUES', 1, 3),
       (13, 'ABNT NBR 6493', 1994, 'Representação de projetos de arquitetura', 'PORTUGUES', 1, 3),
       (14, 'ISO 10015', 1999, 'Diretrizes para treinamento', 'PORTUGUES', 1, 2),
       (15, 'ABNT NBR 10520', 2002, 'Informação e documentação - Citações em documentos - Apresentação', 'PORTUGUES', 1, 1),
       (16, 'ISO 14000', 2004, 'Sistemas de gestão ambiental - Fundamentos e técnicas', 'PORTUGUES', 1, 2),
       (17, 'ABNT NBR 5460', 1989, 'Iluminação - Terminologia', 'PORTUGUES', 1, 1),
       (18, 'ISO 19011', 2018, 'Diretrizes para auditoria de sistemas de gestão', 'PORTUGUES', 1, 1),
       (19, 'ABNT NBR 15287', 2011, 'Projeto de pesquisa - Apresentação', 'PORTUGUES', 1, 1),
       (20, 'ISO 14031', 2013, 'Avaliação do desempenho ambiental - Diretrizes', 'PORTUGUES', 1, 1);

