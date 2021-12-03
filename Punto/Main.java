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
        double x4 = 0;
        double y1 = 0;
        double y2 = 0;
        double y3 = 0;
        double y4 = 0;

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

        System.out.println("Inserisci le coordinate del quarto punto.");
        System.out.print("\t X4 = ");
        x4 = input.nextInt();
        System.out.print("\t Y4 = ");
        y4 = input.nextInt();

        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);
        Punto p3 = new Punto(x3, y3);
        Punto p4 = new Punto(x4, y4);
        Triangolo t1 = new Triangolo(p1, p2, p3);
        Triangolo t2 = new Triangolo(p1, p2, p4);

        System.out.println("\nP1 = " + p1.toString());
        System.out.println("P2 = " + p2.toString());
        System.out.println("P3 = " + p3.toString());
        System.out.println("P4 = " + p4.toString());
        System.out.println("\nTriangolo 1 = " +  t1.toString() + "(P1;P2;P3)");
        System.out.println("Triangolo 2 = " +  t2.toString() + "(P1;P2;P4)");
        

        System.out.println("\nLa distanza tra p1 e p2 è " + p1.distanza(p2));
        System.out.println("La distanza tra p1 e p3 è " + p1.distanza(p3));
        System.out.println("La distanza tra p2 e p3 è " + p2.distanza(p3));
        System.out.println("La distanza tra p1 e p4 è " + p1.distanza(p4));
        System.out.println("La distanza tra p2 e p4 è " + p2.distanza(p4));
        System.out.println("La distanza tra p3 e p4 è " + p3.distanza(p4));

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

        
        if (p1.equals(p4))
        {
            System.out.println("P1 e P4 coincidono.");
        }
        else
        {
            System.out.println("P1 e P4 non coincidono");
        }

        if (p2.equals(p4))
        {
            System.out.println("P2 e P4 coincidono.");
        }
        else
        {
            System.out.println("P2 e P4 non coincidono");
        }

        if (p3.equals(p4))
        {
            System.out.println("P3 e P4 coincidono.");
        }
        else
        {
            System.out.println("P3 e P4 non coincidono");
        }

        System.out.println("\nL'area del triangolo 1 e' uguale a " + t1.area() + ".");
        System.out.println("L'area del triangolo 2 e' uguale a " + t2.area() + ".");
        
        System.out.println("\nIl perimetro del triangolo 1 e' uguale a " + t1.perimetro());
        System.out.println("Il perimetro del triangolo 2 e' uguale a " + t2.perimetro());
    
        if (t1.equivale(t2))
        {
          System.out.println("\nTriangolo 1 e triangolo 2 equivalgono.");
        }
        else
        {
          System.out.println("\nTriangolo 1 e triangolo 2 non equivalgono.");
        }

        input.close();
    }
}