//Dato un impiegato con i seguenti attributi: nome, cognome, età, e-mail, telefono, salario e
//tipo(impiegato, dirigente, manager), creare la classe java che lo rappresenti
//con tutti i metodi get/set, costruttori (almeno due) e il metodo tostring.
//Implementare inoltre l'attributo che calcoli l'aumento di salario data una percentuale in ingresso
//un metodo che determini il cambio di tipo (impiegato, dirigente, manager) in base all'età in ingresso
//19-45, 46-60, 61-67(il cambio può solo essere in maniera progressiva. Implementare nel main.

package Impiegato;

public class Impiegati
{
    private String nome;
    private String cognome;
    private int eta;
    private String email;
    private String numero;
    private double salario;
    private String tipo;
    //costruttore per creare un impiegato.
    Impiegati (String nome, String cognome, int eta, String email, String numero, double salario, String tipo)
    {
        setNome(nome);
        setCognome(cognome);
        setEta(eta);
        setEmail(email);
        setNumero(numero);
        setSalario(salario);
        setTipo(tipo);
    }
    //costruttore per copiare un impiegato.
    Impiegati (Impiegati copia)
    {
        nome = copia.getNome();
        cognome = copia.getCognome();
        eta = copia.getEta();
        email = copia.getEmail();
        numero = copia.getNumero();
        salario = copia.getSalario();
        tipo = copia.getTipo();
    }
    //setter/getter.
    private void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    private void setNome(String nome)
    {
        this.nome = nome;
    }

    private void setCognome(String cognome)
    {
        this.cognome = cognome;
    }

    private void setEta(int eta)
    {
        this.eta = eta;
    }

    private void setEmail(String email)
    {
        this.email = email;
    }

    private void setNumero(String numero)
    {
        this.numero = numero;
    }

    private void setSalario(double salario)
    {
        this.salario = salario;
    }

    public String getTipo()
    {
        return tipo;
    }

    public String getNome()
    {
        return nome;
    }

    public String getCognome()
    {
        return cognome;
    }

    public int getEta()
    {
        return eta;
    }

    public String getEmail()
    {
        return email;
    }

    public String getNumero()
    {
        return numero;
    }

    public double getSalario()
    {
        return salario;
    }
    //metodo che permette di aumentare il salario data una percentuale inserita dall'utente.
    public double aumentoSalario(double percentuale)
    {
        salario += ((percentuale / 100) * salario); //calcolo della percentuale sommata al salario iniziale.
        return getSalario();
    }
    //metodo che controlla l'età dell'impiegato e in base ad essa sceglie il suo tipo.
    public String sceltaTipo()
    {
        if (getEta() > 17 && getEta() <= 45) //dai 18 ai 45 anni sarà un semplice impiegato.
        {
            setTipo("Impiegato");
        }
        else if (getEta() > 45 && getEta() <= 60) //dai 46 ai 80 sarà un dirigente.
        {
            setTipo("Dirigente");
        }
        else if (getEta() > 60 && getEta() <= 67) //dai 61 ai 67 sarà un manager.
        {
            setTipo("Manager");
        }

        return getTipo();
    }

    public String toString() //metodo che stampa le informazioni dell'impiegato.
    {
        String s = "Nome: " + getNome() + ", cognome: " + getCognome() + ", eta': " + getEta() + ", email: " + getEmail() + ", numero: " + getNumero() + ", salario: " + getSalario() + ", tipo: " + getTipo() + ".";
        return s;
    }
}