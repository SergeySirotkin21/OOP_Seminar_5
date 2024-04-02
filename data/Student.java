package data;

public class Student extends  User{
    private String direction;

    public Student() {
    }

    public Student(String name, int age, String direction) {
        super(name, age);
        this.direction = direction;
    }

    public String getDirection() {
        return direction;  // в студентов
    }


    @Override
    public String toString() {  
    return "Student{" + "direction='" + direction + '\'' +
    ", name='" + name + '\'' + ", age=" + age +'}';
    }
    
}
