package Punto;

import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        double x1 = 0;
        double x2 = 0;
        double x3 = 0;
        double y1 = 0;
        double y2 = 0;
        double y3 = 0;

        System.out.println("Inserisci le coordinate del primo punto.");
        System.out.print("\t X1 = ");
        x1 = input.nextInt();
        System.out.print("\t Y1 = ");
        y1 = input.nextInt();

        System.out.println("Inserisci le coordinate del secondo punto.");
        System.out.print("\t X2 = ");
        x2 = input.nextInt();
        System.out.print("\t Y2 = ");
        y2 = input.nextInt();

        System.out.println("Inserisci le coordinate del terzo punto.");
        System.out.print("\t X3 = ");
        x3 = input.nextInt();
        System.out.print("\t Y3 = ");
        y3 = input.nextInt();

        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);
        Punto p3 = new Punto(x3, y3);

        System.out.println("P1 = " + p1.toString());
        System.out.println("P2 = " + p2.toString());
        System.out.println("P3 = " + p3.toString());

        System.out.println("\nLa distanza tra p1 e p2 è: " + p1.distanza(p2));
        System.out.println("La distanza tra p1 e p3 è: " + p1.distanza(p3));
        System.out.println("La distanza tra p2 e p3 è: " + p2.distanza(p3));

        if (p1.equals(p2))
        {
            System.out.println("\nP1 e P2 coincidono.");
        }
        else
        {
            System.out.println("\nP1 e P2 non coincidono");
        }
        
        if (p1.equals(p3))
        {
            System.out.println("P1 e P3 coincidono.");
        }
        else
        {
            System.out.println("P1 e P3 non coincidono");
        }

        if (p2.equals(p3))
        {
            System.out.println("P2 e P3 coincidono.");
        }
        else
        {
            System.out.println("P2 e P3 non coincidono");
        }

        input.close();
    }
}