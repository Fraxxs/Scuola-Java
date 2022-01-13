import java.util.Scanner;

public class ordineAlfabetico
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        String frase;

        System.out.print("Inserisci la frase: ");
        frase = input.nextLine();
        frase = frase.toLowerCase();
        frase = frase.replaceAll(" ", "");

        char[] contrario = frase.toCharArray();

        for (int i = 0; i < contrario.length - 1; i++)
        {
            for (int j = 0; j < contrario.length - 1; j++)
            {
                if (contrario[j] > contrario[j + 1])
                {
                    char temp = contrario[j];
                    contrario[j] = contrario[j + 1];
                    contrario [j + 1] = temp;
                }
            }
        }

        System.out.println(contrario);

        input.close();
    }
}