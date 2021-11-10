package Persone;

public class Persona
{
    private String nome;
    private String sesso;
    private int età;
    private String professione;

    private void setNome(String nome)
    {
        this.nome = nome;
    }     

    private void setSesso(String sesso)
    {
        this.sesso = sesso;
    }

    private void setEtà(int età)
    {
        this.età = età;
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

    public int getEtà()
    {
        return età;
    }

    public String getProfessione()
    {
        return professione;
    }

    Persona(String nome, String sesso, int età, String professione)
    {
        setNome(nome);
        setSesso(sesso);
        setEtà(età);
        setProfessione(professione);
    }
}