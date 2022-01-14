package Angolo;

public class Angolo

{

  private int gradi;
  private int primi;
  private int secondi;
  private int giri;

  Angolo (int gradi, int primi, int secondi)
  {
    setGradi(gradi);
    setPrimi(primi);
    setSecondi(secondi);
    setGiri(0);
  }

  Angolo (Angolo a)
  {
    gradi = a.getGradi();
    primi = a.getPrimi();
    secondi = a.getSecondi();
  }

  private void setGradi(int gradi)
  {
    this.gradi = gradi;
  }

  public int getGradi()
  {
    return gradi;
  }

  private void setPrimi(int primi)
  {
    this.primi = primi;
  }

  public int getPrimi()
  {
    return primi;
  }

  private void setSecondi(int secondi)
  {
    this.secondi = secondi;
  }

  public int getSecondi()
  {
    return secondi;
  }

  private void setGiri(int giri)
  {
    this.giri = giri;
  }

  public int getGiri()
  {
    return giri;
  }

  public void VisualizzaAngolo()
  {
	  Controllo();
	  
	  System.out.println("\n\tGiri: " + giri + ".\n\tGradi: " + getGradi() + ".\n\tPrimi: " + getPrimi() + ".\n\tSecondi: " + getSecondi() + ".\n\n");
  }

  public void Controllo()
  {
    do
    {
      if (gradi >= 360)
      {
        giri++;
        gradi -= 360;
      }

      if (primi >= 60)
      {
        gradi++;
        primi -= 60;
      }

      if (secondi >= 60)
      {
        primi++;
        secondi -= 60;
      }
    }while (gradi >= 360 || primi >= 60 || secondi >= 60);


  }

  public void  AggiungiGradi(int n)
  {
    gradi += n;

    System.out.println("\nHai aggihnto " + n + " gradi.");
    
    Controllo();
  }

  public void AggiungiPrimi(int n)
  {
    primi += n;

    System.out.println("\nHai aggiunto " + n + " primi.");
    
    Controllo();
  }

  public void AggiungiSecondi(int n)
  {
    secondi += n;

    System.out.println("\nHai aggiunto " + n + " secondi.");
    
    Controllo();
  }
  
  public void AngoloSecondi()
  {
	  System.out.println("L'angolo espresso in secondi e' pari a: " + ((gradi * 3600) + ((giri * 360) * 3600) + (primi * 60) + secondi) + ".\n");
	  
	  Controllo();
  }
  
  public void CreaAngoloSecondi(int n)
  {
	  setGradi(0);
	  setGiri(0);
	  setPrimi(0);
	  setSecondi(n);
	  do
	  {
		  if (n >= 3600)
		  {
			  setGradi(n / 3600);
			  secondi = n % 3600;
			  n = n % 3600;
		  }
		  
		  else if (n >= 60)
		  {
			  setPrimi(n / 60);
			  secondi = n % 60;
			  n = n % 60;
		  }
	  }while(secondi >= 60);
	  
	  System.out.println("\nL'angolo e' stato impostato sulla base di " + n + " secondi.\n");
	  
	  Controllo();
  }
  
  public void DifferenzaAngoli(Angolo a)
  {
	  System.out.println("La differenza dei due angoli in secondi e': " + Math.abs(((gradi * 3600) + ((giri * 360) * 3600) + (primi * 60) + secondi) - ((a.getGradi() * 3600) + ((a.getGiri() * 360) * 3600) + (a.getPrimi() * 60) + a.getSecondi())) + ".\n");
	  
	  Controllo();
  }
}
