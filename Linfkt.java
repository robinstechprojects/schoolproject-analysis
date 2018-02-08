
/**
 * Beschreiben Sie hier die Klasse Linfkt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Linfkt

{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    
    public double steigung;
    public double psteigung;
    public double yAchsenAbschnitt;
    public double pyAchsenAbschnitt;
    public double yWert;
    public double xWert;
    public double nullStelle;
    /**
     * Konstruktor für Objekte der Klasse KarstenStahl
     */
    public Linfkt(double steigung, double yAchsenAbschnitt)
    {
      psteigung = steigung;
      pyAchsenAbschnitt = yAchsenAbschnitt;
    }
/**
 * 
 * Diese Methode berechnet y-Werte 
 * 
 */
    
    public final void yWerteBerechnen(double xWert)
    {
       
    yWert = psteigung * xWert + pyAchsenAbschnitt; //Werte berechnen   
    
    System.out.println(yWert);//Werte ausgeben 
        
    }
        
    public final void nullStellen()
{
    if(psteigung == 0) 
    {
    System.out.println("penis");     
    }
    else
    {
    yWert= 0;
    nullStelle = (yWert-pyAchsenAbschnitt) / psteigung;   
    System.out.println(nullStelle);
    }
}
   
}
