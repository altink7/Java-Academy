--------------------------------------------------------
--  Flughafen Datenbank   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ABTEILUNG
--------------------------------------------------------

  CREATE TABLE "ABTEILUNG" 
   (	"ABTEILUNGSID" NUMBER, 
	"KBZ" VARCHAR2(20), 
	"BEZEICHNUNG" VARCHAR2(255)
   ) ;
--------------------------------------------------------
--  DDL for Table BODENPERSONAL
--------------------------------------------------------

  CREATE TABLE "BODENPERSONAL" 
   (	"PERSONID" NUMBER, 
	"ABTEILUNGSID" NUMBER
   ) ;
--------------------------------------------------------
--  DDL for Table CREW
--------------------------------------------------------

  CREATE TABLE "CREW" 
   (	"FLUGID" NUMBER, 
	"PERSONID" NUMBER
   ) ;
--------------------------------------------------------
--  DDL for Table DIENSTRANG
--------------------------------------------------------

  CREATE TABLE "DIENSTRANG" 
   (	"DIENSTRANGID" NUMBER, 
	"KBZ" VARCHAR2(20), 
	"BEZEICHNUNG" VARCHAR2(255)
   ) ;
--------------------------------------------------------
--  DDL for Table FLUG
--------------------------------------------------------

  CREATE TABLE "FLUG" 
   (	"FLUGID" NUMBER, 
	"FLUGZEUGID" NUMBER, 
	"GATEID" NUMBER, 
	"FLUGHAFEN_ABFLUG" NUMBER, 
	"FLUGHAFEN_DESTINATION" NUMBER, 
	"FLUGNUMMER" VARCHAR2(6), 
	"DAUER" NUMBER, 
	"ABFLUGZEIT" TIMESTAMP (6)
   ) ;
--------------------------------------------------------
--  DDL for Table FLUGHAFEN
--------------------------------------------------------

  CREATE TABLE "FLUGHAFEN" 
   (	"FLUGHAFENID" NUMBER, 
	"KBZ" VARCHAR2(20), 
	"BEZEICHNUNG" VARCHAR2(255), 
	"GMT_ABWEICHUNG" NUMBER
   ) ;
--------------------------------------------------------
--  DDL for Table FLUGLINIE
--------------------------------------------------------

  CREATE TABLE "FLUGLINIE" 
   (	"FLUGLINIEID" NUMBER, 
	"KBZ" VARCHAR2(20), 
	"BEZEICHNUNG" VARCHAR2(255), 
	"ADRESSE" VARCHAR2(255)
   ) ;
--------------------------------------------------------
--  DDL for Table FLUGPERSONAL
--------------------------------------------------------

  CREATE TABLE "FLUGPERSONAL" 
   (	"PERSONID" NUMBER, 
	"DIENSTRANGID" NUMBER
   ) ;
--------------------------------------------------------
--  DDL for Table FLUGZEUG
--------------------------------------------------------

  CREATE TABLE "FLUGZEUG" 
   (	"FLUGZEUGID" NUMBER, 
	"FLUGLINIEID" NUMBER, 
	"FLUGZEUGTYPID" NUMBER, 
	"ERSTEINSATZ" DATE, 
	"FLUGSTUNDEN_GESAMT" NUMBER, 
	"FLUGSTUNDEN_LETZTE_WARTUNG" NUMBER
   ) ;
--------------------------------------------------------
--  DDL for Table FLUGZEUGTYP
--------------------------------------------------------

  CREATE TABLE "FLUGZEUGTYP" 
   (	"FLUGZEUGTYPID" NUMBER, 
	"BEZEICHNUNG" VARCHAR2(255), 
	"FLUGSTUNDEN_PRO_WARTUNG" NUMBER, 
	"FLUGSTRECKE_MAXIMAL" NUMBER, 
	"LADEGEWICHT_MAXIMAL" NUMBER, 
	"VERBRAUCH" NUMBER, 
	"SITZPLAETZE" NUMBER
   ) ;
