/**
Beschreiben Sie hier die Klasse Linfkt.

@author (Ihr Name)
@Version (eine Versionsnummer oder ein Datum)
*/
public class Linfkt
{
// Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen

public double steigung;
public double psteigung;
public double yAchsenAbschnitt;
public double pyAchsenAbschnitt;
public double xWert;
public double x;
public double yWert;
public double nullStelle;
public double schritt1;
public double schritt2;
/**
* Konstruktor für Objekte der Klasse KarstenStahl

* */
public Linfkt(double steigung, double yAchsenabschnitt)
{
psteigung = steigung;
pyAchsenAbschnitt = yAchsenabschnitt;
}
/**
*
Diese Methode berechnet y-Werte

*/
public final void yWerteBerechnen(double xWert)
{
   
yWert = psteigung * xWert + pyAchsenAbschnitt; //Werte berechnen   

System.out.println(yWert);//Werte ausgeben 
    
}


}


