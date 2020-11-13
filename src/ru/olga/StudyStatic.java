package ru.olga;

/**
 * Демонстрация разиличия static и не static
 */
public class StudyStatic {

    static int count;

    int x;

    StudyStatic() {
        count++;
    }


    public static void main(String[] args) {

        // x = 5; // Ошибка

        new StudyStatic();
        new StudyStatic();
        new StudyStatic();
        new StudyStatic();
        new StudyStatic();

        System.out.println(StudyStatic.count);
    }
}
