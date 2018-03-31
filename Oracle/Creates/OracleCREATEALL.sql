CREATE TABLE CATEGORIA 
(
  ID NUMBER GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 1 NOT NULL 
, DESCRIPCION NVARCHAR2(60) NOT NULL 
, CONSTRAINT CATEGORIA_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
);

CREATE TABLE USUARIO 
(
  ALIAS VARCHAR2(30) NOT NULL 
, NOMBRE NVARCHAR2(30) NOT NULL 
, APELLIDOS NVARCHAR2(30) NOT NULL 
, DIRECCION NVARCHAR2(40) NOT NULL 
, CEDULA INTEGER NOT NULL 
, CORREO VARCHAR2(40) NOT NULL 
, CALIFICACION SMALLINT DEFAULT 5 NOT NULL 
, PASSWORD VARCHAR2(15) NOT NULL
, CONSTRAINT USUARIO_PK PRIMARY KEY
  (
    ALIAS 
  )
  ENABLE 
);

CREATE TABLE SUBCATEGORIA 
(
  ID NUMBER GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 1 NOT NULL 
, IDCATEGORIA NUMBER NOT NULL 
, DESCRIPCION NVARCHAR2(60) NOT NULL 
, CONSTRAINT SUBCATEGORIA_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
);

CREATE TABLE TELEFONOXUSUARIO 
(
  ID NUMBER GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 1 MINVALUE 1 NOT NULL 
, ALIASUSUARIO VARCHAR2(30) NOT NULL 
, NUMERO VARCHAR2(15) NOT NULL 
, DESCRIPCION NVARCHAR2(20) NOT NULL 
, CONSTRAINT TELEFONOXUSUARIO_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
);

CREATE TABLE TIPOXUSUARIO 
(
  ID NUMBER GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 1 MINVALUE 1 NOT NULL 
, ALIASUSUARIO VARCHAR2(30) NOT NULL 
, DESCRIPCION NVARCHAR2(20) NOT NULL 
, CONSTRAINT TIPOXUSUARIO_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
);

CREATE TABLE ITEM 
(
  ID NUMBER GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 1 NOT NULL 
, PRECIO NUMBER(15, 2) NOT NULL 
, DESCRIPCION NVARCHAR2(50) NOT NULL 
, IDSUBCATEGORIA NUMBER NOT NULL 
, FOTO BLOB 
, CONSTRAINT ITEM_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
);

CREATE TABLE SUBASTA 
(
  ID NUMBER GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 1 NOT NULL 
, IDITEM NUMBER NOT NULL 
, ALIASVENDEDOR VARCHAR2(30) NOT NULL 
, MODOENTREGA NVARCHAR2(30) NOT NULL 
, PRECIOINICIAL NUMBER(15, 2) NOT NULL 
, PRECIOACTUAL NUMBER(15, 2)
, FECHAHORAFIN DATE NOT NULL 
, COMENTARIOVENDEDOR NVARCHAR2(50) 
, COMENTARIOCOMPRADOR NVARCHAR2(50) 
, ALIASCOMPRADOR VARCHAR2(30) 
, CALIFICACIONSUBASTA SMALLINT DEFAULT 0 
, ESTADOSUBASTA SMALLINT DEFAULT 1 NOT NULL 
, CONSTRAINT SUBASTA_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
);

CREATE TABLE PUJA 
(
  ID NUMBER GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 1 NOT NULL 
, ALIASCOMPRADOR VARCHAR2(30) NOT NULL 
, IDSUBASTA NUMBER NOT NULL 
, MONTO NUMBER(15, 2) NOT NULL 
, FECHAHORA DATE NOT NULL 
, CONSTRAINT PUJA_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
);

ALTER TABLE ITEM
ADD CONSTRAINT ITEM_FK1 FOREIGN KEY
(
  IDSUBCATEGORIA 
)
REFERENCES SUBCATEGORIA
(
  ID 
)
ENABLE;

ALTER TABLE PUJA
ADD CONSTRAINT PUJA_FK_COMPRADOR FOREIGN KEY
(
  ALIASCOMPRADOR 
)
REFERENCES USUARIO
(
  ALIAS 
)
ENABLE;

ALTER TABLE PUJA
ADD CONSTRAINT PUJA_FK_SUBASTA FOREIGN KEY
(
  IDSUBASTA 
)
REFERENCES SUBASTA
(
  ID 
)
ENABLE;

ALTER TABLE SUBASTA
ADD CONSTRAINT SUBASTA_FK_COMPRADOR FOREIGN KEY
(
  ALIASCOMPRADOR 
)
REFERENCES USUARIO
(
  ALIAS 
)
ENABLE;

ALTER TABLE SUBASTA
ADD CONSTRAINT SUBASTA_FK_ITEM FOREIGN KEY
(
  IDITEM 
)
REFERENCES ITEM
(
  ID 
)
ENABLE;

ALTER TABLE SUBASTA
ADD CONSTRAINT SUBASTA_FK_VENDEDOR FOREIGN KEY
(
  ALIASVENDEDOR 
)
REFERENCES USUARIO
(
  ALIAS 
)
ENABLE;

ALTER TABLE SUBCATEGORIA
ADD CONSTRAINT SUBCATEGORIA_FK_CATEGORIA FOREIGN KEY
(
  IDCATEGORIA 
)
REFERENCES CATEGORIA
(
  ID 
)
ENABLE;

ALTER TABLE TELEFONOXUSUARIO
ADD CONSTRAINT TELEFONOXUSUARIO_FK1 FOREIGN KEY
(
  ALIASUSUARIO 
)
REFERENCES USUARIO
(
  ALIAS 
)
ENABLE;

ALTER TABLE TIPOXUSUARIO
ADD CONSTRAINT TIPOXUSUARIO_FK1 FOREIGN KEY
(
  ALIASUSUARIO 
)
REFERENCES USUARIO
(
  ALIAS 
)
ENABLE;

-- • Incluir un nuevo usuario (administrador o participante) en el sistema.
-- • Entrada: datos del nuevo usuario.
-- • Usuario autorizado: admin

