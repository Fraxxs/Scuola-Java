package Punto;

public class Triangolo
{
  private Punto a;
  private Punto b;
  private Punto c;

  public Triangolo(Punto a, Punto b, Punto c)
  {
    this.a = new Punto(a);
    this.b = new Punto(b);
    this.c = new Punto(c);
  }

  public Triangolo (Triangolo t)
  {
    setA(t.getA());
    setB(t.getB());
    setC(t.getC());
  }

  public void setA(Punto a)
  {
    this.a = a;
  }

  public void setB(Punto b)
  {
    this.b = b;
  }

  public void setC(Punto c)
  {
    this.c = c;
  }

  public Punto getA()
  {
    return a;
  }

  public Punto getB()
  {
    return b;
  }

  public Punto getC()
  {
    return c;
  }

  public double area()
  {
    double p = perimetro()/2;
    return Math.sqrt((p - a.distanza(b)) * (p - a.distanza(c)) * (p - b.distanza(c)));
  }

  public double perimetro()
  {
    return a.distanza(b) + a.distanza(c) + b.distanza(c);
  }

  public String toString()
  {
    String s = "(" + a + ";" + b + ";" + c + ")";
    return s;
  }
 
  public boolean equals(Triangolo t)
  {
    return (a.equals(t.getA()) && b.equals(t.getB()) && c.equals(t.getC()));
  }

  public boolean equivale(Triangolo t)
  {
    return (Math.abs(this.area() - t.area()) <= 0);
  }
}