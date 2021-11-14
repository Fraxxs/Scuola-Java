/*Crea un programma per la gestione di un controcorrente gestito dalla classe CC.
Il programma deve essere in grado di effettuare versamenti, prelievi,
di restituire il saldo e di effettuare la lista degli ultimi 5 movimenti .*/

package Banca;

import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        int n;
        char scelta;
        char scelta2;
        CC conto = new CC();

        do
        {
            System.out.println("\ns - Saldo");
            System.out.println("v - Versamento");
            System.out.println("p - Prelievo");
            System.out.println("l - Lista delle ultime cinque azioni effettuate");
            System.out.println("x - Termina il programma\n");
            scelta = input.next().charAt(0);

            switch(scelta)
            {
                case 'v':
                System.out.print("Inserire somma da versare: ");
                n = input.nextInt();
                System.out.println("E' stato effettuato un versamento di " + n + " euro. Confermare?");
                System.out.println("c - Conferma.\nn - annulla");
                scelta2 = input.next().charAt(0);
                if (scelta2 == 'c')
                {
                    System.out.println("Scelta confermata.");
                    conto.versamento(n);
                    break;
                }
                
                else if (scelta2 == 'n')
                {
                    System.out.println("Azione annullata.");
                    break;
                }
                
                else
                {
                    System.out.println("Opzione non valida.");
                    break;
                }
            
                case 'p':

                System.out.print("Inserire somma da prelevare: ");
                n = input.nextInt();
                System.out.println("E' stato effettuato un prelievo di " + -n + " euro. Confermare?");
                System.out.println("c - Conferma.\nn - annulla");
                scelta2 = input.next().charAt(0);
                if (scelta2 == 'c')
                {
                    System.out.println("Scelta confermata.");
                    conto.prelievo(n);
                    break;
                }
                
                else if (scelta2 == 'n')
                {
                    System.out.println("Azione annullata.");
                    break;
                }
                
                else
                {
                    System.out.println("Opzione non valida.");
                    break;
                }

                case 'l':
                System.out.println("\nLista delle ultime cinque azioni effettuate:\n");
                conto.lista();
                break;
                
                case 's': 
                System.out.println("\nSaldo: " + conto.Saldo()); 
                break;
                
                case 'x': System.out.println("\nProgramma terminato.\n");
                break;

                default:
                System.out.println("Opzione non valida.");
                break;
            }
        }while (scelta != 'x');

        input.close();
    }
}
