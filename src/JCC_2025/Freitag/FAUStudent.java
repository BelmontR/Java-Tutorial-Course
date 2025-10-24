package JCC_2025.Freitag;

public class FAUStudent {

    // Attribute
    public String name;
    public int age;
    public char geschlecht;
    public String studiengang;
    public boolean fsiMitglied;
    public int mtrNr;
    public int semester;

    public int[] noten; // Array
    public String[] module;


    // Methoden

    public FAUStudent(String name, int age, char geschlecht, String studiengang){
        this.name = name;
        this.age = age;
        this.geschlecht = geschlecht;
        this.studiengang = studiengang;

        mtrNr = 0;
        semester = 1;
        noten = new int[3];
        module = new String[3];
    }

    private void BerechneNotendurschnitt(int[] noten){
        double notenAvg = 0;
        for(int element : noten){
            notenAvg += element;
        }
        System.out.println("Notendurchschnitt: " + (double)notenAvg / noten.length);
    }

    public void BerechneEigenenNotendurchschnitt(){
        BerechneNotendurschnitt(noten);
    }

    public void Informationsaussgabe(){
        System.out.println("Name: " + name);
        System.out.println("Alter: " + age);
        System.out.println("Geschlecht: " + geschlecht);
        System.out.println("Studiengang: " + studiengang);
        System.out.println("Matrikelnummer: " + mtrNr);
        System.out.println("Semester: " + semester);
    }

    public void NeuesSemester(){
        semester ++;
        if(semester > 6){
            System.out.println("Langsam wird's eng, ne?");
        }
    }

}
