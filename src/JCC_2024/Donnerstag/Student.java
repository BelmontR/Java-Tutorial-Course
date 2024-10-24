package JCC_2024.Donnerstag;

public class Student {

    public static void main(String[] args)
    {
        String name = "Rene";
        int alter = 22;
        char geschlecht = 'm';
        String studiengang = "Informatik M.Sc.";
        boolean fsiMitglied = true;
        double ECTS = 80.25;
        float groesse = 1.93f;

        int[] noten = new int[3];

        //String[] module = new String[3];
        String[] module = {"AuD", "UuU", "BISE"};

        System.out.println(alter);

        alter = alter +1;
        alter += 1;
        alter ++;

        /*
        alter = alter -1;
        alter -= 1;
        alter --;

        alter = alter *2;
        alter *= 2;

        alter = alter /2;
        alter /= 2;

         */

        System.out.println(alter);

        double rechnung = alter + ECTS;

        fsiMitglied = 5 <= 5;

        geschlecht +=3;

        System.out.println(geschlecht);

        studiengang +=3;

        System.out.println(studiengang);

        noten[0] = 1;
        noten[1] = 3;
        noten[2] = 2;

        System.out.println(module[0] + ": " + noten[0]);
        System.out.println(module[1] + ": " + noten[1]);
        System.out.println(module[2] + ": " + noten[2]);

        float durchschnitt = 0;

        durchschnitt += noten[0];
        durchschnitt += noten[1];
        durchschnitt += noten[2];

        durchschnitt /= noten.length;

        System.out.println(durchschnitt);

        //=== if-clauses =========================

        name = "Rene";
        fsiMitglied = true;

        fsiMitglied = !fsiMitglied; //fsiMitglied ist gleich NICHT fsiMitglied

        if(name == "Rene"){
            System.out.println("Hallo Rene, na, wie laeuft der Java Crashkurs?");
        }
        else if( (name == "Reen") || (name == "Erne") || (name == "Ener")){
            System.out.println("Ah, Rene, hallo. Namen schon wieder falsch geschrieben, was?");
        }
        else{
            System.out.println("Wer bist du und was hast du mit Rene gemacht?");
        }

        if(!fsiMitglied){
            System.out.println("Cool, du bist bei der FSI!");

            if(name == "Rene"){
                System.out.println("Ah, unser erster Vorstand, na, was läuft?");
            }
        }

        //=== Schleifen =====================
        //while Loop

        durchschnitt = 0;

        int counter = 0;
        while(counter < noten.length){
            durchschnitt += noten[counter];
            counter ++;
        }

        durchschnitt /= noten.length;
        //System.out.println("Durchschnitt: " + durchschnitt);

        //for Loop

        durchschnitt = 0;

        for(int i = 0; i < noten.length; i++){
            durchschnitt += noten[i];
        }

        durchschnitt /= noten.length;
        //System.out.println("Durchschnitt: " + durchschnitt);

        //foreach Loop

        durchschnitt = 0;

        for(int element : noten){
            //System.out.println(element);
            durchschnitt += element;
        }

        durchschnitt /= noten.length;
        //System.out.println("Durchschnitt: " + durchschnitt);

        //=== Methoden =================
        durchschnitt = berechneDurchschnitt(noten);
        //durchschnitt = 2.0f;
        System.out.println("Durchschnitt: " + berechneDurchschnitt(noten));

        int[] noten2 = {1,1,1,1,1};
        int[] noten3 = {3,3,2,4,1,3,3,4,6,6,6,6,6};

        System.out.println("Durchschnitt 2: " + berechneDurchschnitt(noten2));
        System.out.println("Durchschnitt 3: " + berechneDurchschnitt(noten3));


    }

    public static float berechneDurchschnitt(int[] noten){
        float durchschnitt = 0;

        for(int element : noten){
            //System.out.println(element);
            durchschnitt += element;
        }
        durchschnitt /= noten.length;
        //System.out.println("Durchschnitt: " + durchschnitt);

        return durchschnitt;
    }


}
