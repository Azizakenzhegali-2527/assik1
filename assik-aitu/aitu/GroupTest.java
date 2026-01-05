package aitu;

public class GroupTest {

    public static void main(String[] args) {

        Group group = new Group("SE-2310");

        Student s1 = new Student("Aziza", "Brown");
        Student s2 = new Student("Adi", "Smith");
        Student s3 = new Student("Adiyat", "Stone");
        Student s4 = new Student("Erke", "Wilson");
        Student s5 = new Student("Anel", "Taylor");

        for (int i = 0; i < 5; i++) {
            s1.addGrade(4.0);
            s2.addGrade(3.2);
            s3.addGrade(3.8);
            s4.addGrade(2.9);
            s5.addGrade(3.6);
        }

        group.addStudent(s1);
        group.addStudent(s2);
        group.addStudent(s3);
        group.addStudent(s4);
        group.addStudent(s5);

        System.out.println(group);

        group.printHallOfFame();

        group.removeStudent(s2.getId());

        System.out.println(group);
    }
}
