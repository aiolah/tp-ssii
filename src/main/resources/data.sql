-- Initialisation des tables
INSERT INTO PERSONNE(nom, prenom, poste, superieur) VALUES
    ('Lamine', 'Elyes', 'directeur', NULL),
    ('Bastide', 'Rémi', 'professeur', 1),
    ('Pécatte', 'Jean-Marie', 'professeur', 1);

INSERT INTO PROJET(nom, debut, fin) VALUES
    ('Castres au trésor', '2023-11-24', '2024-01-03'),
    ('Cooking App', '2019-11-20', '2020-01-17'),
    ('TP Cities', '2025-02-01', '2025-02-02');

INSERT INTO PARTICIPATION(role, pourcentage, personne_id, projet_id) VALUES
    ('Responsable produit', 0.8, 3, 2),
    ('Professeur superviseur', 0.3, 3, 1),
    ('Correcteur', 0.5, 2, 3);