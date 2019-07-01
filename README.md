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

## Deel 2
