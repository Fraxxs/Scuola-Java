//codice che genera randomicamente un codice alfanumerico
package Scuole;

import java.util.Random;

public class AlfanumericoRandomico
{
    //le variabili sono "final" perché non potranno essere modificate in alcun modo
    private final String lettere = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //variabile che indica quali lettere verranno usate nel generatore casuale
    private final char[] alfanumerico = (lettere + lettere.toLowerCase() + "0123456789").toCharArray();//il metodo "toCharArray()" serve a copiare i caratteri di una determinata sottostringa
//                    ^                                         ^                                      //(in questo caso le lettere dell'alfabeto [sia in maiuscolo che in minuscolo] e i numeri da 0 a 9)
//                    |                                         |                                      //in un vettore di caretteri (char [] alfanumerico)
//                    |                                         |
//                    |                                         |  
            /*vettore di caratteri*/      /*metodo che trasforma la Stringa della variabile "lettere" in minuscolo*/


    public String alfanumericoRandomico(int lunghezza)//metodo che stampa come String una serie di numeri e lettere (selezionate randomicamente dal vettore creato in precedenza) in sequenza
    {
        StringBuilder risultato = new StringBuilder();//StringBuilder() è una classe preesistente in java.lang.
                                                      //Si tratta di una classe che può sostituire la String e
                                                      //contiene una serie di caratteri mutabile e utilizza come metodi
                                                      //fondamentali append() e insert().
                                                      //append() "appende" semplicemente una variabile inserita
                                                      //(che può essere di qualsiasi tipo di variabile)
                                                      //alla fine del costruttore. Per esempio z.append(" ciao") aggiunge " ciao" al contenuto di z.
                                                      //insert() invece inserisce i caratteri in una posizione scelta
                                                      //e si caricano come paramentri un intero (che sarà la posizione nella quale inserire i caratteri)
                                                      //e la variabile da inserire come carattere. Per esempio z.insert(4, " ciao") inserisce " ciao" nella posizione numero 4
                                                      //(da tenere a mente che la posizione vale come i vettori e quindi va da 0 in su)
                                                      //Nel mio github è presente un esempio dell'utilizzo della classe StringBuilder()
                                                      //(https://github.com/Fraxxs/Scuola-Java/blob/main/EsempioStringBuilder.java)

        for (int i = 0; i < lunghezza; i++)//Semplice ciclo for che si ripete il numero di volte inserito nel metodo
        {
            risultato.append(alfanumerico[new Random().nextInt(alfanumerico.length)]);//Qui viene aggiunto all'oggetto "risultato"
        }                                                                             //un numero o una lettera (create nelle righe 11 e 12).
                                                                                      //all'interno di append() viene passato alfanumerico[]
        return risultato.toString();//dato che il metodo è di tipo String             //(le parentesi quadre servono perché stiamo lavorando sul vettore di "alfanumerico")
                                    //si utilizza un semplice toString()              //all'interno delle parentesi quadre invece troviamo:
    }                               //per convertire "risultato"                      //[new Random().nextInt(alfanumerico.length)]
}                                   //(oggetto della classe "StringBuilder()")        //      ^         ^                 ^
                                    //in String.                                      //      |         |                 |
                                                                                      //      |         |  questo è il limite che nextInt() può selezionare, .length rappresenta la lunghezza di un vettore, in questo caso la lunghezza del vettore "alfanumerico" (ovvero 61)
                                                                                      //      |         |  
                                                                                      //      |     seleziona un numero intero creato nel random
                                                                                      //      |
                                                                                      //crea un numero randomico
                                                                                      //
                                                                                      //Questo sceglierà quindi un numero che sarà semplicemente la posizione del vettore
                                                                                      //che verrà appeso a quello che abbiamo già caricato.
                                                                                      //Per esempio ipotizziamo che il numero scelto casualmente sia 25.
                                                                                      //La cella numero 25 contiene la lettera "Z" in maiuscolo e quindi al momento riceveremo "Z".
                                                                                      //Ora il numero scelto casualmente sarà "27".
                                                                                      //La cella numero 27 contiene la lettera "b" in minuscolo che, venendo appeso a quello che già abbiamo, diventerà "Zb".
                                                                                      //Questo processo sarà ripetuto per il numero di volte inserito in "lunghezza".