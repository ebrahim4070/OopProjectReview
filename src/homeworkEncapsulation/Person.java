package homeworkEncapsulation;

public class Person {
    private int age;
    private String name;
    public void setAge(int age) {
        this.age = age;

    }
    public int getAge() {
        return age;

    }
    public void setName(String name) {
        this.name=name;
    }
    public  String getName()
    {
        return name;
    }
    public void display()
    {
        System.out.println(" I am " + name+"and age "+age);
    }
}
