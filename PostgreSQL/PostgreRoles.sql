-- Crea grupo para administradores
CREATE USER ADMINISTRADOR WITH SUPERUSER CREATEROLE LOGIN;

-- Crea grupo para participantes
CREATE USER PARTICIPANTE WITH LOGIN PASSWORD 'PASS';

GRANT SELECT, INSERT, UPDATE, DELETE ON public."USUARIO" TO ADMINISTRADOR;

GRANT SELECT, INSERT, UPDATE, DELETE ON public."USUARIO" TO PARTICIPANTE;
GRANT SELECT ON public."CATEGORIA" TO PARTICIPANTE;
GRANT SELECT ON public."SUBCATEGORIA" TO PARTICIPANTE;
GRANT SELECT, INSERT, UPDATE, DELETE ON public."PUJA" TO PARTICIPANTE;