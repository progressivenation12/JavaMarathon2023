package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Tom", "505");
        Teacher teacher = new Teacher("Katy", "Computer Science");

        System.out.println(student.getName() + ", " + student.getGroupName());
        System.out.println(teacher.getName() + ", " + teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}