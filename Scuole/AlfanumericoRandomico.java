package Scuole;

import java.util.Random;

public class AlfanumericoRandomico
{
    private final String lettere = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final char [] alfanumerico = (lettere + lettere.toLowerCase() + "0123456789").toCharArray();

    public String alfanumericoRandomico(int lunghezza)
    {
        StringBuilder risultato = new StringBuilder();

        for (int i = 0; i < lunghezza; i++)
        {
            risultato.append(alfanumerico[new Random().nextInt(alfanumerico.length)]);
        }

        return risultato.toString();
    }
}
