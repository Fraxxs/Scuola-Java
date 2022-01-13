/*Il Ministero dell'Istruzione deve commissionare
un software per il calcolo dei contributi statali
dovuti alle scuole. Un professionista viene incaricato
di progettare e implementare la gerarchia
di classi che rappresenta le scuole.
Durante un'intervista con il direttore generale del Ministero
emerge quanto segue:
- le scuole possono essere: elementari, medie o superiori;
- per ogni scuola è necessario memorizzare il codice alfanumerico, la denominazione, la città, il numero di studenti, il numero di classi, il numero di sedi aggiuntive e il numero complessivo di laboratori;
- le scuole elementari hanno diritto a un con tributo annuale per ogni studente e per ogni sede aggiuntiva: i contributi valgono oggi 125 € per ogni studente e 9000 € per ogni sede aggiuntiva (i valori potrebbero essere modificati in futuro);
- le scuole medie hanno diritto a un contributo annuale per ogni studente, per ogni labora torio e per ogni sede aggiuntiva: i contributi valgono oggi 150 € per ogni studente, 1100 € per ogni laboratorio e 9000 € per ogni sede aggiuntiva (i valori potrebbero essere modi ficati in futuro);
- le scuole superiori sono di tre tipi diversi: li cei, tecnici e professionali;
- licei hanno diritto a un contributo annuale uguale a quello delle scuole medie, escluso il contributo per eventuali sedi aggiuntive;
- tecnici hanno diritto a un contributo annua le per ogni classe e per ogni indirizzo: i con tributi valgono oggi 3500 € per ogni classe el 6000 € per ogni laboratorio (i valori potreb bero essere modificati in futuro);
- professionali che hanno diritto anche al contributi regionali hanno diritto a un con tributo statale di 2400 € per ogni classe e di 3000 € per ogni laboratorio (i valori potrebbero essere modificati in futuro).*/

package Scuole;

import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        AlfanumericoRandomico AlfaRandom = new AlfanumericoRandomico(); //creato un oggetto della classe "AlfanumericoRandomico()" (guarda https://github.com/Fraxxs/Scuola-Java/blob/main/Scuole/AlfanumericoRandomico.java)
        String codice = AlfaRandom.alfanumericoRandomico(10); //qui viene richiamato il metodo per generare il numero randomico, ho scelto un massimo di "10"
                                                              //e viene assegnato alla variabile "codice" sottoforma di String.

        String grado = "";
        String denominazione;
        String citta;
        int nStudenti;
        int nClassi;
        int sediAggiuntive;
        int laboratori;
        //input dei delle varie variabili
        System.out.print("Inserire il nome della scuola: ");
        denominazione = input.nextLine();

        System.out.print("Inserire città di appartenenza della scuola: ");
        citta = input.nextLine();

        System.out.print("Inserire il numero di studenti presenti nella scuola: ");
        nStudenti = input.nextInt();

        System.out.print("Inserire il numero di classi presenti nella scuola: ");
        nClassi = input.nextInt();

        System.out.print("Inserire il numero di sedi aggiuntive alla scuola: ");
        sediAggiuntive = input.nextInt();

        System.out.print("Inserire il numero di laboratori presenti nella scuola: ");
        laboratori = input.nextInt();
        //ciclo while e switch per eseguire una scelta
        boolean loop = true;
        while(loop)
        {
            System.out.println("Scegli il grado della tua scuola.\n1 - Eelementari.\n2 - Medie.\n3 - Liceo.\n4 - Tecnico.\n5 - Professionale.");
            int scelta = input.nextInt();

            switch(scelta)
            {
                case 1:
                {
                    grado = "Elementari";
                    loop = false;
                    break;
                }

                case 2:
                {
                    grado = "Medie";
                    loop = false;
                    break;
                }

                case 3:
                {
                    grado = "Liceo";
                    loop = false;
                    break;
                }

                case 4:
                {
                    grado = "Tecnico";
                    loop = false;
                    break;
                }

                case 5:
                {
                    grado = "Professionale";
                    loop = false;
                    break;
                }

                default: 
                {
                    System.out.println("Scelta non valida.");
                    break;
                }
            }
        }
        Scuola s1 = new Scuola(grado, codice, denominazione, citta, nStudenti, nClassi, sediAggiuntive, laboratori); //creazione oggetto di "Scuola"

        System.out.println("Contributo annuale calcolato in base al grado della scuola: " + s1.contributoAnnuale() + "."); //richiamo della funzione che calcola il contributo annuale

        System.out.println(s1.toString()); //stampa delle informazioni sull'oggetto

        input.close();
    }
}
