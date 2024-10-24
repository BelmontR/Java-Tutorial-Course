package JCC_2024.Donnerstag;

public class FAUStudent {

    //Attribute
    private String name;
    public int alter;
    public char geschlecht;
    public String studiengang;
    public float groesse;

    public boolean fsiMitglied;
    public double ECTS;


    public int[] noten;
    public String[] module;

    //Methoden

    public FAUStudent(String name, int alter, char geschlecht, String studiengang, float groesse)
    {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
        this.studiengang = studiengang;
        this.groesse = groesse;

        fsiMitglied = false;
        ECTS = 0;
        noten = new int[3];
        module = new String[3];
    }


    public float berechneDurchschnitt(){
        float durchschnitt = 0;

        for(int element : noten){
            //System.out.println(element);
            durchschnitt += element;
        }
        durchschnitt /= noten.length;
        //System.out.println("Durchschnitt: " + durchschnitt);

        return durchschnitt;
    }

    public String getName(){
        return name;
    }

    public void setNotenundModule(int[] noten, String[] module){
        this.noten = noten;
        this.module = module;
    }


}