CREATE OR REPLACE PROCEDURE SP_CREAR_USUARIO
(
  ALIASv IN VARCHAR2
, NOMBREv IN NVARCHAR2
, APELLIDOSv IN NVARCHAR2
, DIRECCIONv IN NVARCHAR2
, CEDULAv IN INTEGER
, CORREOv IN VARCHAR2
, CALIFICACIONv IN SMALLINT DEFAULT 5
, PASSWORDv IN VARCHAR2
, NUMEROv IN VARCHAR2
, DESCRIPCIONv IN NVARCHAR2 DEFAULT 'PRINCIPAL'
, TIPOUSUARIOv IN NVARCHAR2 DEFAULT 'PARTICIPANTE'
)
IS 
-- Variable para saber si ya se encuentra registrado el usuario.
-- Si es 0, no existe el alias.
VAL SMALLINT;

BEGIN
    SELECT COUNT(*) INTO VAL
    FROM SYS.USUARIO
    WHERE SYS.USUARIO.ALIAS = ALIASv
    OR SYS.USUARIO.CEDULA = CEDULAv;

    IF VAL = 0 THEN
      INSERT INTO SYS.USUARIO (ALIAS, NOMBRE, APELLIDOS, DIRECCION, CEDULA, CORREO, CALIFICACION, PASSWORD)
      VALUES (ALIASv, NOMBREv, APELLIDOSv, DIRECCIONv, CEDULAv, CORREOv, CALIFICACIONv, PASSWORDv);
    
      INSERT INTO SYS.TIPOXUSUARIO (ALIASUSUARIO, DESCRIPCION)
      VALUES (ALIASv, TIPOUSUARIOv);

      INSERT INTO SYS.TELEFONOXUSUARIO (ALIASUSUARIO, NUMERO, DESCRIPCION)
      VALUES (ALIASv, NUMEROv, DESCRIPCIONv);
    
      EXECUTE IMMEDIATE 'CREATE USER C##_' || ALIASv || ' IDENTIFIED BY "' || PASSWORDv ||'"';
      
      IF TIPOUSUARIOv = 'ADMINISTRADOR' THEN -- Crear administrador
        EXECUTE IMMEDIATE 'GRANT CONNECT, RESOURCE, DBA TO C##_' || ALIASv;
        EXECUTE IMMEDIATE 'GRANT CREATE SESSION TO C##_' || ALIASv;
        EXECUTE IMMEDIATE 'GRANT UNLIMITED TABLESPACE TO C##_' || ALIASv;
        EXECUTE IMMEDIATE 'GRANT SELECT, INSERT, UPDATE, DELETE ON SYS.USUARIO TO C##_' || ALIASv;
      
      ELSE -- Crear participante
        EXECUTE IMMEDIATE 'GRANT CONNECT, RESOURCE TO C##_' || ALIASv;
        EXECUTE IMMEDIATE 'GRANT CREATE SESSION TO C##_' || ALIASv;
        EXECUTE IMMEDIATE 'GRANT UNLIMITED TABLESPACE TO C##_' || ALIASv;
        EXECUTE IMMEDIATE 'GRANT SELECT, INSERT, UPDATE, DELETE ON SYS.USUARIO TO C##_' || ALIASv;
        EXECUTE IMMEDIATE 'GRANT SELECT ON SYS.CATEGORIA TO C##_' || ALIASv;
        EXECUTE IMMEDIATE 'GRANT SELECT ON SYS.SUBCATEGORIA TO C##_' || ALIASv;
        EXECUTE IMMEDIATE 'GRANT SELECT, INSERT, UPDATE, DELETE ON SYS.PUJA TO C##_' || ALIASv;
      END IF;

      COMMIT;
      DBMS_OUTPUT.PUT_LINE('1');  -- Usuario creado.
    ELSE
      DBMS_OUTPUT.PUT_LINE('0'); -- Alias o cédula duplicadas.
    END IF;

    EXCEPTION
      WHEN OTHERS THEN
        ROLLBACK;
END;
/

-- • Incluir un nuevo administrador en el sistema.
-- • Entrada: datos del nuevo administrador.
-- • Usuario autorizado: admin
-- • Test: EXEC SP_CREAR_ADMIN (ALIASv => 'HOLA', NOMBREv => 'NOMBREHOLA', APELLIDOSv => 'APELLIDOSHOLA', DIRECCIONv => 'DIRECCIONHOLA', CEDULAv => 5555, CORREOv => 'JOJO', PASSWORDv => 'PASS');

CREATE OR REPLACE PROCEDURE SP_CREAR_ADMIN
(
  ALIASv IN VARCHAR2
, NOMBREv IN NVARCHAR2
, APELLIDOSv IN NVARCHAR2
, DIRECCIONv IN NVARCHAR2
, CEDULAv IN INTEGER
, CORREOv IN VARCHAR2
, CALIFICACIONv IN SMALLINT DEFAULT 5
, PASSWORDv IN VARCHAR2
, NUMEROv IN VARCHAR2
, DESCRIPCIONv IN NVARCHAR2 DEFAULT 'PRINCIPAL'
)
IS 
-- Variable para saber si ya se encuentra registrado el usuario.
-- Si es 0, no existe el alias.
VAL SMALLINT;

BEGIN
    SELECT COUNT(*) INTO VAL
    FROM SYS.USUARIO
    WHERE SYS.USUARIO.ALIAS = ALIASv
    OR SYS.USUARIO.CEDULA = CEDULAv;

    IF VAL = 0 THEN
      INSERT INTO SYS.USUARIO (ALIAS, NOMBRE, APELLIDOS, DIRECCION, CEDULA, CORREO, CALIFICACION, PASSWORD)
      VALUES (ALIASv, NOMBREv, APELLIDOSv, DIRECCIONv, CEDULAv, CORREOv, CALIFICACIONv, PASSWORDv);

      INSERT INTO SYS.TIPOXUSUARIO (ALIASUSUARIO, DESCRIPCION)
      VALUES (ALIASv, 'ADMINISTRADOR');

      INSERT INTO SYS.TELEFONOXUSUARIO (ALIASUSUARIO, NUMERO, DESCRIPCION)
      VALUES (ALIASv, NUMEROv, DESCRIPCIONv);
    
      EXECUTE IMMEDIATE 'CREATE USER C##_' || ALIASv || ' IDENTIFIED BY "' || PASSWORDv ||'"';
      EXECUTE IMMEDIATE 'GRANT CONNECT, RESOURCE, DBA TO C##_' || ALIASv;
      EXECUTE IMMEDIATE 'GRANT CREATE SESSION TO C##_' || ALIASv;
      EXECUTE IMMEDIATE 'GRANT UNLIMITED TABLESPACE TO C##_' || ALIASv;
      EXECUTE IMMEDIATE 'GRANT SELECT, INSERT, UPDATE, DELETE ON SYS.USUARIO TO C##_' || ALIASv;
    
    COMMIT;
    END IF;
    
    EXCEPTION
      WHEN OTHERS THEN
        ROLLBACK;
