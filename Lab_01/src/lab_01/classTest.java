package lab_01;

class Student {
    String name;
    int age;
    double gpa;
    int semester;

    Student(String name, int age, double gpa, int semester) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.semester = semester;
    }

    void Print() {
        System.out.printf("Hello %s! your are %d.\nYour expect GPA is %f.\nYour current semester is %d", this.name, this.age, this.gpa, this.semester);
    }
}

public class classTest {
    public static void main(String[] args) {
        Student student = new Student("Song Vansak", 19, 4.0, 3);
        student.Print();
    }
}
