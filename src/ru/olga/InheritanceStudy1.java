package ru.olga;

class Shape {
    private int width;
    private int height;

    Shape(int h, int w) {
        this.height = h;
        this.width = w;
    }

    void showDim() {
        System.out.println("Размер - " + this.width + " " + this.height);
    }
}

class Triangle extends Shape {

    // переменные widht и height здесь есть, но к ним
    // обратиться нельзя, т.к. они private

     Triangle(int h, int w) {
         super(h,w);
     }
}

class Box {
    // если никаких конструкторов в классе нет, то для него
    // невидимым образом создает пустой конструктор Box()
    // Если какие-то конструкторы есть - ничего не создается.
}


// Inheritance - наследование
public class InheritanceStudy1 {

    public static void main(String[] args) {

        Box b = new Box();

        Shape s = new Shape(100,100);
        s.showDim();

        Triangle t = new Triangle(100,100);
        t.showDim();



        // s.width; ОШИБКА
        // s.height; ОШИБКА
    }
}

