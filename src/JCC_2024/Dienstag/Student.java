package JCC_2024.Dienstag;

public class Student {
    public int alter;
    private String name;

    private char geschlecht;
    private String studiengang;
    private boolean fsiMitglied;
    private double ECTS;

    public String[] module;
    public int[] noten;

    public int mtrNr;

    public Student(int alter, String name, char geschlecht, String studiengang, int mtrNr){
        this.alter = alter;
        this.name = name;
        this.geschlecht = geschlecht;
        this.studiengang = studiengang;
        this.mtrNr = mtrNr;

        ECTS = 0;
        module = new String[2];
        noten = new int[2];

        fsiMitglied = false;

    }

    public float berechneNotendurschnitt(){
        float durchschnitt = 0;
        for(int element : noten){
            durchschnitt += element;
        }
        durchschnitt /= noten.length;

        System.out.println(durchschnitt);
        return durchschnitt;
    }

    public void druckeNotenuebersicht(){
        if(noten.length == module.length){
            for(int i = 0; i < noten.length; i++){
                String ausgabe = module[i] + ": " + noten[i];
                System.out.println(ausgabe);
            }
        }
        else{
            System.out.println("Die Längen der Arrays stimmen nicht überein, da muss ein Fehler sein");
        }
    }

    public String getName()
    {
        return name;
    }

}