END;
/

-- • Modifica los datos de un administrador existente.
-- • Entrada: identificador de administrador y datos del administrador.
-- • Usuario autorizado: admin
-- • Test: EXEC SP_MODIFICAR_ADMIN (ALIASv => 'HOLA7', ALIASv2 => 'HOLAUPDATED', NOMBREv => 'NOMBREUPDATED', APELLIDOSv => 'APELLIDOSUPDATED', DIRECCIONv => 'DIRUPDATED', CEDULAv => 5556, CORREOv => 'JOJOUPDATED', CALIFICACIONv => 1, PASSWORDv => 'PASSUPDATED');

CREATE OR REPLACE PROCEDURE SP_MODIFICAR_ADMIN
(
  ALIASv IN VARCHAR2 -- Alias actual.
, NOMBREv IN NVARCHAR2 DEFAULT NULL
, APELLIDOSv IN NVARCHAR2 DEFAULT NULL
, DIRECCIONv IN NVARCHAR2 DEFAULT NULL
, CEDULAv IN INTEGER DEFAULT NULL
, CORREOv IN VARCHAR2 DEFAULT NULL
, PASSWORDv IN VARCHAR2 DEFAULT NULL
, NUMEROv IN VARCHAR2 DEFAULT NULL
, DESCRIPCIONv IN NVARCHAR2 DEFAULT 'PRINCIPAL'
)
IS 
-- Variable para saber si ya se encuentra registrado el usuario.
-- Si es 0, no existe el alias.
VAL SMALLINT;

BEGIN
    SELECT COUNT(*) INTO VAL
    FROM SYS.USUARIO
    WHERE SYS.USUARIO.ALIAS = ALIASv;
    
    IF VAL = 1 THEN
      IF NOMBREv IS NOT NULL THEN
        SP_MODIFICAR_USUARIO_NOMBRE(ALIASv=>ALIASv, NOMBREv=>NOMBREv);
      END IF;

      IF APELLIDOSv IS NOT NULL THEN
        SP_MODIFICAR_USUARIO_APELLIDOS(ALIASv=>ALIASv, APELLIDOSv=>APELLIDOSv);
      END IF;

      IF DIRECCIONv IS NOT NULL THEN
        SP_MODIFICAR_USUARIO_DIRECCION(ALIASv=>ALIASv, DIRECCIONv=>DIRECCIONv);
      END IF;

      IF CEDULAv IS NOT NULL THEN
        SP_MODIFICAR_USUARIO_CEDULA(ALIASv=>ALIASv, CEDULAv=>CEDULAv);
      END IF;

      IF CORREOv IS NOT NULL THEN
        SP_MODIFICAR_USUARIO_CORREO(ALIASv=>ALIASv, CORREOv=>CORREOv);
      END IF;

      IF PASSWORDv IS NOT NULL THEN
        SP_MODIFICAR_USUARIO_PASSWORD(ALIASv=>ALIASv, PASSWORDv=>PASSWORDv);
      END IF;

      IF NUMEROv IS NOT NULL THEN
        SP_MODIFICAR_USUARIO_NUMERO(ALIASv=>ALIASv, NUMEROv=>NUMEROv);
      END IF;

      -- If new alias create new user
      IF PASSWORDv IS NOT NULL THEN
        EXECUTE IMMEDIATE 'ALTER USER C##_' || ALIASv || ' IDENTIFIED BY "' || PASSWORDv ||'"';
      END IF;

    COMMIT;
    END IF;
    
    EXCEPTION
      WHEN OTHERS THEN
        ROLLBACK;
END;
/

-- • Incluir un nuevo participante en el sistema.
-- • Entrada: datos del nuevo participante.
-- • Usuario autorizado: admin
-- • EXEC SP_CREAR_PARTICIPANTE (ALIASv => 'HOLA', NOMBREv => 'NOMBREHOLA', APELLIDOSv => 'APELLIDOSHOLA', DIRECCIONv => 'DIRECCIONHOLA', CEDULAv => 5555, CORREOv => 'JOJO', PASSWORDv => 'PASS');

CREATE OR REPLACE PROCEDURE SP_CREAR_PARTICIPANTE
(
  ALIASv IN VARCHAR2
, NOMBREv IN NVARCHAR2
, APELLIDOSv IN NVARCHAR2
, DIRECCIONv IN NVARCHAR2
, CEDULAv IN INTEGER
, CORREOv IN VARCHAR2
, CALIFICACIONv IN SMALLINT DEFAULT 5
, PASSWORDv IN VARCHAR2
, NUMEROv IN VARCHAR2
, DESCRIPCIONv IN NVARCHAR2 DEFAULT 'PRINCIPAL'
)
IS 
-- Variable para saber si ya se encuentra registrado el usuario.
-- Si es 0, no existe el alias.
VAL SMALLINT;

