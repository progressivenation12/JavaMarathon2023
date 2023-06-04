package day06;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванов Иван Иванович", "Информатика");
        Student student = new Student("Петров Петр Петрович");

        teacher.evaluate(student);
    }
}

