package homeworkEncapsulation;

public class Teacher extends Person {
    String course;

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Course: " + course);
    }
}
