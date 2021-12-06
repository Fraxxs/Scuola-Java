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

public class Autoveicolo
{
    private String targa;
    private String marca;
    private String modello;
    private int annoImmatricolazione;
    private int passeggeriAggiuntivi;
    private int HP;
    private String alimentazione;
    private double tasse = 0;

    Autoveicolo(String targa, String marca, String modello, int annoImmatricolazione, int passeggeriAggiuntivi, int HP)
    {
      setTarga(targa);
      setMarca(marca);
      setModello(modello);
      setAnnoImmatricolazione(annoImmatricolazione);
      setPasseggeriAggiuntivi(passeggeriAggiuntivi);
      setHP(HP);
    }

    private void setTarga(String targa)
    {
        this.targa = targa;
    }

    public String getTarga()
    {
        return targa;
    }

    private void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getMarca()
    {
        return marca;
    }

    private void setModello(String modello)
    {
        this.modello = modello;
    }

    public String getModello()
    {
        return modello;
    }

    private void setAnnoImmatricolazione(int annoImmatricolazione)
    {
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public int getAnnoImmatricolazione()
    {
        return annoImmatricolazione;
    }

    private void setPasseggeriAggiuntivi(int passeggeriAggiuntivi)
    {
        this.passeggeriAggiuntivi = passeggeriAggiuntivi;
    }

    public int getPasseggeriAggiuntivi()
    {
        return passeggeriAggiuntivi;
    }

    private void setHP(int HP)
    {
        this.HP = HP;
    }
    
    public int getHP()
    {
        return HP;
    }

    public void setAlimentazione(String alimentazione)
    {
      this.alimentazione = alimentazione;
    }

    public String getAlimentazione()
    {
      return alimentazione;
    }

    public double tasseAuto()
    {
      if (alimentazione == "Tradizionale")
      {
        tasse = HP * 2.5;
      }

      else if (alimentazione == "GPL")
      {
        if (2022 - annoImmatricolazione <= 5)
        {
          tasse = 0;
        }

        else
        {
          tasse = HP * 0.75;
        }
      }

      else if (alimentazione == "Metano")
      {
        if (2022 - annoImmatricolazione <= 5)
        {
          tasse = 0;
        }

        else
        {
          tasse = HP * 0.5;
        }
      }

      else if (alimentazione == "Gas idrogeno")
      {
        if (2022 - annoImmatricolazione <= 1)
        {
          tasse = 0;
        }

        else
        {
          tasse = ((2021 - annoImmatricolazione) * HP) * 0.1;
        }
      }

      return tasse;
    }

    public void stampa()
    {
      if (alimentazione == "Elettrica")
      {
        System.out.println("\n\tTarga: " + getTarga() + ".\n\tMarca: " + getMarca() + ".\n\tModello: " + getModello() + ".\n\tAnno immatricolazione: " + getAnnoImmatricolazione() + ".\n\tPasseggeri aggiuntivi: " + getPasseggeriAggiuntivi() + ".\n\tPotenza in cavalli:" + getHP() + ".\n\tTipo alimentazione: " + getAlimentazione() + ".\n\tCome incentivo governativo gli autoveicoli elettrici non pagano alcuna tassa.\n");
      }

      else
      {
        System.out.println("\n\tTarga: " + getTarga() + ".\n\tMarca: " + getMarca() + ".\n\tModello: " + getModello() + ".\n\tTasse: " + tasseAuto() + " euro.\n");
      }
    }
}
