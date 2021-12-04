//StringBuilder() è una classe preesistente in java.lang.
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
//Ecco nel dettaglio l'utilizzo di StringBuilder()

public class EsempioStringBuilder
{
    public static void main(String[]args)
    {
        int x = 10;

        StringBuilder esempio = new StringBuilder(); //creazione oggetto (che possiamo definire come una variabile) di tipo StringBuilder

        esempio.append("5 + 5 "); //"esempio" è vuoto, con questa riga si aggiunge "ciao" ad esso.

        System.out.println(esempio); //stamperà "5 + 5 "

        esempio.append(x); //a "5 + 5 " verrà aggiunto "10"

        System.out.println(esempio); //stamperà "5 + 5 10"

        esempio.insert(6, "= "); //a "5 + 5 10" verrà inserito nella posizione numero 6 (da ricordare che, come in un vettore, le posizioni partono da zero e valgono anche gli spazi)

        System.out.println(esempio); //stamperà "5 + 5 = 10"

        String convertire = esempio.toString(); //nel codice questo non viene utilizzato ma in caso servisse "esempio" può essere convertito in String con un semplice "toString()"
    }    
}
