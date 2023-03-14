CREATE TABLE Location(
   numLocation VARCHAR(50),
   dateLocation DATE,
   montantRegle DECIMAL(15,2),
   dateHreDepartPrevu DATETIME,
   dateHreDepartReel DATETIME,
   dateHreRetourPrevu DATETIME,
   dateHreRetourReel DATETIME,
   PRIMARY KEY(numLocation)
);

CREATE TABLE LocationAvecChauffeur(
   numLocation VARCHAR(50),
   PRIMARY KEY(numLocation),
   FOREIGN KEY(numLocation) REFERENCES Location(numLocation)
);

CREATE TABLE Formule(
   idFormule VARCHAR(50),
   libelleFormule VARCHAR(50),
   PRIMARY KEY(idFormule)
);

CREATE TABLE FormuleAvecChauffeur(
   idFormule VARCHAR(50),
   lieuDestination VARCHAR(50),
   tarif VARCHAR(50),
   numLocation VARCHAR(50) NOT NULL,
   PRIMARY KEY(idFormule),
   FOREIGN KEY(idFormule) REFERENCES Formule(idFormule),
   FOREIGN KEY(numLocation) REFERENCES LocationAvecChauffeur(numLocation)
);

CREATE TABLE Vehicule(
   immatriculation VARCHAR(50),
   dateAchat DATE,
   numLocation VARCHAR(50) NOT NULL,
   PRIMARY KEY(immatriculation),
   FOREIGN KEY(numLocation) REFERENCES Location(numLocation)
);

CREATE TABLE Salarie(
   idSalarie VARCHAR(50),
   nomSalarie VARCHAR(50),
   PrenomSalarie VARCHAR(50),
   PRIMARY KEY(idSalarie)
);

CREATE TABLE Piece(
   idPiece VARCHAR(50),
   nomPiece VARCHAR(50),
   PRIMARY KEY(idPiece)
);

CREATE TABLE AssuranceComplémentaire(
   idAssuranceComp VARCHAR(50),
   nmAssuranceComp VARCHAR(50),
   descriptionAssuranceComp VARCHAR(50),
   PRIMARY KEY(idAssuranceComp)
);

CREATE TABLE Garantie(
   idGarantie VARCHAR(50),
   libelleGarantie VARCHAR(50),
   franchiseDeBase VARCHAR(50),
   PRIMARY KEY(idGarantie)
);

CREATE TABLE Gravite(
   idGravite VARCHAR(50),
   libelleGravite VARCHAR(50),
   PRIMARY KEY(idGravite)
);

CREATE TABLE Utilisateur(
   utPseudo VARCHAR(50),
   utPrenom VARCHAR(50),
   utMp VARCHAR(50),
   utMail VARCHAR(50),
   utPhrase VARCHAR(50),
   utAdr1 VARCHAR(50),
   utAdr2 VARCHAR(50),
   utCdPost VARCHAR(50),
   utNumPost VARCHAR(50),
   utAvatar VARCHAR(254),
   utNom VARCHAR(50),
   PRIMARY KEY(utPseudo)
);

CREATE TABLE Region(
   code_region VARCHAR(50),
   nom_region VARCHAR(50),
   PRIMARY KEY(code_region, nom_region)
);

CREATE TABLE Departement(
   dep_code VARCHAR(50),
   dep_nom VARCHAR(50),
   PRIMARY KEY(dep_code, dep_nom)
);

CREATE TABLE codes_postaux(
   identifiant VARCHAR(50),
   num_postal VARCHAR(50),
   nom_commune VARCHAR(50),
   code_postal VARCHAR(50),
   PRIMARY KEY(identifiant)
);

CREATE TABLE Client(
   idClient VARCHAR(50),
   nomClient VARCHAR(50),
   prenomClient VARCHAR(50),
   mailClient VARCHAR(50),
   telClient VARCHAR(50),
   adresseClient VARCHAR(50),
   cpClient VARCHAR(50),
   villeClient VARCHAR(50),
   mdpClient VARCHAR(50),
   numLocation VARCHAR(50) NOT NULL,
   PRIMARY KEY(idClient),
   FOREIGN KEY(numLocation) REFERENCES Location(numLocation)
);

CREATE TABLE LocationSansChauffeur(
   numLocation VARCHAR(50),
   nbKmDepart DECIMAL(15,2),
   nbKmRetour DECIMAL(15,2),
   CoutEstimeReparations DECIMAL(15,2),
   idAssuranceComp VARCHAR(50),
   PRIMARY KEY(numLocation),
   FOREIGN KEY(numLocation) REFERENCES Location(numLocation),
   FOREIGN KEY(idAssuranceComp) REFERENCES AssuranceComplémentaire(idAssuranceComp)
);

