CREATE TABLE public.PARAMETROS 
(
  INCREMENTOMINIMO INTEGER NOT NULL
, PORCENTAJEMEJORA NUMERIC(5,2) NOT NULL
);

CREATE TABLE public."CATEGORIA"
(
    "ID" serial NOT NULL,
    "DESCRIPCION" text NOT NULL,
    PRIMARY KEY ("ID")
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public."CATEGORIA"
    OWNER to postgres;

CREATE TABLE public."USUARIO"
(
    "ALIAS" text NOT NULL,
    "NOMBRE" text NOT NULL,
    "APELLIDOS" text NOT NULL,
    "DIRECCION" text NOT NULL,
    "CEDULA" integer NOT NULL,
    "CORREO" text NOT NULL,
    "CALIFICACION" smallint NOT NULL,
    "PASSWORD" text NOT NULL,
    PRIMARY KEY ("ALIAS")
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public."USUARIO"
    OWNER to postgres;

CREATE TABLE public."SUBCATEGORIA"
(
    "ID" serial NOT NULL,
    "IDCATEGORIA" serial NOT NULL,
    "DESCRIPCION" text NOT NULL,
    PRIMARY KEY ("ID"),
    CONSTRAINT "SUBCATEGORIA_FK_CATEGORIA" FOREIGN KEY ("IDCATEGORIA")
        REFERENCES public."CATEGORIA" ("ID") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public."SUBCATEGORIA"
    OWNER to postgres;

CREATE TABLE public."TELEFONOXUSUARIO"
(
    "ID" serial NOT NULL,
    "ALIASUSUARIO" text NOT NULL,
    "NUMERO" text NOT NULL,
    "DESCRIPCION" text NOT NULL,
    PRIMARY KEY ("ID"),
    CONSTRAINT "ALIASUSUARIO_FK_ALIAS" FOREIGN KEY ("ALIASUSUARIO")
        REFERENCES public."USUARIO" ("ALIAS") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public."TELEFONOXUSUARIO"
    OWNER to postgres;

CREATE TABLE public."TIPOXUSUARIO"
(
    "ID" serial NOT NULL,
    "ALIASUSUARIO" text NOT NULL,
    "DESCRIPCION" text NOT NULL,
    PRIMARY KEY ("ID"),
    CONSTRAINT "ALIASUSUARIO_FK_ALIAS" FOREIGN KEY ("ALIASUSUARIO")
        REFERENCES public."USUARIO" ("ALIAS") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public."TIPOXUSUARIO"
    OWNER to postgres;

CREATE TABLE public."ITEM"
(
    "ID" serial NOT NULL,
    "PRECIO" money NOT NULL,
    "DESCRIPCION" text NOT NULL,
    "IDSUBCATEGORIA" integer NOT NULL,
    "FOTO" text,
    PRIMARY KEY ("ID"),
    CONSTRAINT "IDSUBCATEGORIA_FK_ID" FOREIGN KEY ("IDSUBCATEGORIA")
        REFERENCES public."SUBCATEGORIA" ("ID") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public."ITEM"
    OWNER to postgres;

CREATE TABLE public."SUBASTA"
(
    "ID" serial NOT NULL,
    "IDITEM" serial NOT NULL,
    "ALIASVENDEDOR" text NOT NULL,
    "MODOENTREGA" text NOT NULL,
    "PRECIOINICIAL" money NOT NULL,
    "PRECIOACTUAL" money,
    "FECHAHORAFIN" date NOT NULL,
    "COMENTARIOVENDEDOR" text,
    "COMENTARIOCOMPRADOR" text,
    "ALIASCOMPRADOR" text,
    "CALIFICACIONSUBASTA" smallint DEFAULT 0,
    "ESTADOSUBASTA" smallint DEFAULT 1 NOT NULL,
    PRIMARY KEY ("ID"),
    CONSTRAINT "ALIASCOMPRADOR_FK_ALIAS" FOREIGN KEY ("ALIASCOMPRADOR")
        REFERENCES public."USUARIO" ("ALIAS") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT "ALIASVENDEDOR_FK_ALIAS" FOREIGN KEY ("ALIASVENDEDOR")
        REFERENCES public."USUARIO" ("ALIAS") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT "IDITEM_FK_ID" FOREIGN KEY ("IDITEM")
        REFERENCES public."ITEM" ("ID") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public."SUBASTA"
    OWNER to postgres;

CREATE TABLE public."PUJA"
(
    "ID" serial NOT NULL,
    "ALIASCOMPRADOR" text NOT NULL,
    "IDSUBASTA" serial NOT NULL,
    "MONTO" money NOT NULL,
    "FECHAHORA" date NOT NULL,
    PRIMARY KEY ("ID"),
    CONSTRAINT "ALIASCOMPRADOR_FK_ALIAS" FOREIGN KEY ("ALIASCOMPRADOR")
        REFERENCES public."USUARIO" ("ALIAS") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT "IDSUBASTA_FK_ID" FOREIGN KEY ("IDSUBASTA")
        REFERENCES public."SUBASTA" ("ID") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public."PUJA"
    OWNER to postgres;