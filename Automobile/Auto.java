/*Creare la classe auto che ha i seguenti attributi: stato (indica se è acceso o spento),
velocità, modello, casaAutomobilistica, colore, litriCarburante, consumi.
Metodi, oltre a quelli standard e ai costruttori,
fare i metodi accelera/decelera, accendi/spegni.
Implementare inoltre il metodo viaggio che restituisce
se l'auto può arrivare a destinazione o meno in base
ai chilometri da percorrere.*/

package Automobile;

public class Auto
{
    private boolean stato = false;
    private int velocita;
    private String modello;
    private String casaAutomobilistica;
    private String colore;
    private int litriCarburante;
    private int consumi;
    private int distanza;
    private double gas = Math.random() * 100; //variabile assegnata randomicamente per creare una probabilità.
    private int stazione = (int)gas; //la variabile viene trasformata in intero.
    //costruttore
    Auto(boolean stato, int velocita, String modello, String casaAutomobilistica, String colore, int litriCarburante, int consumi, int distanza)
    {
        stato = false;
        setVelocita(velocita);
        setModello(modello);
        setCasaAutomobilistica(casaAutomobilistica);
        setColore(colore);
        setLitriCarburante(litriCarburante);
        setConsumi(consumi);
        setDistanza(distanza);
    }
    //getter e setter
    private void setVelocita(int velocita)
    {
        this.velocita = velocita;
    }

    private void setModello(String modello)
    {
        this.modello = modello;
    }

    private void setCasaAutomobilistica(String casaAutomobilistica)
    {
        this.casaAutomobilistica = casaAutomobilistica;
    }

    private void setColore(String colore)
    {
        this.colore = colore;
    }

    public void setLitriCarburante(int litriCarburante)
    {
        this.litriCarburante = litriCarburante;
    }

    private void setConsumi(int consumi)
    { 
        this.consumi = consumi;
    }

    private void setDistanza(int distanza)
    {
        this.distanza = distanza;
    }

    public boolean getStato()
    {
        return stato;
    }

    public int getVelocita()
    {
        return velocita;
    }

    public String getModello()
    {
        return modello;
    }

    public String getCasaAutomobilistica()
    {
        return casaAutomobilistica;
    }

    public String getColore()
    {
        return colore;
    }

    public int getLitriCarburante()
    {
        return litriCarburante;
    }

    public int getConsumi()
    {
        return consumi;
    }

    public int getDistanza()
    {
        return distanza;
    }

    public int accellera() //metodo che incrementa la velocità dell'auto se essa è accesa.
    {
        if(getStato() == true)
        {
            velocita += 73;
            System.out.println("Hai accellerato, velocita' attuale = " + getVelocita() + "Km/h.");
        }
        else
        {
            System.out.println("L'auto e' spenta!");
        }
        
        return velocita;
    }

    public int decellera() //metodo che decrementa la velocità dell'auto.
    {
        if (velocita > 0)
        {
            velocita -= 73;
            System.out.println("Hai decellerato, velocita' attuale = " + getVelocita() + "Km/h.");
        }
        if (velocita <=0);
        {
            System.out.println("L'auto e' ferma!");
        }
        return velocita;
    }

    public boolean accendi() //metodo che mette in moto l'auto e avverte se essa sia o meno già accesa.
    {
        if (getStato() == true)
        {
            System.out.println("L'auto e' gia' accesa!");
        }

        else{System.out.println("Auto accesa senza intoppi");}
        
        stato = true;
        return stato;
    }

    public boolean spegni() //metodo che spegne l'auto e avverte se essa sia o meno già spenta.
    {
        if (getStato() == false)
        {
            System.out.println("L'auto e' gia' spenta!");
        }
        else
        {
            velocita = 0;
            System.out.println("Auto spenta senza problemi.");
        }
        
        stato = false;
        return stato;
    }

    public void viaggio() //metodo che controlla se è possibile attraversare il viaggio inserito nel main
    {                     //calcolando i litri necessari per arrivare ai kilometri inseriti
                          //tramite un consumo in 30Km e i litri nel serbatoio.

        if(((getLitriCarburante() / getConsumi()) * 30) >= getDistanza())
        {
            System.out.println("Il viaggio può essere eseguito senza problemi.");
        }
        if(((getLitriCarburante() / getConsumi()) * 30) < getDistanza())
        {
            System.out.println("Non hai abbastanza benzina per svolgere il viaggio.");

            if (stazione <= 65) //qui viene usata la variabile randomica dichiarata in precedenza
                                //creando una chance del 65% di riempire il serbatoio in caso la
                                //benzina non basti
            {
                System.out.println("Che fortuna! Hai trovato una stazione del gas e sei riuscito a rifornirti per concludere il tuo viaggio!");
            }
        }

        return;
    }

    public String toString() //metodo per stampare tutti i valori assegnati all'auto.
    {
        String s = "La tua auto e' della casa automobilistica " + getCasaAutomobilistica() + ". Il suo modello e': " + getModello() + ", di colore " + getColore() + " con un serbatoio di " + getLitriCarburante() + " litri, che consuma " + getConsumi() + " litri ogni 30 kilometri.";
        return s;
    }
}
//(Serbatoio : consumi) * distanza consumi