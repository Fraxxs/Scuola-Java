/*Scrivere un programma in java che calcoli l’importo di una tassa secondo la seguente tabella:
Fino a 10.000 €, l’importo della tassa è del 10%
Fino a 20.000 €, l’importo della tassa è del 10% per i primi 10.000 €, del 7 % sul restante.
Fino a 30.000 €, l’importo è ancora del 10% per i primi 10.000 €, poi del 7% fino a 20.000 ed infine
il 5% sul restante. Oltre i 30.000 € ci si comporta come prima, aggiungendo un ulteriore 3% è sulla
porzione oltre i 30.000 €.Per ogni importo non valido si ritorni -1 (qualunque importo che non sia un 
numero reale e positivo).*/

import java.util.Scanner;

public class importoTasse
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int importo;
        double tassa = 0;

        while(true)
        {
            System.out.println("Inserire importo: ");
            importo = input.nextInt();
        
            if (importo <= 0){
                System.out.println("Inserisci un importo maggiore di 0.");
                continue;}
            if (importo <= 10000)
                tassa = (importo * 10) / 100;
            else if(importo <= 20000)
                tassa = 1000 + (importo - 10000) * 0.07;
            else if(importo <= 30000)
                tassa = 1700 + (importo - 20000) * 0.05;
            else
                tassa = 2200 + (importo - 30000) * 0.03;{
                }
            System.out.println("Tassa: " + tassa);
            System.out.println("Se vuoi inserire un altro digita 0, altrimenti digitare un qualsiasi altro numero per concludere.");
            int risposta = input.nextInt();
            if(risposta != 0)
            {
                System.out.println("Programma chiuso.");
                break;
            }

            input.close();
        }
    } 
}