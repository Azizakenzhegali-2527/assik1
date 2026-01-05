package aitu;

public class Group {
    private String title;
    private Student[] students;
    private int capacity;
    private int numberOfStudents;

    public Group() {
        this.title = "AITU Group";
        this.capacity = 4;
        this.students = new Student[capacity];
        this.numberOfStudents = 0;
    }

    public Group(String title) {
        this.title = title;
        this.capacity = 4;
        this.students = new Student[capacity];
        this.numberOfStudents = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addStudent(Student student) {
        if (numberOfStudents == capacity) {
            capacity *= 2;
            Student[] newStudents = new Student[capacity];
            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }
            students = newStudents;
        }
        students[numberOfStudents++] = student;
    }

    public double getAverageGpa() {
        if (numberOfStudents == 0) return 0;

        double sum = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            sum += students[i].getGpa();
        }
        return sum / numberOfStudents;
    }

    public void printHallOfFame() {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].isHonors()) {
                System.out.println(students[i]);
            }
        }
    }

    public boolean removeStudent(int id) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                return true;
            }
        }
        return false;
    }


}


