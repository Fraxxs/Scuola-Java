import java.util.Scanner;

public class contrario
{

  public static void main(String[]args)
  {
      Scanner input = new Scanner (System.in);
      StringBuilder risultato = new StringBuilder();
      
      String frase;
      
      System.out.print("Inserisci una frase: ");
      frase = input.nextLine();
      
      char[] contrario = frase.toCharArray();
      
      for (int i = (contrario.length - 1); i >= 0; i--)
      {
        risultato.append(contrario[i]);
      }
      
      System.out.println(risultato.toString());

      input.close();
  }
}