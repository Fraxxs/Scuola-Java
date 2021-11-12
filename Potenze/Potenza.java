package Potenze;

public class Potenza
{
    private int pot;
    public Potenza(int pot)
    {
        setPot(pot);
    }    

    private void setPot(int pot)
    {
        this.pot = pot;
    }

    public int getPot()
    {
        return pot;
    }

    public void pow()
    {
        System.out.println("Risultato della potenza = " + (pot*pot) + ".");
    }

    public void cambiobase(int pot)
    {
        this.pot = pot;
    }
}
