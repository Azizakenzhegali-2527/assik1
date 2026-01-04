package aitu;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.getId() + " " +
                s1.getFullName() + " " +
                s1.getEmail() + " " +
                s1.getGpa());

        Student s2 = new Student("Alice", "Brown");
        s2.addGrade(4.0);
        s2.addGrade(3.7);
        s2.addGrade(3.8);

        System.out.println(s2.getId() + " " +
                s2.getFullName() + " " +
                s2.getEmail() + " " +
                s2.getGpa());

        System.out.println(s2.isHonors());

        Student[] students = new Student[3];
        students[0] = new Student("John", "Smith");
        students[1] = new Student("Emma", "Stone");
        students[2] = new Student("Liam", "Wilson");

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < 5; j++) {
                students[i].addGrade(2.0 + Math.random() * 2.0);
            }
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                    students[i].getId() + " " +
                            students[i].getFirstname() + " " +
                            students[i].getLastname() + " " +
                            students[i].getEmail() + " " +
                            students[i].getGpa()
            );
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i].isHonors()) {
                System.out.println(students[i].getEmail());
            }
        }
    }
}