BEGIN
    SELECT COUNT(*) INTO VAL
    FROM SYS.USUARIO
    WHERE SYS.USUARIO.ALIAS = ALIASv
    OR SYS.USUARIO.CEDULA = CEDULAv;

    IF VAL = 0 THEN
      INSERT INTO SYS.USUARIO (ALIAS, NOMBRE, APELLIDOS, DIRECCION, CEDULA, CORREO, CALIFICACION, PASSWORD)
      VALUES (ALIASv, NOMBREv, APELLIDOSv, DIRECCIONv, CEDULAv, CORREOv, CALIFICACIONv, PASSWORDv);
    
      INSERT INTO SYS.TIPOXUSUARIO (ALIASUSUARIO, DESCRIPCION)
      VALUES (ALIASv, 'PARTICIPANTE');

      INSERT INTO SYS.TELEFONOXUSUARIO (ALIASUSUARIO, NUMERO, DESCRIPCION)
      VALUES (ALIASv, NUMEROv, DESCRIPCIONv);
    
      EXECUTE IMMEDIATE 'CREATE USER C##_' || ALIASv || ' IDENTIFIED BY "' || PASSWORDv ||'"';
      EXECUTE IMMEDIATE 'GRANT CONNECT, RESOURCE TO C##_' || ALIASv;
      EXECUTE IMMEDIATE 'GRANT CREATE SESSION TO C##_' || ALIASv;
      EXECUTE IMMEDIATE 'GRANT UNLIMITED TABLESPACE TO C##_' || ALIASv;
      EXECUTE IMMEDIATE 'GRANT SELECT, INSERT, UPDATE, DELETE ON SYS.USUARIO TO C##_' || ALIASv;
      EXECUTE IMMEDIATE 'GRANT SELECT ON SYS.CATEGORIA TO C##_' || ALIASv;
      EXECUTE IMMEDIATE 'GRANT SELECT ON SYS.SUBCATEGORIA TO C##_' || ALIASv;
      EXECUTE IMMEDIATE 'GRANT SELECT, INSERT, UPDATE, DELETE ON SYS.PUJA TO C##_' || ALIASv;

    COMMIT;
    END IF;
    
    EXCEPTION
      WHEN OTHERS THEN
        ROLLBACK;
END;
/

-- • Modifica los datos de un usuario existente.
-- • Entrada: identificador de usuario y datos del usuario.
-- • Usuario autorizado: admin
-- • Test: EXEC SP_MODIFICAR_PARTICIPANTE (ALIASv => 'HOLA7', ALIASv2 => 'HOLAUPDATED', NOMBREv => 'NOMBREUPDATED', APELLIDOSv => 'APELLIDOSUPDATED', DIRECCIONv => 'DIRUPDATED', CEDULAv => 5556, CORREOv => 'JOJOUPDATED', CALIFICACIONv => 1, PASSWORDv => 'PASSUPDATED');

CREATE OR REPLACE PROCEDURE SP_MODIFICAR_PARTICIPANTE
(
  ALIASv IN VARCHAR2
, NOMBREv IN NVARCHAR2 DEFAULT NULL
, APELLIDOSv IN NVARCHAR2 DEFAULT NULL
, DIRECCIONv IN NVARCHAR2 DEFAULT NULL
, CEDULAv IN INTEGER DEFAULT NULL
, CORREOv IN VARCHAR2 DEFAULT NULL
, PASSWORDv IN VARCHAR2 DEFAULT NULL
, NUMEROv IN VARCHAR2 DEFAULT NULL
, DESCRIPCIONv IN NVARCHAR2 DEFAULT 'PRINCIPAL'
)
IS 
-- Variable para saber si ya se encuentra registrado el usuario.
-- Si es 0, no existe el alias.
VAL SMALLINT;

BEGIN
    SELECT COUNT(*) INTO VAL
    FROM SYS.USUARIO
    WHERE SYS.USUARIO.ALIAS = ALIASv;
    
    IF VAL = 1 THEN
      IF NOMBREv IS NOT NULL THEN
        SP_MODIFICAR_USUARIO_NOMBRE(ALIASv=>ALIASv, NOMBREv=>NOMBREv);
      END IF;

      IF APELLIDOSv IS NOT NULL THEN
        SP_MODIFICAR_USUARIO_APELLIDOS(ALIASv=>ALIASv, APELLIDOSv=>APELLIDOSv);
      END IF;

      IF DIRECCIONv IS NOT NULL THEN
        SP_MODIFICAR_USUARIO_DIRECCION(ALIASv=>ALIASv, DIRECCIONv=>DIRECCIONv);
      END IF;

      IF CEDULAv IS NOT NULL THEN
        SP_MODIFICAR_USUARIO_CEDULA(ALIASv=>ALIASv, CEDULAv=>CEDULAv);
      END IF;

      IF CORREOv IS NOT NULL THEN
        SP_MODIFICAR_USUARIO_CORREO(ALIASv=>ALIASv, CORREOv=>CORREOv);
      END IF;

      IF PASSWORDv IS NOT NULL THEN
        SP_MODIFICAR_USUARIO_PASSWORD(ALIASv=>ALIASv, PASSWORDv=>PASSWORDv);
      END IF;

      IF NUMEROv IS NOT NULL THEN
        SP_MODIFICAR_USUARIO_NUMERO(ALIASv=>ALIASv, NUMEROv=>NUMEROv);
      END IF;

      -- If new alias create new user
      IF PASSWORDv IS NOT NULL THEN
        EXECUTE IMMEDIATE 'ALTER USER C##_' || ALIASv || ' IDENTIFIED BY "' || PASSWORDv ||'"';
      END IF;

    COMMIT;
    END IF;
    
    EXCEPTION
      WHEN OTHERS THEN
        ROLLBACK;
END;
/

-- • Incluir un nueva subasta
-- • Entrada: datos de la subasta
-- • Usuario autorizado: participante
-- • Test: EXEC SP_SUBASTAR_ITEM (ALIASv => 'HOLA7', ALIASv2 => 'HOLAUPDATED', NOMBREv => 'NOMBREUPDATED', APELLIDOSv => 'APELLIDOSUPDATED', DIRECCIONv => 'DIRUPDATED', CEDULAv => 5556, CORREOv => 'JOJOUPDATED', CALIFICACIONv => 1, PASSWORDv => 'PASSUPDATED');

--EXEC SP_SUBASTAR_ITEM (ALIASVENDEDORv=>3,MODOENTREGAv=>'Carro', PRECIOINICIALv=>5, FECHAHORAFINv=>'2018/04/03 21:02:44', COMENTARIOVENDEDORv=>'hola', ESTADOSUBASTAv=>1, DESCRIPCIONITEMv=>'botella', IDSUBCATEGORIAv=>5)

