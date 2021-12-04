package Scuole;

public class Scuola
{
    private String grado;
    private String codice;
    private String denominazione;
    private String citta;
    private int nStudenti;
    private int nClassi;
    private int contributi;
    private int sediAggiuntive = 0;
    private int laboratori;
    //costruttore
    Scuola(String grado, String codice, String denominazione, String citta, int nStudenti, int nClassi, int sediAggiuntive, int laboratori)
    {
        setGrado(grado);
        setCitta(citta);
        setCodice(codice);
        setDenominazione(denominazione);
        setNClassi(nClassi);
        setNStudenti(nStudenti);
        setSediAggiuntive(sediAggiuntive);
        setLaboratori(laboratori);
    }
    //getter/setter
    private void setGrado(String grado)
    {
        this.grado = grado;
    }

    public void setContributi(int contributi)
    {
        this.contributi = contributi;
    }

    private void setCodice(String codice)
    {
        this.codice = codice;
    }

    private void setDenominazione(String denominazione)
    {
        this.denominazione = denominazione;
    }

    private void setCitta(String citta)
    {
        this.citta = citta;
    }

    private void setNStudenti(int nStudenti)
    {
        this.nStudenti = nStudenti;
    }

    private void setNClassi(int nClassi)
    {
        this.nClassi = nClassi;
    }

    private void setSediAggiuntive(int sediAggiuntive)
    {
        this.sediAggiuntive = sediAggiuntive;
    }

    private void setLaboratori(int laboratori)
    {
        this.laboratori = laboratori;
    }

    public String getGrado()
    {
        return grado;
    }

    public int getContributi()
    {
        return contributi;
    }

    public String getCodice()
    {
        return codice;
    }

    public String getDenominazione()
    {
        return denominazione;
    }

    public String getCitta()
    {
        return citta;
    }

    public int getNStudenti()
    {
        return nStudenti;
    }

    public int getNClassi()
    {
        return nClassi;
    }

    public int getSediAggiuntive()
    {
        return sediAggiuntive;
    }

    public int getLaboratori()
    {
        return laboratori;
    }
    //metodo che calcola il contributo annuale in base al grado scolastico
    public int contributoAnnuale()
    {
        if (grado == "Elementari")
        {
            contributi = (125 * getNStudenti() + (getSediAggiuntive() * 9000));
        }

        else if (grado == "Medie")
        {
            contributi = (150 * getNStudenti() + (1100 * getLaboratori()) + (9000 + getSediAggiuntive()));
        }

        else if (grado == "Liceo")
        {
            contributi = (150 * getNStudenti() + (1100 * getLaboratori()));
        }

        else if (grado == "Tecnico")
        {
            contributi = ((3500 * getNClassi()) + (6000 * getLaboratori()));
        }

        else if (grado == "Professionale")
        {
            contributi = ((2400 * getNClassi()) + (3000 * getLaboratori()));
        }

        return contributi;
    }
    //toString che stampa le informazioni di un oggetto
    public String toString()
    {
        String s = "\n\tGrado: " + getGrado() + ".\n\tCodice Alfanumerico: " + getCodice() + ".\n\tNome: " + getDenominazione() + ".\n\tCittà: " + getCitta() + ".\n\tNumero studenti: " + getNStudenti() + ".\n\tNumero Classi: " + getNClassi() + ".\n\tNumero sedi aggiuntive: " + getSediAggiuntive() + ".\n\tLaboratori: " + getLaboratori() + ".\n\tContributi annuali: " + getContributi() + " euro.\n";
        return s;
    }
}