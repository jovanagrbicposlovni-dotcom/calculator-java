## 📊 Software Metrics

### LOC (Lines of Code)

| File | LOC |
|------|-----|
| Calculator.java | 188 |
| Start.java | 26 |
| **Total** | **214** |

---

## 🔍 Static Code Analysis Report

### Calculator.java
- Korišćenje globalne `static` promenljive.
- Neusklađenost sa Java naming konvencijama.
- Predugačka i kompleksna metoda `Calculate`.
- Dupliran kod za aritmetičke operacije.
- Nedostatak validacije ulaza i zaštite od deljenja nulom.
- Slaba obrada grešaka i nedostatak Javadoc komentara.

### Start.java
- Nepravilno imenovanje promenljivih.
- Neefikasno korišćenje `Scanner` objekta.
- Nedostatak obrade izuzetaka.
- Ograničena validacija korisničkog unosa.

Zaključak: Kod je funkcionalan, ali zahteva refaktorisanje radi bolje čitljivosti, održavanja i robusnosti.
