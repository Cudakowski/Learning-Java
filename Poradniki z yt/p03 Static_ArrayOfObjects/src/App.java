public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("baka",66,4.0);
        Student student2 = new Student();

        student1.name="bwah";
        System.out.println(student1.gpa);
        System.out.println(student2.gpa);

        Student[] studentys = {student1,student2,new Student("mimi",45,10.0)};

        for(Student s : studentys)
        {
            System.out.println(s.name);
        }

        System.out.println(Student.count);
        Student.cok();
    }
}
