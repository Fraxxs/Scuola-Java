/*Crea un programma per la gestione di un contocorrente gestito dalla classe CC.
Il programma deve essere in grado di effettuare versamenti, prelievi,
di restituire il saldo e di effettuare la lista degli ultimi 5 movimenti .*/

package Banca;

public class CC
{
    private int saldo;
    private int[] movimenti = new int[5];

    public void versamento(int n)
    {
        saldo += n;
        
        for(int i = 0; i < 4; i++)
        {
            movimenti[i] = movimenti[i+1];
        }

        movimenti[4] = n;
    }

    public void prelievo (int n)
    {
        saldo -= n;

        for(int i = 0; i < 4; i++)
        {
            movimenti[i] = movimenti[i+1];
        }

        movimenti[4] = -n;
    }

    public int Saldo()
    {
        return saldo;   
    }

    public void lista()
    {
        for (int i = 0; i < 5; i++)
        {
            if (movimenti[i] != 0)
            {
                if (movimenti[i] > 0)
                System.out.printf("Versamento: +%d\n", movimenti[i]);
                
                else
                System.out.printf("Prelievo %d\n", movimenti[i]);
            }
        }
    }
}
