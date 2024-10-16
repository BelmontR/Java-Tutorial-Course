package JCC_2023.ObjectTutorial;

public class ModulListElement {

    public Modul modul;
    private ModulListElement nachfolger;

    public void bestehen(Student student)
    {
        if(student.modulListHead == null)
        {
            student.modulListHead = this;
        }
        else {
            student.modulListHead.addModule(this);
            student.ects += modul.ects;
        }
    }

    public void addModule(ModulListElement modulListElement)
    {
        if(nachfolger == null)
        {
            nachfolger = modulListElement;
        }
        else {
            nachfolger.addModule(modulListElement);
        }
    }
}

