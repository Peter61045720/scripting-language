# EN: Compilers: Scripting language with AST generation

This project implements a basic scripting language with an abstract syntax tree (AST) interpreter written in Java using ANTLR 4.

For usage examples and test cases, see the `tests/` folder.

# HU: Fordítóprogramok: Szkriptnyelv AST generálással


## Használt eszközök

- Java 21.0.7
- ANTLR 4.11.1
- IntelliJ IDEA 2025.1 (Ultimate Edition)


## Megvalósított funkciók
- Egy kifejezés a következő operátorokkal/műveletekkel, megfelelő precedenciákkal adható meg: `+`, `-`, `*`, `/`, `(`, `)`, `ABS()`, `?:`, `=`.
- Logikai kifejezések: `==`, `!=`, `<`, `>`. Értékük 0 ha hamisra értékelődnek ki, 1 ha igazra.
- `print(...)` utasítás, ami a paraméterül kapott kifejezést kiírja (egyszerre csak egyet).
- `scan(...)` utasítás, ami a paraméterül kapott változó értékét olvassa be (egyszerre csak egyet).
- Adott a `TIME` konstans, ami az aktuális idő (a UNIX idő, azaz az 1970 óta eltelt másodpercek száma).
- Változók deklarációja: `int` és `double` típusúak lehetnek. Változó újradeklarálása esetén hiba keletkezik. Egy `int` típusú változónak nem adható `dobule` érték, fordítva viszont elfogadott. Minden változó globális. A változódeklaráció egy utasítás (`Statement`).
- A `del` utasítással lehet változót törölni.
- Vezérlési szerkezetek: `for`, `while`, `if`, `if`-`else` C-szerű szintaxissal.
- Egysoros megjegyzés a `#` jellel lehetséges. Ilyenkor a kommentben szereplő kódrészlet sem hajtódik végre.
- Az elemző felépíti az AST-t, a végrehajtás külön fázisban történik a `Main.java`-ban.


## Extra funkciók
- Maradékos osztás `%` segítségével (szorzás, osztás precedencia szintjén van)
- `prefix/postfix` inkrementálás (`++`) és dekrementálás (`--`). A `prefix/postfix` változatok között nincs különbség, minden esetben a C nyelvből ismert `prefix` módon viselkednek.
- További logikai kifejezések: `&&`, `||`, `!`


## Tesztfájlok
A `tests/` mappában találhatók azok a tesztfájlok, amelyeket a `Main.java` osztály automatikusan betölt és sorban végrehajt. A végrehajtás során az egyes tesztek eredménye a konzolra íródik ki, és van olyan példa is, ami a felhasználótól vár bemenetet.

Lehetséges a meglévő tesztfájlok módosítása és új fájlok létrehozása is.


### Fontos
A tesztfájlokat `test{sorszam}.txt` néven kell elnevezni, ahol a `{sorszam}` helyére egy egész számot kell írni úgy, hogy `1`-től kezdődjön az indexelés, és egymás után, kihagyás nélkül kell következnie az indexeknek, amelyek nem ismétlődhetnek.