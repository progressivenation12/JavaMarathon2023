package day6;

import java.util.Random;

public class Teacher {
    private final String FIO;
    private final String subject;

    public Teacher(String name, String subject) {
        this.FIO = name;
        this.subject = subject;
    }

    public String getFIO() {
        return FIO;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;
        String evaluation = switch (randomValue) {
            case 2 -> "неудовлетворительно";
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            case 5 -> "отлично";
            default -> "";
        };

        System.out.println("Преподаватель: " + this.FIO
                + " оценил студента с именем: " + student.getFIO()
                + " по предмету: " + this.subject
                + " на оценку: " + evaluation + ".");
    }
}