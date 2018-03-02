USE lib_america;

INSERT INTO usuarios (nombre,cargo,contrasena,tipo_usuario)
VALUES 
('Julio','Caja','root','Admin'),
('Cesar','Asesor','1234','Empleado'),
('Carlos','Asesor','5678','Empleado');
SELECT * FROM usuarios;
-- select * from usuarios where nombre = 'Julio' and contrasena = 'root';

-- -----------------------------------------------------

USE lib_america;

INSERT INTO libro
VALUES
(1,'13579','Harry Potter','JK Rowling','Planeta','Mexico',350,'español',399,4),
(2,'24680','La Llave de Plata','HP Lovecraft','Mundo','Mexico',200,'español',199,3),
(3,'12345','El Futbol a Sol y Sombra','Eduardo Galeano','Jupiter','Mexico',250,'español',499,5),
(4,'67890','Aura','Carlos Fuentes','Pluton','Mexico',150,'español',149,6);
SELECT * FROM libro;
-- SELECT * FROM libro WHERE titulo LIKE '%Harry%';

