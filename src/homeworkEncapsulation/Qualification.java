package homeworkEncapsulation;

public class Qualification extends Teacher {
    String qualification;

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    @Override
    public void display() {
        System.out.println("I am " + getName() + " and age " + getAge());
        System.out.println("Course: " + course);
        System.out.println("Qualification: " + qualification);
    }
}
