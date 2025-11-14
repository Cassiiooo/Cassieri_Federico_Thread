# Processo di Prodizione Libro
## Descrizione
Questo progetto Java simula la produzione di uno o più libri. Ogni libro è composto da due fasi principali: stampa delle pagine e rilegatura. Ciascuna fase viene eseguita tramite un thread che mostra a schermo la percentuale di avanzamento del lavoro. Quando entrambi i thread terminano, il libro viene considerato completo.

## Autore
Federico Cassieri 
Version 1.0

## Struttura del progetto 
Il progetto contiene le seguenti classi
- **ProduzioneLibro**: gestisce la produzione di uno o più libri.
- **ThreadStampaPagine**: simula la stampa delle pagine del libro.
- **ThreadRilegatura**: simula la rilegatura del libro

## Funzionamento
1. L'utente indica quanti libri vuole produrre.
2. Per ogni libro vengono creati due thread, uno per la stampa e uno per la rilegatura.
3. Ogni thread mostra l'avanzamento della propria fase in percentuale.
4. Quando entrambi i thread terminano, il libro viene considerato completato e viene mostrato un messaggio finale-

## Esempio output
Quanti libri vuoi produrre?
1
stampa pagine: 0%
Rilegatura: 0%
Stampa pagine: 50%
Rilegatura: 50%
Stampa pagine: 100%
Rilegatura: 100%
Assemblaggio del libro numero 1
Il libro numero 1 è stato completato

## Requisiti e Licenze
-IDE Java (es. IntelliJ IDEA)
Open Source