--------------------------------------------------------
--  DDL for Table GATE
--------------------------------------------------------

  CREATE TABLE "GATE" 
   (	"GATEID" NUMBER, 
	"FLUGHAFENID" NUMBER, 
	"KBZ" VARCHAR2(20), 
	"TERMINAL" VARCHAR2(20)
   ) ;
--------------------------------------------------------
--  DDL for Table GEHALTSSTUFE
--------------------------------------------------------

  CREATE TABLE "GEHALTSSTUFE" 
   (	"GEHALTSSTUFEID" NUMBER, 
	"MONATSGEHALT" NUMBER(7,2)
   ) ;
--------------------------------------------------------
--  DDL for Table GEPAECK
--------------------------------------------------------

  CREATE TABLE "GEPAECK" 
   (	"GEPAECKID" NUMBER, 
	"PERSONID" NUMBER, 
	"FLUGID" NUMBER, 
	"GEWICHT" NUMBER(5,1)
   ) ;
--------------------------------------------------------
--  DDL for Table LAND
--------------------------------------------------------

  CREATE TABLE "LAND" 
   (	"LANDID" NUMBER, 
	"KENNZEICHEN" VARCHAR2(20), 
	"BEZEICHNUNG" VARCHAR2(255)
   ) ;
--------------------------------------------------------
--  DDL for Table ORT
--------------------------------------------------------

  CREATE TABLE "ORT" 
   (	"PLZ" NUMBER, 
	"LANDID" NUMBER, 
	"BEZEICHNUNG" VARCHAR2(255)
   ) ;
--------------------------------------------------------
--  DDL for Table PASSAGIERLISTE
--------------------------------------------------------

  CREATE TABLE "PASSAGIERLISTE" 
   (	"FLUGID" NUMBER, 
	"PERSONID" NUMBER, 
	"SITZPLATZNUMMER" VARCHAR2(20)
   ) ;
--------------------------------------------------------
--  DDL for Table PERSON
--------------------------------------------------------

  CREATE TABLE "PERSON" 
   (	"PERSONID" NUMBER, 
	"VORNAME" VARCHAR2(255), 
	"NACHNAME" VARCHAR2(255), 
	"GEBURTSDATUM" DATE
   ) ;
--------------------------------------------------------
--  DDL for Table PERSONAL
--------------------------------------------------------

  CREATE TABLE "PERSONAL" 
   (	"PERSONID" NUMBER, 
	"PLZ" NUMBER, 
	"GEHALTSSTUFEID" NUMBER, 
	"SOZVERSNR" CHAR(4 CHAR), 
	"ADRESSE" VARCHAR2(255), 
	"PERSONALNUMMER" VARCHAR2(20)
   ) ;
--------------------------------------------------------
--  DDL for Table REISEPASS
--------------------------------------------------------

  CREATE TABLE "REISEPASS" 
   (	"REISEPASSID" NUMBER, 
	"PERSONID" NUMBER, 
	"LANDID" NUMBER, 
	"REISEPASSNR" VARCHAR2(20)
   ) ;


--------------------------------------------------------
--  Constraints for Table ABTEILUNG
--------------------------------------------------------

  ALTER TABLE "ABTEILUNG" MODIFY ("ABTEILUNGSID" NOT NULL ENABLE);
 
  ALTER TABLE "ABTEILUNG" ADD PRIMARY KEY ("ABTEILUNGSID") ENABLE;
--------------------------------------------------------
--  Constraints for Table BODENPERSONAL
--------------------------------------------------------

  ALTER TABLE "BODENPERSONAL" MODIFY ("PERSONID" NOT NULL ENABLE);
 
  ALTER TABLE "BODENPERSONAL" MODIFY ("ABTEILUNGSID" NOT NULL ENABLE);
 
  ALTER TABLE "BODENPERSONAL" ADD PRIMARY KEY ("PERSONID") ENABLE;
