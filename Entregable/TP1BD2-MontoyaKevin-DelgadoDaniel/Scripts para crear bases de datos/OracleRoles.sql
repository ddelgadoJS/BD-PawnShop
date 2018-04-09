CREATE ROLE C##_ADMINISTRADOR
NOT IDENTIFIED;

CREATE ROLE C##_PARTICIPANTE
IDENTIFIED BY password;

CREATE USER C##_USUARIO_ADMIN IDENTIFIED BY "12345";

GRANT ALL PRIVILEGES to C##_USUARIO_ADMIN;

--GRANT CONNECT, RESOURCE, DBA TO C##_USUARIO_ADMIN;
--GRANT CREATE SESSION TO C##_USUARIO_ADMIN;
--GRANT UNLIMITED TABLESPACE TO C##_USUARIO_ADMIN;