CREATE OR REPLACE PROCEDURE SP_SUBASTAR_ITEM --INCOMPLETED
(
  ALIASVENDEDORv IN VARCHAR2
, MODOENTREGAv IN NVARCHAR2
, PRECIOINICIALv IN NUMBER
, FECHAFINv IN VARCHAR2
, HORAFINv IN VARCHAR2
, COMENTARIOVENDEDORv IN NVARCHAR2
, ESTADOSUBASTAv IN SMALLINT DEFAULT 1 -- 1: Subasta activa
, DESCRIPCIONITEMv IN NVARCHAR2
, IDSUBCATEGORIAv IN NUMBER
--, FOTO
)
IS
  IDITEMv NUMBER;
BEGIN
    -- Crea ítem de subasta.
    INSERT INTO SYS.ITEM (PRECIO, DESCRIPCION, IDSUBCATEGORIA, FOTO)
    VALUES (PRECIOINICIALv, DESCRIPCIONITEMv, IDSUBCATEGORIAv, EMPTY_BLOB());
    
    SELECT COUNT(*) INTO IDITEMv
    FROM SYS.ITEM;
    
    --Crea subasta.
    INSERT INTO SYS.SUBASTA (IDITEM, ALIASVENDEDOR, MODOENTREGA, PRECIOINICIAL, FECHAHORAFIN, COMENTARIOVENDEDOR, ESTADOSUBASTA)
    VALUES (99, ALIASVENDEDORv, MODOENTREGAv, PRECIOINICIALv, TO_DATE(FECHAFINv || ' ' || HORAFINv, 'yyyy/mm/dd hh24:mi:ss'), COMENTARIOVENDEDORv, ESTADOSUBASTAv);

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('1');
    
    EXCEPTION
      WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('0');
END;
/

-- • Lista todas las subastas activas que cumplen con las condiciones de entrada.
-- • Entrada: categoría y sub categoría.
-- • Listar resultado por tiempo restante de puja decreciente.
-- • Usuario autorizado: cualquiera
-- • Test: 

CREATE OR REPLACE PROCEDURE SP_LISTAR_SUBASTAS
(
  CATEGORIAv IN NUMBER DEFAULT NULL
, SUBCATEGORIAv IN NUMBER
)
IS
BEGIN
  -- No es necesario buscar la categoría, pues ya al seleccionar subcategoría la categoría enviada está asegurada.
  DECLARE 
  CURSOR CSUBASTA IS 
    SELECT SUBASTA.ALIASVENDEDOR, SUBASTA.PRECIOINICIAL, SUBASTA.PRECIOACTUAL, SUBASTA.FECHAHORAFIN, SUBASTA.COMENTARIOVENDEDOR
    FROM SYS.SUBASTA SUBASTA
    INNER JOIN SYS.ITEM ITEM
    ON ITEM.ID = SUBASTA.IDITEM
    WHERE ITEM.IDSUBCATEGORIA = SUBCATEGORIAv
    AND SUBASTA.ESTADOSUBASTA = 1 -- 1: subasta activa.
    ORDER BY SUBASTA.FECHAHORAFIN DESC;

  ALIASVENDEDORr SYS.SUBASTA.ALIASVENDEDOR%TYPE;
  PRECIOINICIALr SYS.SUBASTA.PRECIOINICIAL%TYPE;
  PRECIOACTUALr SYS.SUBASTA.PRECIOACTUAL%TYPE;
  FECHAHORAFINr SYS.SUBASTA.FECHAHORAFIN%TYPE;
  COMENTARIOVENDEDORr SYS.SUBASTA.COMENTARIOVENDEDOR%TYPE;

  BEGIN
    OPEN CSUBASTA;
      LOOP
        FETCH CSUBASTA INTO ALIASVENDEDORr, PRECIOINICIALr, PRECIOACTUALr, FECHAHORAFINr, COMENTARIOVENDEDORr;
        EXIT WHEN CSUBASTA%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(ALIASVENDEDORr || ', ' || TO_CHAR(FECHAHORAFINr,'DD-MON-YYYY') || ', ' || TO_CHAR(FECHAHORAFINr,'HH24:MI'));
      END LOOP;
    CLOSE CSUBASTA;
  END;

  COMMIT;

  EXCEPTION
    WHEN OTHERS THEN
      ROLLBACK;
END;
/

-- • Para un usuario dado, listar las subastas que ha realizado.
-- • Entrada: identificador del usuario vendedor.
-- • Salida: listado cronológico de ítemes ofrecidos, precios base,
--   precios finales, comentarios de los usuarios compradores que ganaron las subastas.
-- • Usuario autorizado: cualquiera
-- • Test: EXEC SP_CREAR_ADMIN (ALIASv => 'HOLA', NOMBREv => 'NOMBREHOLA', APELLIDOSv => 'APELLIDOSHOLA', DIRECCIONv => 'DIRECCIONHOLA', CEDULAv => 5555, CORREOv => 'JOJO', PASSWORDv => 'PASS');

CREATE OR REPLACE PROCEDURE SP_LISTAR_SUBASTAS_USUARIO
(
  ALIASVENDEDORv IN VARCHAR2
)
IS
BEGIN
  DECLARE 
  CURSOR CSUBASTA IS 
    SELECT SUBASTA.FECHAHORAFIN, SUBASTA.IDITEM, SUBASTA.PRECIOINICIAL, SUBASTA.PRECIOACTUAL, SUBASTA.COMENTARIOCOMPRADOR, SUBASTA.ESTADOSUBASTA
    FROM SYS.SUBASTA SUBASTA
    WHERE SUBASTA.ALIASVENDEDOR = ALIASVENDEDORv
    ORDER BY SUBASTA.FECHAHORAFIN;

  FECHAHORAFINr SYS.SUBASTA.FECHAHORAFIN%TYPE;
  IDITEMr SYS.SUBASTA.IDITEM%TYPE;
  PRECIOINICIALr SYS.SUBASTA.PRECIOINICIAL%TYPE;
  PRECIOACTUALr SYS.SUBASTA.PRECIOACTUAL%TYPE;
  COMENTARIOCOMPRADORr SYS.SUBASTA.COMENTARIOCOMPRADOR%TYPE;
  ESTADOSUBASTAr SYS.SUBASTA.ESTADOSUBASTA%TYPE;

  BEGIN
    OPEN CSUBASTA;
      LOOP
        FETCH CSUBASTA INTO FECHAHORAFINr, IDITEMr, PRECIOINICIALr, PRECIOACTUALr, COMENTARIOCOMPRADORr, ESTADOSUBASTAr;
        EXIT WHEN CSUBASTA%NOTFOUND;
        --DBMS_OUTPUT.PUT_LINE(ALIASVENDEDORv || ', ' || FECHAHORAFINr);
      END LOOP;
    CLOSE CSUBASTA;
  END;
  COMMIT;
  
  EXCEPTION
    WHEN OTHERS THEN
      ROLLBACK;