--------------------------------------------------------
--  Constraints for Table CREW
--------------------------------------------------------

  ALTER TABLE "CREW" MODIFY ("FLUGID" NOT NULL ENABLE);
 
  ALTER TABLE "CREW" MODIFY ("PERSONID" NOT NULL ENABLE);
 
  ALTER TABLE "CREW" ADD PRIMARY KEY ("FLUGID", "PERSONID") ENABLE;
--------------------------------------------------------
--  Constraints for Table DIENSTRANG
--------------------------------------------------------

  ALTER TABLE "DIENSTRANG" MODIFY ("DIENSTRANGID" NOT NULL ENABLE);
 
  ALTER TABLE "DIENSTRANG" ADD PRIMARY KEY ("DIENSTRANGID") ENABLE;
--------------------------------------------------------
--  Constraints for Table FLUG
--------------------------------------------------------

  ALTER TABLE "FLUG" MODIFY ("FLUGID" NOT NULL ENABLE);
 
  ALTER TABLE "FLUG" MODIFY ("FLUGZEUGID" NOT NULL ENABLE);
 
  ALTER TABLE "FLUG" MODIFY ("GATEID" NOT NULL ENABLE);
 
  ALTER TABLE "FLUG" MODIFY ("FLUGHAFEN_ABFLUG" NOT NULL ENABLE);
 
  ALTER TABLE "FLUG" MODIFY ("FLUGHAFEN_DESTINATION" NOT NULL ENABLE);
 
  ALTER TABLE "FLUG" ADD PRIMARY KEY ("FLUGID") ENABLE;
--------------------------------------------------------
--  Constraints for Table FLUGHAFEN
--------------------------------------------------------

  ALTER TABLE "FLUGHAFEN" MODIFY ("FLUGHAFENID" NOT NULL ENABLE);
 
  ALTER TABLE "FLUGHAFEN" ADD PRIMARY KEY ("FLUGHAFENID") ENABLE;
--------------------------------------------------------
--  Constraints for Table FLUGLINIE
--------------------------------------------------------

  ALTER TABLE "FLUGLINIE" MODIFY ("FLUGLINIEID" NOT NULL ENABLE);
 
  ALTER TABLE "FLUGLINIE" ADD PRIMARY KEY ("FLUGLINIEID") ENABLE;
--------------------------------------------------------
--  Constraints for Table FLUGPERSONAL
--------------------------------------------------------

  ALTER TABLE "FLUGPERSONAL" MODIFY ("PERSONID" NOT NULL ENABLE);
 
  ALTER TABLE "FLUGPERSONAL" MODIFY ("DIENSTRANGID" NOT NULL ENABLE);
 
  ALTER TABLE "FLUGPERSONAL" ADD PRIMARY KEY ("PERSONID") ENABLE;
--------------------------------------------------------
--  Constraints for Table FLUGZEUG
--------------------------------------------------------

  ALTER TABLE "FLUGZEUG" MODIFY ("FLUGZEUGID" NOT NULL ENABLE);
 
  ALTER TABLE "FLUGZEUG" MODIFY ("FLUGLINIEID" NOT NULL ENABLE);
 
  ALTER TABLE "FLUGZEUG" MODIFY ("FLUGZEUGTYPID" NOT NULL ENABLE);
 
  ALTER TABLE "FLUGZEUG" ADD PRIMARY KEY ("FLUGZEUGID") ENABLE;
--------------------------------------------------------
--  Constraints for Table FLUGZEUGTYP
--------------------------------------------------------

  ALTER TABLE "FLUGZEUGTYP" MODIFY ("FLUGZEUGTYPID" NOT NULL ENABLE);
 
  ALTER TABLE "FLUGZEUGTYP" ADD PRIMARY KEY ("FLUGZEUGTYPID") ENABLE;
--------------------------------------------------------
--  Constraints for Table GATE
--------------------------------------------------------

  ALTER TABLE "GATE" MODIFY ("GATEID" NOT NULL ENABLE);
 
  ALTER TABLE "GATE" MODIFY ("FLUGHAFENID" NOT NULL ENABLE);
 
  ALTER TABLE "GATE" ADD PRIMARY KEY ("GATEID") ENABLE;
