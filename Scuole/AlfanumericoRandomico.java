//allora questo è un codice che genera un alfanumerico casuale, io l'ho fatto ma non ho capito una sega
//di alcune cose che ho usato, ho cercato di informarmi il più possibile ma ancora niente di chiaro
//appena capisco qualcosa aggiungo più commenti
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
                                                      //alla fine del costruttore. Per esempio z.append("ciao") aggiunge "ciao" al contenuto di z.
                                                      //insert() invece inserisce i caratteri in una posizione scelta
                                                      //e si caricano come paramentri un intero (che sarà la posizione nella quale inserire i caratteri)
                                                      //e la variabile da inserire come carattere. Per esempio 

        for (int i = 0; i < lunghezza; i++)
        {
            risultato.append(alfanumerico[new Random().nextInt(alfanumerico.length)]);
        }

        return risultato.toString();
    }
}
