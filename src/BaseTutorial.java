public class BaseTutorial {

    //--- Zahlenwerte ---
    // - Datentyp Integer (int) -
    public static int zahl = 1;     //Speichert ganze Zahlen

    // - Datentyp double -
    public static double kommaZahl = 1.5; //Speichert Dezimalzahlen

    // - Datentyp float -
    public static float kommaZahl2 = 1.5f; //Speichert Dezimalenzahlen, kleiner und ungenauer als double. Am Ende steht immer ein "f"

    //--- Zeichen ---
    // - Datentyp String -
    public static String text = "Abcdefghijklmnop"; //Speichert Zeichenketten beliebeiger Länge. Ist ein Objekt

    // - Datentyp char -
    public static char zeichen = 'a'; //Kann nur ein Zeichen speichern. Zeichen können auch als Ganzzahl dargestellt werden

    //--- Wahrheitswerte ---
    // - Datentyp boolean -
    public static boolean wahrheitsbelegung = true; //Kann true oder false sein

    public static void main(String[] args)
    {
        System.out.println(text);

        System.out.println(zeichen);

        System.out.println((int)zeichen);

        int rechnung = 3 + zahl;
        System.out.println(rechnung);

        rechnung = rechnung * 3;
        System.out.println(rechnung);

        rechnung += 7; // -> rechnung = rechnung + 7;
        rechnung -= 7; // -> rechnung = rechnung - 7;
        rechnung *= 3; // -> rechnung = rechnung * 3;
        rechnung /= 3; // -> rechnung = rechung / 5;

        rechnung ++; // -> rechnung = rechnung +1;
        rechnung --; // -> rechnung = rechnung -1;

        System.out.println(rechnung);

        //rechnung = zahl + kommaZahl; // Geht nicht, weil die Datentypen verschieden sind

        wahrheitsbelegung = true;
        wahrheitsbelegung = false;

        wahrheitsbelegung = 5 > 3;
        wahrheitsbelegung = (zahl +1) < zahl;

        System.out.println(wahrheitsbelegung);





    }
}
