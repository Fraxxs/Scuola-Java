/*Un'agenzia di pratiche automobilistiche deve commissionare un software per il pagamento delle tasse
annuali sui veicoli. Un professionista viene incaricato di progettare e implementare la gerarchia di
classi che rappresentano i veicoli. Durante un'intervista al proprietario dell'agenzia emerge quanto segue:
- i veicoli possono essere motoveicoli o autoveicoli;
- per ogni veicolo è necessario memorizzare la targa, la marca, il modello,
  l'anno di immatricolazione e il numero di passeggeri consentito oltre al conducente;
- i motoveicoli sono sempre alimentati a benzina e sono caratterizzati dalla potenza espressa
  in HP: la tassa viene calcolata moltiplicando per la potenza un valore che a oggi vale 1,5 E/HP;
- gli autoveicoli tradizionali possono essere alimentati a benzina o a gasolio e sono
  caratterizzati dalla potenza espressa in HP: la tassa viene calcolata moltiplicando per
  la potenza un valore che a oggi vale 2,5 C/HP;
- per gli autoveicoli alimentati a gas, oltre alla potenza è necessario memorizzare il tipo di gas
  (GPL o metano): questi autoveicoli non pagano nessuna tassa per i primi 5 anni dall'immatricolazione,
  trascorso questo periodo la tassa viene calcolata moltiplicando per la potenza un valore che a oggi
  vale 0,5 E/HP per il metano e 0,75 E/HP per il GPL;
- gli autoveicoli alimentati a gas idrogeno pagano una tassa che aumenta di 0,1 €/HP per ogni anno di
  vita del veicolo a partire da una tassa iniziale pari a 0 C/HP il primo anno di immatricolazione;
- come incentivo governativo gli autoveicoli elettrici non pagano alcuna tassa.*/

package TasseAnnuali;

import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        String targa;
        String marca;
        String modello;
        int annoImmatricolazione;
        int passeggeriAggiuntivi;
        int HP;
        int scelta = 0;

        boolean loop1 = true;
        while(loop1 == true)
        {
            System.out.println("Seleziona il tipo di veicolo.\n\n1 - Autoveicolo.\n2 - Motoveicolo.\n");
            scelta = input.nextInt();

            switch(scelta)
            {
                case 1:
                {
                    System.out.print("Inserisci la targa del tuo autoveicolo: ");
                    input.nextLine();
                    targa = input.nextLine();

                    System.out.print("Inserisci la marca del tuo autoveicolo: ");
                    marca = input.nextLine();

                    System.out.print("Inserisci il modello del tuo autoveicolo: ");
                    modello = input.nextLine();

                    System.out.print("Inserisci l'anno di immatricolazione del tuo autoveicolo: ");
                    annoImmatricolazione = input.nextInt();

                    System.out.print("Inserisci potenza in cavalli del tuo autoveicolo: ");
                    HP = input.nextInt();

                    System.out.print("Inserisci il numero di passeggeri che possono salire sul tuo autoveicolo oltre al guidatore: ");
                    passeggeriAggiuntivi = input.nextInt();

                    Autoveicolo auto = new Autoveicolo(targa, marca, modello, annoImmatricolazione, passeggeriAggiuntivi, HP);

                    boolean loop2 = true;
                    while(loop2 == true)
                    {
                        System.out.print("Con cosa viene alimentata il tuo autoveicolo?\n\n1 - Tradizionale (benzina o gasolio).\n2 - Gas (GPL o metano).\n3 - Gas idrogeno.\n4 - Elettrica.\n");
                        int scelta2 = input.nextInt();

                        switch(scelta2)
                        {
                            case 1:
                            {
                                auto.setAlimentazione("Tradizionale");
                                loop2 = false;
                                break;
                            }

                            case 2:
                            {
                                boolean loop3 = true;
                                while(loop3 == true)
                                {
                                    System.out.println("Che tipo di gas alimenta il tuo autoveicolo?\n\n1 - GPL.\n2 - Metano.\n");
                                    int scelta3 = input.nextInt();

                                    switch(scelta3)
                                    {
                                        case 1:
                                        {
                                            auto.setAlimentazione("GPL");
                                            loop3 = false;
                                            break;
                                        }

                                        case 2:
                                        {
                                            auto.setAlimentazione("Metano");
                                            loop3 = false;
                                            break;
                                        }

                                        default:
                                        {
                                            System.out.println("Scelta non consentita.");
                                            break;
                                        }
                                    }
                                }

                                loop2 = false;
                                break;
                            }

                            case 3:
                            {
                                auto.setAlimentazione("Gas idrogeno");
                                loop2 = false;
                                break;
                            }

                            case 4:
                            {
                                auto.setAlimentazione("Elettrica");
                                loop2 = false;
                                break;
                            }

                            default:
                            {
                                System.out.println("Scelta non consentita.");
                                break;
                            }
                        }
                    }

                    auto.stampa();

                    loop1 = false;
                    break;
                }

                case 2:
                {
                    System.out.print("Inserisci la targa del tuo motoveicolo: ");
                    input.nextLine();
                    targa = input.nextLine();

                    System.out.print("Inserisci la marca del tuo motoveicolo: ");
                    marca = input.nextLine();

                    System.out.print("Inserisci il modello del tuo motoveicolo: ");
                    modello = input.nextLine();

                    System.out.print("Inserisci l'anno di immatricolazione del tuo motoveicolo: ");
                    annoImmatricolazione = input.nextInt();

                    System.out.print("Inserisci potenza in cavalli del tuo motoveicolo: ");
                    HP = input.nextInt();

                    System.out.print("Inserisci il numero di passeggeri che possono salire sul tuo motoveicolo oltre al guidatore: ");
                    passeggeriAggiuntivi = input.nextInt();

                    Motoveicolo moto = new Motoveicolo(targa, marca, modello, annoImmatricolazione, passeggeriAggiuntivi, HP);

                    moto.stampa();

                    loop1 = false;
                    break;
                }

                default:
                {
                    System.out.println("Scelta non consentita.");
                    break;
                }
            }
        }

        input.close();;
    }
}