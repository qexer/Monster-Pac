# Monster-Pac

## Project cél

A csapatunk által készített játék egy Pacman adoptáció, amelyben egy karaktert kell irányítanunk. A játék célja, hogy összegyűjtsük a pályán található összes pontot, mielőtt valamelyik ellenfél ránk találna.
Ezt egy asztali Java alkalmazás keretein belül fogjuk megvalósítani.
További cél még a tárgy teljesítése és ezzel a tárgy által bemutatott eszközök használatában való elmélyedés. Emellett a clean code alkalmazásában tapasztalat szerzés.

## A csapat tagjai

- Baranyai Mercédesz
- Marton András
- Stiller László
- Fejes Máté

## Felhasználói dokumentáció

A program egy egy-ablakos alkalmazásként fog működni. Az elején rákattinthatunk a "Start!" gombra, majd kezdetét veszi a játék.
Itt egy emberkét fogunk irányítani, akinek a célja hogy az adott pályán minél több pontot gyűjtsön össze.
Pontokat a pályán elhelyezett bogyók összegyűjtésével lehet gyűjteni.
A pályán ezenkívül találhatóak még hozzánk hasonló ellenfelek is, akiket ki kell kerülnünk. Ha ez nem sikerül elkapnak, és véget ér a játék.
Ilyenkor lehetőségünk van új játékot indítani, vagy kilépni az alkalmazásból.
A játékot menet közben bármikor meg lehet szakítani a felső sarokban található X gombra kattintással.

### Futtatás

Az alkalmazás a bináris fájl letöltése után egyből futtatható.  
TODO link bináris fájl

----

## Fejlesztői dokumentáció

### Rendszerterv

![Rendszerterv - osztálydiagram](/img/class_diagram.png)

#### Hogyan szerkeszd
 	 
-A diagram frissítéséhez	+Az alkalmazás a bináris fájl letöltése után egyből futtatható.
-1. nyisd meg a [nomnoml](http://www.nomnoml.com/) online diagram szerkesztőt	
-2. töröld ki a szövegszerkesztője tartalmát	
-3. másold be a [class_diagram.txt](/img/class_diagram.txt) fájl tartalmát	
-4. végezd el a módosítást a szerkesztőben	
-5. a végleges verzióval írd felül a [class_diagram.txt](/img/class_diagram.txt) fájl tartalmát	
-6. a 📷 gombbal exportáld ki képként a diagramot	
-7. az új képpel írd felül a [class_diagram.png](/img/class_diagram.png) fájlt	
-8. commit, push, chill

### Jövőbeli tervek

Új pályák, és fejlettebb mesterséges intelligencia hozzáadása a játékhoz. Emellett a grafikai részt szeretnénk még kicsit csinosítani.
