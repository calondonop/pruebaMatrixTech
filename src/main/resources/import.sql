INSERT INTO cliente (cli_id, cli_nombre, cli_edad) VALUES (1, 'Carlos', '30');
INSERT INTO cliente (cli_id, cli_nombre, cli_edad) VALUES (2, 'Daniel', '27');
INSERT INTO cliente (cli_id, cli_nombre, cli_edad) VALUES (3, 'Susana', '28');
INSERT INTO cliente (cli_id, cli_nombre, cli_edad) VALUES (4, 'Sara', '28');
INSERT INTO cliente (cli_id, cli_nombre, cli_edad) VALUES (5, 'María', '22');
INSERT INTO cliente (cli_id, cli_nombre, cli_edad) VALUES (6, 'Mariana', '10');
INSERT INTO cliente (cli_id, cli_nombre, cli_edad) VALUES (7, 'Simón', '10')

INSERT INTO juego (ju_id, ju_anio, ju_titulo, ju_director, ju_marca, ju_precio_alquiler, ju_productor, ju_protagonista, ju_tecnologia) VALUES (11, 2012, 'Uncharted', 'Jaime', 'SONY', 5000, 'Ramiro', 'Natan Drake', 'Play Station');
INSERT INTO juego (ju_id, ju_anio, ju_titulo, ju_director, ju_marca, ju_precio_alquiler, ju_productor, ju_protagonista, ju_tecnologia) VALUES (22, 2015, 'HALO', 'Jackson', 'EA', 7000, 'Charles', 'Electronic man', 'Xbox');
INSERT INTO juego (ju_id, ju_anio, ju_titulo, ju_director, ju_marca, ju_precio_alquiler, ju_productor, ju_protagonista, ju_tecnologia) VALUES (33, 2020, 'Corona Game', 'Richard', 'China Company', 2000, 'Chin chon', 'Jan Lee', 'PC');
INSERT INTO juego (ju_id, ju_anio, ju_titulo, ju_director, ju_marca, ju_precio_alquiler, ju_productor, ju_protagonista, ju_tecnologia) VALUES (44, 2019, 'Need for speed', 'Susan', 'EA', 8000, 'Pablo Montoya', 'Jason Statham', 'PC');
INSERT INTO juego (ju_id, ju_anio, ju_titulo, ju_director, ju_marca, ju_precio_alquiler, ju_productor, ju_protagonista, ju_tecnologia) VALUES (55, 2019, 'Mario Karts', 'Jeff', 'Super Mario', 11000, 'Dan', 'Mario Bross', 'Nintendo');

INSERT INTO alquiler (al_id_cliente, al_id_juego, al_fecha_inicio, al_fecha_devolucion) VALUES (1, 11, '2020-07-29','2020-08-08');
INSERT INTO alquiler (al_id_cliente, al_id_juego, al_fecha_inicio, al_fecha_devolucion) VALUES (1, 22, '2020-08-01','2020-08-20');
INSERT INTO alquiler (al_id_cliente, al_id_juego, al_fecha_inicio, al_fecha_devolucion) VALUES (1, 33, '2020-07-01','2020-08-01');
INSERT INTO alquiler (al_id_cliente, al_id_juego, al_fecha_inicio, al_fecha_devolucion) VALUES (1, 44, '2020-07-29','2020-07-31');
INSERT INTO alquiler (al_id_cliente, al_id_juego, al_fecha_inicio, al_fecha_devolucion) VALUES (1, 55, '2020-08-15','2020-08-20');
INSERT INTO alquiler (al_id_cliente, al_id_juego, al_fecha_inicio, al_fecha_devolucion) VALUES (2, 22, '2020-07-29','2020-08-08');
INSERT INTO alquiler (al_id_cliente, al_id_juego, al_fecha_inicio, al_fecha_devolucion) VALUES (3, 22, '2020-07-15','2020-08-05');
INSERT INTO alquiler (al_id_cliente, al_id_juego, al_fecha_inicio, al_fecha_devolucion) VALUES (4, 33, '2020-07-25','2020-08-03');
INSERT INTO alquiler (al_id_cliente, al_id_juego, al_fecha_inicio, al_fecha_devolucion) VALUES (5, 44, '2020-07-20','2020-08-05');
INSERT INTO alquiler (al_id_cliente, al_id_juego, al_fecha_inicio, al_fecha_devolucion) VALUES (5, 33, '2020-07-31','2020-08-05');