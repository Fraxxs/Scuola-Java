package Persone;

public class Persona
{
    private String nome;
    private String sesso;
    private int eta;
    private String professione;

    private void setNome(String nome)
    {
        this.nome = nome;
    }     

    private void setSesso(String sesso)
    {
        this.sesso = sesso;
    }

    private void setEta(int eta)
    {
        this.eta = eta;
    }

    private void setProfessione(String professione)
    {
        this.professione = professione;
    }

    public String getNome()
    {
        return nome;
    }

    public String getSesso()
    {
        return sesso;
    }

    public int getEta()
    {
        return eta;
    }

    public String getProfessione()
    {
        return professione;
    }

    Persona(String nome, String sesso, int eta, String professione)
    {
        setNome(nome);
        setSesso(sesso);
        setEta(eta);
        setProfessione(professione);
    }

    public String toString()
    {
        String s = "Sono una persona di nome: " + getNome() + ", sesso: " + getSesso() + ", eta: " + getEta() + " anni" + ", professione: " + getProfessione() + ".";
        return s;
    }
}