END;
/

-- • Agregar teléfono a usuario.
-- • Entrada: datos del nuevo teléfono.
-- • Usuario autorizado: admin

CREATE OR REPLACE PROCEDURE SP_AGREGAR_TEL
(
  ALIASv IN VARCHAR2
, NUMEROv IN VARCHAR2
, DESCRIPCIONv IN NVARCHAR2
)
IS 
-- Variable para saber si ya se encuentra registrado el usuario.
-- Si es 0, no existe el alias.
VAL SMALLINT;

BEGIN
    SELECT COUNT(*) INTO VAL
    FROM SYS.USUARIO
    WHERE SYS.USUARIO.ALIAS = ALIASv;

    IF VAL = 1 THEN
      INSERT INTO SYS.TELEFONOXUSUARIO (ALIASUSUARIO, NUMERO, DESCRIPCION)
      VALUES (ALIASv, NUMEROv, DESCRIPCIONv);
      DBMS_OUTPUT.PUT_LINE('1');
    ELSE
      DBMS_OUTPUT.PUT_LINE('0');
    END IF;
    
    COMMIT;
END;
/

-- • Agregar ítem.
-- • Entrada: datos del nuevo ítem.
-- • Usuario autorizado: participante.

CREATE OR REPLACE PROCEDURE SP_AGREGAR_ITEM
(
  PRECIOv IN NUMBER
, DESCRIPCIONv IN NVARCHAR2
, IDSUBCATEGORIAv IN NUMBER
--, pdname IN VARCHAR2 DEFAULT NULL -- directory name
--, pfname IN VARCHAR2 DEFAULT NULL -- file name
)
IS 
  --src_file BFILE; -- source file
  --dst_file BLOB; -- designation file
  --lgh_file BINARY_INTEGER; -- file length
BEGIN
    --IF (pdname = NULL) THEN
      INSERT INTO SYS.ITEM (PRECIO, DESCRIPCION, IDSUBCATEGORIA, FOTO)
      VALUES (PRECIOv, DESCRIPCIONv, IDSUBCATEGORIAv, EMPTY_BLOB());
    
    --ELSE
      --src_file := bfilename(pdname, pfname);

      -- Open the file
      --dbms_lob.fileopen(src_file, dbms_lob.file_readonly);

      -- Determine length
      --lgh_file := dbms_lob.getlength(src_file);

      -- read the file
      --dbms_lob.loadfromfile(dst_file, src_file, lgh_file);

      -- Update the blob field
      --UPDATE SYS.ITEM
      --SET SYS.ITEM.FOTO = dst_file
      --WHERE SYS.ITEM.ID = 5; -- CAMBIAR A SELECT COUNT(*) FROM ITEM;

      -- Close file
      --dbms_lob.fileclose(src_file);
    --END IF;

    COMMIT;
END;
/

-- • Hacer login desde aplicación.
-- • Entrada: alias, password.
-- • Usuario autorizado: cualquiera.

CREATE OR REPLACE PROCEDURE SP_LOGIN
(
  ALIASv IN VARCHAR2
, PASSWORDv IN VARCHAR2
)
IS 
-- Variables para saber si ya se encuentra registrado el usuario.
USR SMALLINT; -- Si es 0, no existe el alias.
PSS SMALLINT; -- Si es 0, el password es incorrecto.
TYP SMALLINT; -- 0: ADMINISTRADOR. 1: PARTICIPANTE.

BEGIN
  SELECT COUNT(*) INTO USR
  FROM SYS.USUARIO
  WHERE SYS.USUARIO.ALIAS = ALIASv;

  IF USR = 1 THEN -- Alias encontrado.
    SELECT COUNT(*) INTO PSS
    FROM SYS.USUARIO
    WHERE SYS.USUARIO.ALIAS = ALIASv
    AND SYS.USUARIO.PASSWORD = PASSWORDv;

    IF PSS = 1 THEN -- Password y alias correcto.
      SELECT COUNT(*) INTO TYP
      FROM SYS.TIPOXUSUARIO
      WHERE SYS.TIPOXUSUARIO.ALIASUSUARIO = ALIASv
      AND SYS.TIPOXUSUARIO.DESCRIPCION = 'PARTICIPANTE';
    
      IF TYP = 0 THEN
        DBMS_OUTPUT.PUT_LINE('1,1,ADMINISTRADOR');
      ELSE
        DBMS_OUTPUT.PUT_LINE('1,1,PARTICIPANTE');
      END IF;
    ELSE -- Password incorrecto.
      DBMS_OUTPUT.PUT_LINE('1,0,NULL');
    END IF;
  ELSE -- Alias no encontrado.
    DBMS_OUTPUT.PUT_LINE('0,NULL,NULL');
  END IF;
END;
/

-- • Seleccionar todas las categorías.
-- • Entrada: -
-- • Usuario autorizado: admin.

CREATE OR REPLACE PROCEDURE SP_SELECT_CATEGORIAS
IS 
BEGIN
  DECLARE 
  CURSOR CCATEGORIAS IS 
    SELECT CATEGORIA.DESCRIPCION
    FROM SYS.CATEGORIA CATEGORIA
    ORDER BY CATEGORIA.ID;

  CATEGORIAr SYS.CATEGORIA.DESCRIPCION%TYPE;

  BEGIN
    OPEN CCATEGORIAS;
      LOOP
        FETCH CCATEGORIAS INTO CATEGORIAr;
        EXIT WHEN CCATEGORIAS%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(CATEGORIAr);
      END LOOP;
    CLOSE CCATEGORIAS;
  END;
  COMMIT;
  
  EXCEPTION
    WHEN OTHERS THEN
      ROLLBACK;
END;
/

-- • Seleccionar todas las categorías.
-- • Entrada: IDCATEGORIAv
-- • Usuario autorizado: admin.

