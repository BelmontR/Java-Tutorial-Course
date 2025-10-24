package JCC_2025.Freitag;

public class Student {


    public static void main(String[] args){

        int alter = 23;
        String name = "Rene";
        String studiengang = "Informatik M.Sc.";
        int mtrNr = 1;
        int semester = 4;
        boolean fsiMitglied = true;
        char geschlecht = 'm';

        alter = alter +1;
        alter += 1;
        alter ++;

        alter *=2;

        alter -=1;
        alter --;

        alter /=2;

        alter -= semester;

        boolean b = false;
        b = 5 > 3; // b = true, weil 5 größer als 3 ist
        boolean regelstudienzeit = semester <= 4;
        //System.out.println(regelstudienzeit);

        // Das sind Arrays
        int [] noten = new int[3];
        int[] noten2 = {1,2,3};
        String[] module = new String[3];

        //System.out.println(noten2[1]);

        module[0] = "AuD";
        module[1] = "UuU";
        module[2] = "BISE";

        System.out.println(module[0]);

        noten[0] = 1;
        noten[1] = 3;
        noten[2] = 2;

        double avgNote = (double)(noten[0] + noten[1] + noten[2]) / noten.length;
        System.out.println(avgNote);

        // -------------------


        if(name.equals("Rene")){
            System.out.println("Hi Rene, wie geht's");
        }
        else if((name == "Ener") || (name == "RENE") || (name == "Reen")){
            System.out.println("Hi Rene, kannst deinen Namen wohl nicht schreiben, haha");
        }
        else{
            System.out.println("Wer bist du? Zugang verweigert!");
        }

        fsiMitglied = true;
        name = "Rene";

        if(fsiMitglied == true){  // entspricht fsiMitglied == true
            if(name.equals("Rene")){
                System.out.println("Hey Rene, wie läuft der Java Kurs");
            }
            else{
                System.out.println("Hallo du cooler Mensch!");
            }
        }

        alter = 23;
        name = "Rene";
        studiengang = " ";

        if(alter <= 0 || studiengang == " " || name == " " ){
            System.out.println("Da stimmt was nicht, überprüfe doch nochmal dein Daten");
        }

        // -----------------------
        int count = 0;
        int notenAvg = 0;
        while(count < noten.length){
            notenAvg += noten[count];
            count ++;
        }
        System.out.println("Notendurchschnitt: " + (double)notenAvg / noten.length);

        count = 0;
        while(count < noten.length){
            if(noten.length == module.length){
                System.out.println(module[count] + ": " + noten[count]);
                count ++;
            }
            else{
                System.out.println(noten[count]);
                count ++;
            }
        }

        notenAvg = 0;
        for(int i = 0; i < noten.length; i++){
            notenAvg += noten[i];
        }
        System.out.println("Notendurchschnitt: " + (double)notenAvg / noten.length);


        notenAvg = 0;
        for(int element : noten){
            notenAvg += element;
        }
        System.out.println("Notendurchschnitt: " + (double)notenAvg / noten.length);

        for(int i = 0; i < noten.length; i++){
            System.out.println(module[i] + ": " + noten[i]);
        }

        System.out.println(module[0] + ": " + noten[0]);
        System.out.println(module[1] + ": " + noten[1]);
        System.out.println(module[2] + ": " + noten[2]);

        //----------


        int[] noten3 = {1,4,4,2,1,3,1,1,1,222};
        int[] noten4 = {4,4,4,4,2,2,1,1,3};
        int[] noten5 = {1,1,1,1,2,2};

        BerechneNotendurschnitt(noten);
        BerechneNotendurschnitt(noten3);
        BerechneNotendurschnitt(noten4);
        BerechneNotendurschnitt(noten5);
    }

    private static void BerechneNotendurschnitt(int[] noten){
        double notenAvg = 0;
        for(int element : noten){
            notenAvg += element;
        }
        System.out.println("Notendurchschnitt: " + (double)notenAvg / noten.length);
    }


}
