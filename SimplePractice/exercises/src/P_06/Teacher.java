package P_06;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void evaluate(Student student){
        int mark = new Random().nextInt(2,6);
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %d", this.name, student.getName(), this.subject, mark);
    }
}
