import javax.swing.*;

public class Aufgabe2
{
    public static void main(String[] args) {

        while(true) {  //While-Schleife (true) weil es solange abgeprüft werden soll bis true ausgegebn wird(bis bei catch was ausgegebn wird)
            try { //try-block soll einen Wert ausgeben - der gesuchte Wert is in diesem Beispiel eine Zahl
                // wenn dieser Wert gefunden wird, wird es wie eine heiße Kartoffel an catch weiter gereicht

                String wert1 = JOptionPane.showInputDialog("Bitte geben Sie einen Wert ein"); //der Nutzer wird nach einem Wert gefragt

                if(wert1.matches("[0-9]+")){ //nun nehme ich eine if-else abfrage her, die schaut ob i Zahl (int) oder einen anderen Wert habe
                    throw new Exception(); // nun macht mir das System eine eigene Exception
                }else{
                    System.out.println(wert1 + " ungültige Eingabe!"); //wird ausgegeben wenn das System keine Zahl ist, bzw. wenn der Wert ungültig ist
                }
            }catch (Exception e){ //Catch nun fängt catch die "heiße Kartoffel" und soll die Zahl (int) ausgeben
                System.out.println("Ihre Eingabe ist richtig, Programm wird beendet!");
                break; // damit nicht weiter abgefragt wird
            }
        }
    }
}
