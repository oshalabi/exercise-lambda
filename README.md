# Introductie

Deze oefening is deel van de DEA Course aan de Hogeschool Arnhem/Nijmegen. 
Onderwerp is het bekend raken met de Lambda Expressies.

# Oefening

In het eerste deel van de oefening zal je een bestaande codebase moeten refactoren, waarbij
gebruikt zal worden gemaakt van Lambda Expressies. Er zijn Unittests beschikbaar om te kunnen
verifieren dat de code nog steeds correct werkt.

In het tweede deel zal de code nog verder aangepast moeten worden, waarbij de huidige set 
Unittests niet meer zomaar geschikt is en deze dus aangepast zal moeten worden.

## Deel 1

### 1. Magic Numbers
De huidige codebase bevat een Magic Number. Vervang deze door een constante. 

Run de Unittests om er zeker van te zijn dat alles nog werkt.

### 2. Remove Duplicate Code/Extract Method
Merk op dat de methodes `createMaleAdultList()` en `createFemaleAdultList()` duplicate code bevatten. Deze
code bevat feitelijk twee checks:
* Of een persoon ouder dan 18 is
* Of een persoon MALE/FEMALE is

Creëer voor beide checks een methode de check uitvoert en roep deze aan vanuit `createMaleAdultList()` en `createFemaleAdultList()`.

Run de Unittests om er zeker van te zijn dat alles nog werkt.

### 3. Move Method
Mogelijk heb je voorgaande twee methodes als private methodes toegevoegd aan de `ListMaker`. Dat is niet waar
ze thuishoren. Verplaats beide methodes naar de klasse waar ze thuishoren.

Run de Unittests om er zeker van te zijn dat alles nog werkt.

### 4. Remove Duplicate Code/Extract Method
Ondanks de verbeteringen bevatten `createMaleAdultList()` en `createFemaleAdultList()` nog
steeds Duplicate Code. Creëer een private methode, genaamd `createAdultList()`, die als tweede parameter de
`Gender` krijgt waar een lijst voor gemaakt moet worden. Roep deze methode vervolgens vanuit
`createMaleAdultList()` en `createFemaleAdultList()` aan.

Run de Unittests om er zeker van te zijn dat alles nog werkt.

### 5. Gebruik van de forEach van de Stream API
De nieuwe methode `createAdultList()` bevat een for-loop. Vervang deze door gebruik te maken van de `forEach`  
van de Stream API. 

Run de Unittests om er zeker van te zijn dat alles nog werkt.

### 6. Lambda expressie voor ouder dan 18 check
Merk op dat de twee checks:

* Of een persoon ouder dan 18 is
* Of een persoon MALE/FEMALE is

nu in de body van de `forEach` staan. Dat kan netter worden opgelost. Juist voor deze situatie heeft de Stream API
de `filter` methode. Deze methode heeft een `Predicate` als parameter, wat een Lambda expressie is die een `boolean` 
retourneert. 

In dit onderdeel gaan we een Lambda-expressie maken die checked of een `Person` ouder dan 18 is. Vervolgens halen we
deze check uit de `forEach` en voegen we een `filter` toe die de Lambda-expressie als `Predicate` gebruikt.

Creëer een `Predicate` die als volgt uitziet:

``

``



## Deel 2
