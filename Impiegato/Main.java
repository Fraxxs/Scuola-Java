//Dato un impiegato con i seguenti attributi: nome, cognome, età, e-mail, telefono, salario e
//tipo(impiegato, dirigente, manager), creare la classe java che lo rappresenti
//con tutti i metodi get/set, costruttori (almeno due) e il metodo tostring.
//Implementare inoltre l'attributo che calcoli l'aumento di salario data una percentuale in ingresso
//un metodo che determini il cambio di tipo (impiegato, dirigente, manager) in base all'età in ingresso
//18-45, 46-60, 61-67(il cambio può solo essere in maniera progressiva. Implementare nel main.

package Impiegato;

import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        int eta;

        System.out.print("Seleziona l'eta' del tuo impiegato: ");
        eta = input.nextInt();

        Impiegati i1 = new Impiegati("Franco", "Rossi", eta, "francorossi@gmail.com", "3911835976", 800, "non scelto"); //creato un nuovo impiegato, tutto presettato tranne l'età che verrà usata per stabilire il "tipo" di impiegato.
        Impiegati i2 = new Impiegati(i1); //copiato l'impiegato "i1".

        System.out.println(i1.toString()); //vengono stampate le informazioni sul primo impiegato.

        System.out.println("\nTipo scelto in base all'eta': " + i1.sceltaTipo()); //utilizzo del metodo che sceglie il tipo in base all'età.

        System.out.println(i1.toString()); //altre informazioni sul primo impiegato, questa volta per far notare che è cambiato il tipo da "non scelto" a impiegato, dirigente o manager.

        System.out.print("\nInserisci la percentuale da aggiungere al tuo salario attuale: ");
        int percentuale = input.nextInt();

        System.out.println("Salario aumentato! Salario attuale: " + i1.aumentoSalario(percentuale)); //utilizzo del metodo per aumentare il salario dell'impiegato da una percentuale del salario originale.

        System.out.println(i1.toString()); //informazioni sul primo impiegato per mostrare il cambiamento del salario.

        System.out.println(i2.toString()); //informazioni sul secondo impiegato (copia del primo) per mostrare l'utilizzo del costruttore di copia, questo presenterà le informazioni del primo impiegato originario (riga 19)

        input.close();
    }
}
