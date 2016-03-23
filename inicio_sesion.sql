--Contiene información del usuario para que en caso de olvidar la contraseña o el nombre de ususario poderlos recuperar
CREATE TABLE usuario(
 	id_usuario PRIMARY KEY,
	nombre  varchar(30), 
	apellido varchar(30), 
	nickname varchar(15), 
 	correo_electronico varchar(30)
);

--Contiene los datos que son necesarios para iniciar sesion
CREATE TABLE ingreso(
	id_ingreso PRIMARY KEY,
 	nickname varchar(15), 
 	contrasenia integer            
);

