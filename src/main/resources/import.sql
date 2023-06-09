INSERT INTO tb_category (description) VALUES ('Curso');
INSERT INTO tb_category (description) VALUES ('Oficina');


INSERT INTO tb_activity (name, desc ,price, categoria_id) VALUES ('Curso de HTML', 'Aprenda HTML de forma prática', 80.0, 1);
INSERT INTO tb_block (atividade_id, start_time, end_time) VALUES (1, TIMESTAMP WITH TIME ZONE '2017-09-25 08:00:00', TIMESTAMP WITH TIME ZONE '2017-09-25 11:00:00');
INSERT INTO tb_activity (name, desc ,price, categoria_id) VALUES ('Oficina de Github', 'Controle versões de seus projetos', 50.0, 2);
INSERT INTO tb_block (atividade_id, start_time, end_time) VALUES (2, TIMESTAMP WITH TIME ZONE '2017-09-25 14:00:00', TIMESTAMP WITH TIME ZONE '2017-09-25 18:00:00');
INSERT INTO tb_block (atividade_id, start_time, end_time) VALUES (2, TIMESTAMP WITH TIME ZONE '2017-09-26 08:00:00', TIMESTAMP WITH TIME ZONE '2017-09-26 11:00:00');

INSERT INTO tb_part (name, email) VALUES ('José Silva', 'jose@gmail.com');
INSERT INTO tb_part (name, email) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_part (name, email) VALUES ('Maria do Rosário', 'maria@gmail.com');
INSERT INTO tb_part (name, email) VALUES ('Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_activity_part (activity_id, part_id) VALUES (1, 1);
INSERT INTO tb_activity_part (activity_id, part_id) VALUES (1, 2);
INSERT INTO tb_activity_part (activity_id, part_id) VALUES (1, 3);
INSERT INTO tb_activity_part (activity_id, part_id) VALUES (2, 4);




