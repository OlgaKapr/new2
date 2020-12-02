package ru.olga;

import java.util.Scanner;

public class Util {

    static void randomSleep()  {
        try {

            Thread.sleep(1000);
            // Как будто здесь очень много вычислений
            // и программа очень долго их обрабатывает

        } catch (InterruptedException e) {

            // Если возникла ошибка, мы попадем сюда.
            System.out.println("Возникла ошибка, ничего не могу сделать. Пока!");

        }
    }

    public static void main(String[] args) {

        // случайны
        // псевдослучайные

        for(int j = 0; j < 10; j++) {
            randomSleep();
            System.out.println("Hi");
        }


//        for(int i =0; i < 10; i++) {
//            System.out.println( Math.random() );
//        }


//        double r = 1;
//        long coutter = 0;
//
//        while( r > 0.00000001 ) {
//            r = Math.random();
//            coutter ++;
//        }
//
//        System.out.println(r);
//        System.out.println(coutter);

        Scanner s = new Scanner(System.in);

        System.out.println("Введите число: ");
        int x = s.nextInt();

        //int p = (int) 5.6; // пример преобразования типа

        int result =  (int) (Math.random() * 10); // 0 - 1 => 0 - 10
        result = result % 6 + 1; // 0 до 5 => 1 - 6

        System.out.println("Бросаем кости, реузльтат: " + result );

        if ( x == result) {
            System.out.println("Ура вы выиграли 100000000 долларов!");
        } else {
            System.out.println("Повезет в другой раз!");
        }

    }
}
