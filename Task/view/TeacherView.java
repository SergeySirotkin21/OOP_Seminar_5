package view;

import controller.Controller;
import data.Teacher;

public class TeacherView {
    private Controller controller = new Controller();

    public void createTeacher(Teacher teacher){
        controller.createUser(teacher, teacher.getDiscipline());
        System.out.println("Учитель создан успешно");       
    }

    public void readTeacher(){
        System.out.println("Список учителей");
        controller.read("teacher");
    }
}
