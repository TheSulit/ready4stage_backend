CREATE TABLE Raumplan(
    Raum_Nr     VARCHAR(7) NOT NULL PRIMARY KEY
    ,Gesang     VARCHAR(2)
    ,Gitarre    VARCHAR(2)
    ,Klavier    VARCHAR(2)
    ,Keyboard   VARCHAR(2)
    ,Bass       VARCHAR(2)
    ,Geigen     VARCHAR(2)
    ,Trompete   VARCHAR(2)
    ,Saxophone  VARCHAR(2)
    ,Querflöte  VARCHAR(2)
    ,Klarinette VARCHAR(2)
    ,Ukulele    VARCHAR(2)
    ,Band       VARCHAR(2)
    ,Schlagzeug VARCHAR(2)
);
INSERT INTO Raumplan(Raum_Nr,Gesang,Gitarre,Klavier,Keyboard,Bass,Geigen,Trompete,Saxophone,Querflöte,Klarinette,Ukulele,Band,Schlagzeug) VALUES 
('Raum 1','OK','OK',NULL,NULL,'OK','OK','OK','OK','OK','OK','OK',NULL,NULL),
('Raum 2','OK','OK',NULL,NULL,'OK','OK','OK','OK','OK','OK','OK',NULL,'OK'),
('Raum 3','OK','OK',NULL,NULL,'OK','OK','OK','OK','OK','OK','OK',NULL,NULL),
('Raum 4','OK','OK',NULL,'OK','OK','OK','OK','OK','OK','OK','OK',NULL,NULL),
('Raum 5','OK','OK',NULL,'OK','OK','OK','OK','OK','OK','OK','OK',NULL,NULL),
('Raum 6','OK','OK',NULL,NULL,'OK','OK','OK','OK','OK','OK','OK',NULL,NULL),
('Raum 7','OK','OK',NULL,NULL,'OK','OK','OK','OK','OK','OK','OK',NULL,NULL),
('Raum 8','OK','OK','OK','OK','OK','OK','OK','OK','OK','OK','OK',NULL,NULL),
('Raum 9','OK','OK','OK',NULL,'OK','OK','OK','OK','OK','OK','OK',NULL,NULL),
('Raum 10','OK','OK',NULL,NULL,'OK','OK','OK','OK','OK','OK','OK',NULL,'OK'),
('Raum 11','OK','OK',NULL,NULL,'OK','OK','OK','OK','OK','OK','OK',NULL,NULL),
('Raum 12','OK','OK',NULL,NULL,'OK','OK','OK','OK','OK','OK','OK',NULL,NULL),
('Raum 13','OK','OK',NULL,NULL,'OK','OK','OK','OK','OK','OK','OK',NULL,NULL),
('Raum 14','OK','OK',NULL,NULL,'OK','OK','OK','OK','OK','OK','OK',NULL,NULL),
('Raum 15','OK','OK','OK','OK','OK','OK','OK','OK','OK','OK','OK','OK',NULL),
('Studio',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);