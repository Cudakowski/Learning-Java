public class Student extends Person{
    double gpa;

    Student(String name, double gpa)
    {
        super(name); //SUPER NO WAY
        this.gpa=gpa;
    }

    void showGpa()
    {
        System.out.println("masz pan: "+this.gpa);
    }
}
