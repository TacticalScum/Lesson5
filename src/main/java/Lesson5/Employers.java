package Lesson5;

public class Employers {
    String workersFIO;
    String workersPost;
    String workersEmail;
    String workersPhoneNumber;
    String workersSalary;
    int workersAge;

    public Employers (String workersFIO, String workersPost, String workersEmail, String workersPhoneNumber, String workersSalary, int workersAge) {
        this.workersFIO = workersFIO;
        this.workersPost = workersPost;
        this.workersEmail = workersEmail;
        this.workersPhoneNumber = workersPhoneNumber;
        this.workersSalary = workersSalary;
        this.workersAge = workersAge;
        System.out.printf("Рабочий: %s\nДолжность: %s \nПочта: %s\nТелефон: %s\nЗарплата: %s\nВозраст: %s\n",
                workersFIO, workersPost, workersEmail, workersPhoneNumber, workersSalary, workersAge);
        System.out.println(" ");
    }

    public int getWorkersAge() {
        return workersAge;
    }

    public String toString() {
        return String.format("Рабочий: %s\nДолжность: %s \nПочта: %s\nТелефон: %s\nЗарплата: %s\nВозраст: %s\n",
                workersFIO, workersPost, workersEmail, workersPhoneNumber, workersSalary, workersAge);
    }
}
