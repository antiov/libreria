USE lib_america;

INSERT INTO usuarios (nombre,cargo,contrasena,tipo_usuario)
VALUES 
('Julio','dueno','root','admin'),
('Cesar','asesor','1234','empleado'),
('Carlos','asesor','5678','empleado');
SELECT * FROM usuarios;
-- select * from usuarios where nombre = 'Julio' and contrasena = 'root';

-- -----------------------------------------------------

USE lib_america;

INSERT INTO libro
VALUES
('13579','Harry Potter','JK Rowling','Planeta','Mexico',350,'español',399,4),
('24680','La Llave de Plata','HP Lovecraft','Mundo','Mexico',200,'español',199,3),
('12345','El Futbol a Sol y Sombra','Eduardo Galeano','Jupiter','Mexico',250,'español',499,5),
('67890','Aura','Carlos Fuentes','Pluton','Mexico',150,'español',149,6);
SELECT * FROM libro;
-- SELECT * FROM libro WHERE titulo LIKE '%Harry%';