CREATE TABLE FormuleSansChauffeur(
   idFormule VARCHAR(50),
   duree TIME,
   nbKmInclus DECIMAL(15,2),
   numLocation VARCHAR(50) NOT NULL,
   PRIMARY KEY(idFormule),
   FOREIGN KEY(idFormule) REFERENCES Formule(idFormule),
   FOREIGN KEY(numLocation) REFERENCES LocationSansChauffeur(numLocation)
);

CREATE TABLE Modele(
   idModele VARCHAR(50),
   nomModele VARCHAR(50),
   tarifKmSupplementaire DECIMAL(15,2),
   nbPlaces INT,
   vitesseMax INT,
   description VARCHAR(50),
   depotGarantie VARCHAR(50),
   immatriculation VARCHAR(50) NOT NULL,
   PRIMARY KEY(idModele),
   FOREIGN KEY(immatriculation) REFERENCES Vehicule(immatriculation)
);

CREATE TABLE Controle(
   idControle VARCHAR(50),
   dateHreControle DATETIME,
   observation VARCHAR(254),
   idSalarie VARCHAR(50) NOT NULL,
   PRIMARY KEY(idControle),
   FOREIGN KEY(idSalarie) REFERENCES Salarie(idSalarie)
);

CREATE TABLE Dommage(
   idPiece VARCHAR(50),
   idControle VARCHAR(50),
   idGravite VARCHAR(50) NOT NULL,
   PRIMARY KEY(idPiece, idControle),
   FOREIGN KEY(idPiece) REFERENCES Piece(idPiece),
   FOREIGN KEY(idControle) REFERENCES Controle(idControle),
   FOREIGN KEY(idGravite) REFERENCES Gravite(idGravite)
);

CREATE TABLE Pays(
   idPays VARCHAR(5),
   nomPays VARCHAR(50),
   idClient VARCHAR(50) NOT NULL,
   PRIMARY KEY(idPays),
   FOREIGN KEY(idClient) REFERENCES Client(idClient)
);

CREATE TABLE Tarification(
   idFormule VARCHAR(50),
   idModele VARCHAR(50),
   Tarif DECIMAL(15,2),
   PRIMARY KEY(idFormule, idModele),
   FOREIGN KEY(idFormule) REFERENCES FormuleSansChauffeur(idFormule),
   FOREIGN KEY(idModele) REFERENCES Modele(idModele)
);

CREATE TABLE effectuer_au_retrait(
   numLocation VARCHAR(50),
   idControle VARCHAR(50),
   PRIMARY KEY(numLocation, idControle),
   FOREIGN KEY(numLocation) REFERENCES LocationSansChauffeur(numLocation),
   FOREIGN KEY(idControle) REFERENCES Controle(idControle)
);

CREATE TABLE effectuer_a_la_restitution(
   numLocation VARCHAR(50),
   idControle VARCHAR(50),
   PRIMARY KEY(numLocation, idControle),
   FOREIGN KEY(numLocation) REFERENCES LocationSansChauffeur(numLocation),
   FOREIGN KEY(idControle) REFERENCES Controle(idControle)
);

CREATE TABLE proposer(
   idAssuranceComp VARCHAR(50),
   idGarantie VARCHAR(50),
   tauxReductionFranchise INT,
   PRIMARY KEY(idAssuranceComp, idGarantie),
   FOREIGN KEY(idAssuranceComp) REFERENCES AssuranceComplémentaire(idAssuranceComp),
   FOREIGN KEY(idGarantie) REFERENCES Garantie(idGarantie)
);

CREATE TABLE Asso_19(
   dep_code VARCHAR(50),
   dep_nom VARCHAR(50),
   identifiant VARCHAR(50),
   PRIMARY KEY(dep_code, dep_nom, identifiant),
   FOREIGN KEY(dep_code, dep_nom) REFERENCES Departement(dep_code, dep_nom),
   FOREIGN KEY(identifiant) REFERENCES codes_postaux(identifiant)
);

CREATE TABLE Asso_20(
   code_region VARCHAR(50),
   nom_region VARCHAR(50),
   dep_code VARCHAR(50),
   dep_nom VARCHAR(50),
   PRIMARY KEY(code_region, nom_region, dep_code, dep_nom),
   FOREIGN KEY(code_region, nom_region) REFERENCES Region(code_region, nom_region),
   FOREIGN KEY(dep_code, dep_nom) REFERENCES Departement(dep_code, dep_nom)
);