CREATE OR REPLACE PROCEDURE SP_SELECT_SUBCATEGORIAS
(
  IDCATEGORIAv NUMBER
)
IS 
BEGIN
  DECLARE 
  CURSOR CSUBCATEGORIAS IS 
    SELECT SUBCATEGORIA.DESCRIPCION
    FROM SYS.SUBCATEGORIA SUBCATEGORIA
    WHERE SUBCATEGORIA.IDCATEGORIA = IDCATEGORIAv
    ORDER BY SUBCATEGORIA.ID;

  SUBCATEGORIAr SYS.SUBCATEGORIA.DESCRIPCION%TYPE;

  BEGIN
    OPEN CSUBCATEGORIAS;
      LOOP
        FETCH CSUBCATEGORIAS INTO SUBCATEGORIAr;
        EXIT WHEN CSUBCATEGORIAS%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(SUBCATEGORIAr);
      END LOOP;
    CLOSE CSUBCATEGORIAS;
  END;
  COMMIT;
  
  EXCEPTION
    WHEN OTHERS THEN
      ROLLBACK;
END;
/

-- • Obtener índice de subcategoria.
-- • Entrada: IDCATEGORIAv, DESCRIPCIONSUBCATEGORIAv
-- • Usuario autorizado: participante.

CREATE OR REPLACE PROCEDURE SP_GET_IND_SUBCATEGORIA
(
    IDCATEGORIAv NUMBER
  , DESCRIPCIONSUBCATEGORIAv VARCHAR2
)
IS 
BEGIN
  DECLARE 
  CURSOR CSUBCATEGORIAS IS 
    SELECT SUBCATEGORIA.ID
    FROM SYS.SUBCATEGORIA SUBCATEGORIA
    WHERE SUBCATEGORIA.IDCATEGORIA = IDCATEGORIAv
    AND SUBCATEGORIA.IDCATEGORIA = DESCRIPCIONSUBCATEGORIAv
    ORDER BY SUBCATEGORIA.ID;

  SUBCATEGORIAr SYS.SUBCATEGORIA.ID%TYPE;

  BEGIN
    OPEN CSUBCATEGORIAS;
      LOOP
        FETCH CSUBCATEGORIAS INTO SUBCATEGORIAr;
        EXIT WHEN CSUBCATEGORIAS%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(SUBCATEGORIAr);
      END LOOP;
    CLOSE CSUBCATEGORIAS;
  END;
  COMMIT;
  
  EXCEPTION
    WHEN OTHERS THEN
      ROLLBACK;
END;
/

-- • Seleccionar todos los usuarios.
-- • Entrada: -
-- • Usuario autorizado: admin.

CREATE OR REPLACE PROCEDURE SP_SELECT_USERS
IS 
BEGIN
  DECLARE 
  CURSOR CUSERS IS 
    SELECT USUARIO.ALIAS
    FROM SYS.USUARIO USUARIO
    ORDER BY USUARIO.ALIAS;

  ALIASr SYS.USUARIO.ALIAS%TYPE;

  BEGIN
    OPEN CUSERS;
      LOOP
        FETCH CUSERS INTO ALIASr;
        EXIT WHEN CUSERS%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(ALIASr);
      END LOOP;
    CLOSE CUSERS;
  END;
  COMMIT;
  
  EXCEPTION
    WHEN OTHERS THEN
      ROLLBACK;
END;
/

-- • Consulta si es PARTICIPANTE o ADMINISTRADOR y llama el SP correspondiente.
-- • Entrada: ALIASv
-- • Usuario autorizado: admin.

CREATE OR REPLACE PROCEDURE SP_MODIFICAR_USUARIO
(
  ALIASv IN VARCHAR2
, NOMBREv IN NVARCHAR2 DEFAULT NULL
, APELLIDOSv IN NVARCHAR2 DEFAULT NULL
, DIRECCIONv IN NVARCHAR2 DEFAULT NULL
, CEDULAv IN INTEGER DEFAULT NULL
, CORREOv IN VARCHAR2 DEFAULT NULL
, PASSWORDv IN VARCHAR2 DEFAULT NULL
, NUMEROv IN VARCHAR2 DEFAULT NULL
, DESCRIPCIONv IN NVARCHAR2 DEFAULT 'PRINCIPAL'
)
IS 
-- Variables para saber si ya se encuentra registrado el usuario.
USR SMALLINT; -- Si es 0, no existe el alias.
TYP SMALLINT; -- 0: ADMINISTRADOR. 1: PARTICIPANTE.
BEGIN
  SELECT COUNT(*) INTO USR
  FROM SYS.USUARIO
  WHERE SYS.USUARIO.ALIAS = ALIASv_;

  IF USR = 1 THEN -- Alias encontrado.
    SELECT COUNT(*) INTO TYP
    FROM SYS.TIPOXUSUARIO
    WHERE SYS.TIPOXUSUARIO.ALIASUSUARIO = ALIASv_
    AND SYS.TIPOXUSUARIO.DESCRIPCION = 'PARTICIPANTE';
    
    IF TYP = 0 THEN
      SP_MODIFICAR_ADMIN(ALIASv=>ALIASv,NOMBREv=>NOMBREv,APELLIDOSv=>APELLIDOSv,DIRECCIONv=>DIRECCIONv,CEDULAv=>CEDULAv,CORREOv=>CORREOv,PASSWORDv=>PASSWORDv,NUMEROv=>NUMEROv,DESCRIPCIONv=>DESCRIPCIONv);
      DBMS_OUTPUT.PUT_LINE('1,ADMINISTRADOR');
    ELSE
      SP_MODIFICAR_PARTICIPANTE(ALIASv=>ALIASv,NOMBREv=>NOMBREv,APELLIDOSv=>APELLIDOSv,DIRECCIONv=>DIRECCIONv,CEDULAv=>CEDULAv,CORREOv=>CORREOv,PASSWORDv=>PASSWORDv,NUMEROv=>NUMEROv,DESCRIPCIONv=>DESCRIPCIONv);
      DBMS_OUTPUT.PUT_LINE('1,PARTICIPANTE');
    END IF;
  ELSE -- Alias no encontrado.
    DBMS_OUTPUT.PUT_LINE('0,NULL');
  END IF;
