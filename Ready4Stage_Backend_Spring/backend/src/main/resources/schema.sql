DROP TABLE IF EXISTS ready4stage.dozenten;  
CREATE TABLE dozenten(
    id                   int NOT NULL AUTO_INCREMENT PRIMARY KEY
    ,Namen               VARCHAR(10) NOT NULL
    ,Gesang              VARCHAR(2)
    ,Gitarre             VARCHAR(2)
    ,Klavier             VARCHAR(2)
    ,Keyboard            VARCHAR(2)
    ,Bass                VARCHAR(2)
    ,Geigen              VARCHAR(2)
    ,Trompete            VARCHAR(2)
    ,Saxophone           VARCHAR(2)
    ,Querfloete           VARCHAR(2)
    ,Klarinette          VARCHAR(2)
    ,Ukulele             VARCHAR(2)
    ,Band                VARCHAR(2)
    ,Schlagzeug          VARCHAR(2)
    ,Stundensatz_in_EURO INTEGER NOT NULL
    ,Bankverbindung      VARCHAR(30)
);
DROP TABLE IF EXISTS ready4stage.ls_ready4stage_belegung_raum_1;
CREATE TABLE ls_ready4stage_belegung_raum_1(
    id          int NOT NULL AUTO_INCREMENT PRIMARY KEY
    ,Raum_1     VARCHAR(5) NOT NULL
    ,Montag     VARCHAR(22)
    ,Dienstag   VARCHAR(24)
    ,Mittwoch   VARCHAR(30)
    ,Donnerstag VARCHAR(30)
    ,Freitag    VARCHAR(30)
);
DROP TABLE IF EXISTS ready4stage.ls_ready4stage_belegung_raum_2;
CREATE TABLE ls_ready4stage_belegung_raum_2(
    id          int NOT NULL AUTO_INCREMENT PRIMARY KEY
    ,Raum_2     VARCHAR(5) NOT NULL
    ,Montag     VARCHAR(22)
    ,Dienstag   VARCHAR(24)
    ,Mittwoch   VARCHAR(23)
    ,Donnerstag VARCHAR(30)
    ,Freitag    VARCHAR(30)
);
DROP TABLE IF EXISTS ready4stage.raumplan;
CREATE TABLE raumplan(
    id          int NOT NULL AUTO_INCREMENT PRIMARY KEY
    ,Raum_Nr    VARCHAR(7) NOT NULL
    ,Gesang     VARCHAR(2)
    ,Gitarre    VARCHAR(2)
    ,Klavier    VARCHAR(2)
    ,Keyboard   VARCHAR(2)
    ,Bass       VARCHAR(2)
    ,Geigen     VARCHAR(2)
    ,Trompete   VARCHAR(2)
    ,Saxophone  VARCHAR(2)
    ,Querfloete  VARCHAR(2)
    ,Klarinette VARCHAR(2)
    ,Ukulele    VARCHAR(2)
    ,Band       VARCHAR(2)
    ,Schlagzeug VARCHAR(2)
);
DROP TABLE IF EXISTS ready4stage.teilnehmer;
CREATE TABLE teilnehmer(
    id              int NOT NULL AUTO_INCREMENT PRIMARY KEY
    ,Namen          VARCHAR(10) NOT NULL
    ,Vorname        VARCHAR(9) NOT NULL
    ,Bankverbindung VARCHAR(30)
    ,Kurse          VARCHAR(17) NOT NULL
    ,Email          VARCHAR(30)
    ,Telefon        VARCHAR(30)
    ,Adresse        VARCHAR(30)
);