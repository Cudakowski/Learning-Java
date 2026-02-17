public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student("maka",5.0);

        student.showName();
        student.showGpa();

        Makapaka makapaka = new Makapaka("baka", 32);

        System.out.println(makapaka);
    }
}
