public class Main {
    public static void main(String[] args) {

        // Задание 1
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + ",");
        }
        System.out.println();
        for (; a > 0; a = a - 1) {
            System.out.print(a + ",");
        }
        System.out.println();


        // Задание 2
        for (int firstFriday = 3; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println(" Сегодня пятница " + firstFriday + " число,необходимо подготовить отчет ");
        }

        // Задание 3
        int year = 0;
        int nowYear = 2022;
        int beforeYear = nowYear - 200;
        int afterYear = nowYear + 100;
        for (year = 0; year <= afterYear; year = year + 79) {
            if (year >= beforeYear)
                System.out.println(" Комета пролетела над землей в " + year + " году");
        }

        // Задание 4
        for (int namber = 1; namber <= 30; namber++) {
            if (namber % 15 == 0) {
                System.out.println(+namber + ":ping pong ");
            } else if (namber % 5 == 0) {
                System.out.println(+namber + ":pong ");
            } else if (namber % 3 == 0) {
                System.out.println(+namber + ":ping ");
            } else {
                System.out.println(namber + ":");
            }
        }

        // Задание 5
        //Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
        //– Каждое следующее число равняется сумме двух предыдущих.
        //Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
        //Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
        //Должно получиться следующее:
        //0 1 1 2 3 5 8 13 21 34
        //Справка
        //Числа Фибоначчи – элементы числовой последовательности
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, … , в которой первые два числа равны 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел. Названы в честь средневекового математика Леонардо Пизанского.
        //Критерии оценки
        //– Код написан корректно и выполняет условия задачи при изменении значений переменной;
        //– В коде не допущено ошибок или неверного использования конструкций; – Все условия задачи выполняются.

        int preFibonachi1 = 0;
        int preFibonachi2 = 1;
        System.out.println(preFibonachi1);
        System.out.println(preFibonachi2);
        for (int j = 3; j <= 10; j++) {
            int currentFibonachi = preFibonachi1 + preFibonachi2;
            System.out.println(currentFibonachi);
            preFibonachi1 =  preFibonachi2;
            preFibonachi2 = currentFibonachi;



        }


    }


}











