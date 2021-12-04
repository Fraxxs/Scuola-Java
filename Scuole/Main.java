package Scuole;

import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        AlfanumericoRandomico random = new AlfanumericoRandomico();
        String codice = random.alfanumericoRandomico(10);

        String grado = "";
        String denominazione;
        String citta;
        int nStudenti;
        int nClassi;
        int sediAggiuntive;
        int laboratori;

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

                default: break;
            }
        }

        Scuola s1 = new Scuola(grado, codice, denominazione, citta, nStudenti, nClassi, sediAggiuntive, laboratori);

        System.out.println("Contributo annuale calcolato in base al grado della scuola: " + s1.contributoAnnuale() + ".");

        System.out.println(s1.toString());

        input.close();
    }
}
