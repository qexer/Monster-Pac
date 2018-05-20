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

## Rendszerterv

![Rendszerterv - osztálydiagram](/img/class_diagram.png)

### Hogyan szerkeszd

A diagram frissítéséhez
1. nyisd meg a [nomnoml](http://www.nomnoml.com/) online diagram szerkesztőt
2. töröld ki a szövegszerkesztője tartalmát
3. másold be a [class_diagram.txt](/img/class_diagram.txt) fájl tartalmát
4. végezd el a módosítást a szerkesztőben
5. a végleges verzióval írd felül a [class_diagram.txt](/img/class_diagram.txt) fájl tartalmát
6. a 📷 gombbal exportáld ki képként a diagramot
7. az új képpel írd felül a [class_diagram.png](/img/class_diagram.png) fájlt
8. commit, push, chill

## Futtatás

Az alkalmazás jelenleg nem futtatható. Az értékelhető tartalmak
- a Rendszerterv
- [Game.java](/src/main/java/monsterpac/domain/Game.java)
- [GameTest.java](/src/test/java/unit/GameTest.java)
- [FakeTable.java](/src/test/java/unit/FakeTable.java)
- [SpyTable.java](/src/test/java/unit/SpyTable.java)