# Service Web SOAP Spring Boot

Application Spring Boot exposant un service SOAP pour la gestion de comptes bancaires avec Apache CXF.

## Technologies

- Spring Boot
- Apache CXF
- Spring Data JPA
- H2 Database

## Démarrage

```bash
mvn spring-boot:run
```

## WSDL

Disponible sur `http://localhost:8080/services/ws?wsdl`

## Opérations

- `getComptes()` - Liste des comptes
- `getCompteById(id)` - Compte par ID
- `createCompte(solde, type)` - Création de compte
- `deleteCompte(id)` - Suppression de compte
# tp-13


## Author

- **Karkachi Mohamed**
