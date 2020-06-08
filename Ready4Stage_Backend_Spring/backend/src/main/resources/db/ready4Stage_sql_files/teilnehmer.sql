CREATE TABLE Teilnehmer(
  Namen           VARCHAR(10) NOT NULL PRIMARY KEY
  ,Vorname        VARCHAR(9) NOT NULL
  ,Bankverbindung VARCHAR(30)
  ,Kurse          VARCHAR(17) NOT NULL
  ,Email          VARCHAR(30)
  ,Telefon        VARCHAR(30)
  ,Adresse        VARCHAR(30)
);
INSERT INTO Teilnehmer(Namen,Vorname,Bankverbindung,Kurse,Email,Telefon,Adresse) VALUES 
('Battner','Eva',NULL,'Gesang',NULL,NULL,NULL),
('Mitz','Martina',NULL,'Gesang',NULL,NULL,NULL),
('Jäger','Dirk',NULL,'Gitarre',NULL,NULL,NULL),
('Grifftith','Tom',NULL,'Schlagzeug',NULL,NULL,NULL),
('Betz','Kevin',NULL,'Schlagzeug',NULL,NULL,NULL),
('Gründgens','Ingrid',NULL,'Klavier, Keyboard',NULL,NULL,NULL),
('Bach','Anke',NULL,'Gesang',NULL,NULL,NULL),
('Eisenmann','Tim',NULL,'Bass',NULL,NULL,NULL),
('Kelter','Marc',NULL,'Trompete',NULL,NULL,NULL),
('Bachmann','Charlotte',NULL,'Gesang',NULL,NULL,NULL),
('Ahmendt','Hannah',NULL,'Gitarre, Gesang',NULL,NULL,NULL),
('Jacobs','Jana',NULL,'Gitarre',NULL,NULL,NULL),
('Dotzler','Lukas',NULL,'Gesang',NULL,NULL,NULL),
('Sterling','Lukas',NULL,'Gitarre',NULL,NULL,NULL),
('Escher','Bernd',NULL,'Klavier',NULL,NULL,NULL),
('Borchers','Tobias',NULL,'Klavier',NULL,NULL,NULL),
('Zobel','Kai',NULL,'Keyboard',NULL,NULL,NULL),
('Zimmermann','Sascha',NULL,'Saxophone',NULL,NULL,NULL),
('Brödner','Vicky',NULL,'Schlagzeug',NULL,NULL,NULL),
('Babbage','Marlene',NULL,'Gesang, Klavier',NULL,NULL,NULL),
('Pollmann','Corinna',NULL,'Gesang',NULL,NULL,NULL),
('Neumann','Susanne',NULL,'Gesang, Klavier',NULL,NULL,NULL),
('Bukowski','Kim',NULL,'Trompete',NULL,NULL,NULL),
('Schmidt','Erika',NULL,'Saxophone',NULL,NULL,NULL),
('Müller','Andrea',NULL,'Ukulele',NULL,NULL,NULL),
('Meier','Michael',NULL,'Schlagzeug',NULL,NULL,NULL),
('Hendrichs','Christine',NULL,'Gesang',NULL,NULL,NULL);