--------------------------------------------------------
--  Constraints for Table GEHALTSSTUFE
--------------------------------------------------------

  ALTER TABLE "GEHALTSSTUFE" MODIFY ("GEHALTSSTUFEID" NOT NULL ENABLE);
 
  ALTER TABLE "GEHALTSSTUFE" ADD PRIMARY KEY ("GEHALTSSTUFEID") ENABLE;
--------------------------------------------------------
--  Constraints for Table GEPAECK
--------------------------------------------------------

  ALTER TABLE "GEPAECK" MODIFY ("GEPAECKID" NOT NULL ENABLE);
 
  ALTER TABLE "GEPAECK" MODIFY ("PERSONID" NOT NULL ENABLE);
 
  ALTER TABLE "GEPAECK" MODIFY ("FLUGID" NOT NULL ENABLE);
 
  ALTER TABLE "GEPAECK" ADD PRIMARY KEY ("GEPAECKID") ENABLE;
--------------------------------------------------------
--  Constraints for Table LAND
--------------------------------------------------------

  ALTER TABLE "LAND" MODIFY ("LANDID" NOT NULL ENABLE);
 
  ALTER TABLE "LAND" ADD PRIMARY KEY ("LANDID") ENABLE;
--------------------------------------------------------
--  Constraints for Table ORT
--------------------------------------------------------

  ALTER TABLE "ORT" MODIFY ("PLZ" NOT NULL ENABLE);
 
  ALTER TABLE "ORT" MODIFY ("LANDID" NOT NULL ENABLE);
 
  ALTER TABLE "ORT" ADD PRIMARY KEY ("PLZ") ENABLE;
--------------------------------------------------------
--  Constraints for Table PASSAGIERLISTE
--------------------------------------------------------

  ALTER TABLE "PASSAGIERLISTE" MODIFY ("FLUGID" NOT NULL ENABLE);
 
  ALTER TABLE "PASSAGIERLISTE" MODIFY ("PERSONID" NOT NULL ENABLE);
 
  ALTER TABLE "PASSAGIERLISTE" ADD PRIMARY KEY ("FLUGID", "PERSONID") ENABLE;
--------------------------------------------------------
--  Constraints for Table PERSON
--------------------------------------------------------

  ALTER TABLE "PERSON" MODIFY ("PERSONID" NOT NULL ENABLE);
 
  ALTER TABLE "PERSON" ADD PRIMARY KEY ("PERSONID") ENABLE;
--------------------------------------------------------
--  Constraints for Table PERSONAL
--------------------------------------------------------

  ALTER TABLE "PERSONAL" MODIFY ("PERSONID" NOT NULL ENABLE);
 
  ALTER TABLE "PERSONAL" MODIFY ("PLZ" NOT NULL ENABLE);
 
  ALTER TABLE "PERSONAL" MODIFY ("GEHALTSSTUFEID" NOT NULL ENABLE);
 
  ALTER TABLE "PERSONAL" ADD PRIMARY KEY ("PERSONID") ENABLE;
