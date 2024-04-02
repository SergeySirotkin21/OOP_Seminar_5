import data.Student;
import data.Teacher;
import view.StudentView;
import view.TeacherView;

/**
 1. Создать package – data. 
2. Реализовать абстрактный класс User и его наследники Student и Teacher. 
3. Создать package – service. Работу продолжаем в нем
4. Создать класс DataService с методами в по управлению сущностями User (create, read) 
и агрегирующий всех пользователей заведенных в системе
5.Создать класс StudentView, содержащий в себе метод вывода в консоль
данных студента поданных на вход
Создать класс TeacherView с функцией создание и возвращения всех учителей
 */




public class Main {

    public static void main(String[] args) {
        
        Student student1 = new Student("Иван", 19, "информатика");
        Student student2 = new Student("Николай", 21, "математика");
  
        StudentView studentView = new StudentView();
        studentView.createStudent(student1);
        studentView.createStudent(student2);

        studentView.readStudent();


        Teacher teacher1 = new Teacher("Николай Иванович", 56, "математика");
        Teacher teacher2 = new Teacher("Семен Петрович", 38, "языки программирования");

        TeacherView teacherView = new TeacherView();
        teacherView.createTeacher(teacher1);
        teacherView.createTeacher(teacher2);

        teacherView.readTeacher();
        }
}