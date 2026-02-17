public class Student {
    
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    static int count;

    Student(String name,int age,double gpa)
    {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
        count++;
    }

    Student()
    {
        this.name = "kek";
        this.age = 18;
        this.gpa = 2.1;
        this.isEnrolled = true;
        count++;
    }


    static void cok()
    {
        System.out.println("ty maju: "+count);//nie trzeba this
    }
}