--------------------------------------------------------
--  Constraints for Table REISEPASS
--------------------------------------------------------

  ALTER TABLE "REISEPASS" MODIFY ("REISEPASSID" NOT NULL ENABLE);
 
  ALTER TABLE "REISEPASS" MODIFY ("PERSONID" NOT NULL ENABLE);
 
  ALTER TABLE "REISEPASS" MODIFY ("LANDID" NOT NULL ENABLE);
 
  ALTER TABLE "REISEPASS" ADD PRIMARY KEY ("REISEPASSID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table BODENPERSONAL
--------------------------------------------------------

  ALTER TABLE "BODENPERSONAL" ADD FOREIGN KEY ("PERSONID")
	  REFERENCES "PERSONAL" ("PERSONID") ENABLE;
 
  ALTER TABLE "BODENPERSONAL" ADD FOREIGN KEY ("ABTEILUNGSID")
	  REFERENCES "ABTEILUNG" ("ABTEILUNGSID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CREW
--------------------------------------------------------

  ALTER TABLE "CREW" ADD FOREIGN KEY ("PERSONID")
	  REFERENCES "FLUGPERSONAL" ("PERSONID") ENABLE;
 
  ALTER TABLE "CREW" ADD FOREIGN KEY ("FLUGID")
	  REFERENCES "FLUG" ("FLUGID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table FLUG
--------------------------------------------------------

  ALTER TABLE "FLUG" ADD FOREIGN KEY ("FLUGZEUGID")
	  REFERENCES "FLUGZEUG" ("FLUGZEUGID") ENABLE;
 
  ALTER TABLE "FLUG" ADD FOREIGN KEY ("FLUGHAFEN_ABFLUG")
	  REFERENCES "FLUGHAFEN" ("FLUGHAFENID") ENABLE;
 
  ALTER TABLE "FLUG" ADD FOREIGN KEY ("FLUGHAFEN_DESTINATION")
	  REFERENCES "FLUGHAFEN" ("FLUGHAFENID") ENABLE;
 
  ALTER TABLE "FLUG" ADD FOREIGN KEY ("GATEID")
	  REFERENCES "GATE" ("GATEID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table FLUGPERSONAL
--------------------------------------------------------

  ALTER TABLE "FLUGPERSONAL" ADD FOREIGN KEY ("PERSONID")
	  REFERENCES "PERSONAL" ("PERSONID") ENABLE;
 
  ALTER TABLE "FLUGPERSONAL" ADD FOREIGN KEY ("DIENSTRANGID")
	  REFERENCES "DIENSTRANG" ("DIENSTRANGID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table FLUGZEUG
--------------------------------------------------------

  ALTER TABLE "FLUGZEUG" ADD FOREIGN KEY ("FLUGLINIEID")
	  REFERENCES "FLUGLINIE" ("FLUGLINIEID") ENABLE;
 
  ALTER TABLE "FLUGZEUG" ADD FOREIGN KEY ("FLUGZEUGTYPID")
	  REFERENCES "FLUGZEUGTYP" ("FLUGZEUGTYPID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table GATE
--------------------------------------------------------

  ALTER TABLE "GATE" ADD FOREIGN KEY ("FLUGHAFENID")
	  REFERENCES "FLUGHAFEN" ("FLUGHAFENID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table GEPAECK
--------------------------------------------------------

  ALTER TABLE "GEPAECK" ADD FOREIGN KEY ("FLUGID", "PERSONID")
	  REFERENCES "PASSAGIERLISTE" ("FLUGID", "PERSONID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ORT
--------------------------------------------------------

  ALTER TABLE "ORT" ADD FOREIGN KEY ("LANDID")
	  REFERENCES "LAND" ("LANDID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PASSAGIERLISTE
--------------------------------------------------------

  ALTER TABLE "PASSAGIERLISTE" ADD FOREIGN KEY ("PERSONID")
	  REFERENCES "PERSON" ("PERSONID") ENABLE;
 
  ALTER TABLE "PASSAGIERLISTE" ADD FOREIGN KEY ("FLUGID")
	  REFERENCES "FLUG" ("FLUGID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PERSONAL
--------------------------------------------------------

  ALTER TABLE "PERSONAL" ADD FOREIGN KEY ("PERSONID")
	  REFERENCES "PERSON" ("PERSONID") ENABLE;
 
  ALTER TABLE "PERSONAL" ADD FOREIGN KEY ("PLZ")
	  REFERENCES "ORT" ("PLZ") ENABLE;
 
  ALTER TABLE "PERSONAL" ADD FOREIGN KEY ("GEHALTSSTUFEID")
	  REFERENCES "GEHALTSSTUFE" ("GEHALTSSTUFEID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table REISEPASS
--------------------------------------------------------

  ALTER TABLE "REISEPASS" ADD FOREIGN KEY ("PERSONID")
	  REFERENCES "PERSON" ("PERSONID") ENABLE;
 
  ALTER TABLE "REISEPASS" ADD FOREIGN KEY ("LANDID")
	  REFERENCES "LAND" ("LANDID") ENABLE;