END;
/

-- • Actualiza NOMBRE de usuario.
-- • Entrada: ALIASv, NOMBREv
-- • Usuario autorizado: admin.

CREATE OR REPLACE PROCEDURE SP_MODIFICAR_USUARIO_NOMBRE
(
  ALIASv IN VARCHAR2 -- Alias actual.
, NOMBREv IN NVARCHAR2
)
IS
-- Variables para saber si ya se encuentra registrado el usuario.
USR SMALLINT; -- Si es 0, no existe el alias.
BEGIN
  SELECT COUNT(*) INTO USR
  FROM SYS.USUARIO
  WHERE SYS.USUARIO.ALIAS = ALIASv;

  IF USR = 1 THEN -- Alias encontrado.
    UPDATE SYS.USUARIO 
      SET   NOMBRE = NOMBREv
      WHERE ALIAS = ALIASv;
  END IF;
END;
/

-- • Actualiza APELLIDOS de usuario.
-- • Entrada: ALIASv, APELLIDOSv.
-- • Usuario autorizado: admin.

CREATE OR REPLACE PROCEDURE SP_MODIFICAR_USUARIO_APELLIDOS
(
  ALIASv IN VARCHAR2 -- Alias actual.
, APELLIDOSv IN NVARCHAR2
)
IS
-- Variables para saber si ya se encuentra registrado el usuario.
USR SMALLINT; -- Si es 0, no existe el alias.
BEGIN
  SELECT COUNT(*) INTO USR
  FROM SYS.USUARIO
  WHERE SYS.USUARIO.ALIAS = ALIASv;

  IF USR = 1 THEN -- Alias encontrado.
    UPDATE SYS.USUARIO 
      SET   APELLIDOS = APELLIDOSv
      WHERE ALIAS = ALIASv;
  END IF;
END;
/

-- • Actualiza DIRECCION de usuario.
-- • Entrada: ALIASv, DIRECCIONv.
-- • Usuario autorizado: admin.

CREATE OR REPLACE PROCEDURE SP_MODIFICAR_USUARIO_DIRECCION
(
  ALIASv IN VARCHAR2 -- Alias actual.
, DIRECCIONv IN NVARCHAR2
)
IS
-- Variables para saber si ya se encuentra registrado el usuario.
USR SMALLINT; -- Si es 0, no existe el alias.
BEGIN
  SELECT COUNT(*) INTO USR
  FROM SYS.USUARIO
  WHERE SYS.USUARIO.ALIAS = ALIASv;

  IF USR = 1 THEN -- Alias encontrado.
    UPDATE SYS.USUARIO 
      SET   DIRECCION = DIRECCIONv
      WHERE ALIAS = ALIASv;
  END IF;
END;
/

-- • Actualiza CEDULA de usuario.
-- • Entrada: ALIASv, CEDULAv.
-- • Usuario autorizado: admin.

CREATE OR REPLACE PROCEDURE SP_MODIFICAR_USUARIO_CEDULA
(
  ALIASv IN VARCHAR2 -- Alias actual.
, CEDULAv IN INTEGER
)
IS
-- Variables para saber si ya se encuentra registrado el usuario.
USR SMALLINT; -- Si es 0, no existe el alias.
BEGIN
  SELECT COUNT(*) INTO USR
  FROM SYS.USUARIO
  WHERE SYS.USUARIO.ALIAS = ALIASv;

  IF USR = 1 THEN -- Alias encontrado.
    UPDATE SYS.USUARIO 
      SET   CEDULA = CEDULAv
      WHERE ALIAS = ALIASv;
  END IF;
END;
/

-- • Actualiza CORREO de usuario.
-- • Entrada: ALIASv, CORREOv.
-- • Usuario autorizado: admin.

CREATE OR REPLACE PROCEDURE SP_MODIFICAR_USUARIO_CORREO
(
  ALIASv IN VARCHAR2 -- Alias actual.
, CORREOv IN VARCHAR2
)
IS
-- Variables para saber si ya se encuentra registrado el usuario.
USR SMALLINT; -- Si es 0, no existe el alias.
BEGIN
  SELECT COUNT(*) INTO USR
  FROM SYS.USUARIO
  WHERE SYS.USUARIO.ALIAS = ALIASv;

  IF USR = 1 THEN -- Alias encontrado.
    UPDATE SYS.USUARIO 
      SET   CORREO = CORREOv
      WHERE ALIAS = ALIASv;
  END IF;
END;
/

-- • Actualiza PASSWORD de usuario.
-- • Entrada: ALIASv, PASSWORDv.
-- • Usuario autorizado: admin.

CREATE OR REPLACE PROCEDURE SP_MODIFICAR_USUARIO_PASSWORD
(
  ALIASv IN VARCHAR2 -- Alias actual.
, PASSWORDv IN VARCHAR2
)
IS
-- Variables para saber si ya se encuentra registrado el usuario.
USR SMALLINT; -- Si es 0, no existe el alias.
BEGIN
  SELECT COUNT(*) INTO USR
  FROM SYS.USUARIO
  WHERE SYS.USUARIO.ALIAS = ALIASv;

  IF USR = 1 THEN -- Alias encontrado.
    UPDATE SYS.USUARIO 
      SET   PASSWORD = PASSWORDv
      WHERE ALIAS = ALIASv;
  END IF;
END;
/

-- • Actualiza TELEFONO PRINCIPAL de usuario.
-- • Entrada: ALIASv, TELEFONO.
-- • Usuario autorizado: admin.

CREATE OR REPLACE PROCEDURE SP_MODIFICAR_USUARIO_NUMERO
(
  ALIASv IN VARCHAR2 -- Alias actual.
, NUMEROv IN VARCHAR2
)
IS
-- Variables para saber si ya se encuentra registrado el usuario.
USR SMALLINT; -- Si es 0, no existe el alias.
BEGIN
  SELECT COUNT(*) INTO USR
  FROM SYS.USUARIO
  WHERE SYS.USUARIO.ALIAS = ALIASv;

  IF USR = 1 THEN -- Alias encontrado.
    UPDATE SYS.TELEFONOXUSUARIO 
      SET   NUMERO = NUMEROv
      WHERE ALIASUSUARIO = ALIASv;
  END IF;
END;
/