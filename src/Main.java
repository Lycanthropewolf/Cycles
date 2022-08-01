public class Main {
    public static void main(String[] args) {

        // Задание 1
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.println(" итерация числа а равна " + a);
        }
        for (a = 10; a > 0; a = a - 1) {
            System.out.println(" итерация числа а равна " + a);
        }

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
            if(year<= 2022 +100 && year>= 2022-200)
            System.out.println(" Комета пролетела над землей в " + year + " году");
        }

        // Задание 4
        for (int namber = 1; namber <= 30; namber++) {
            if (namber % 15 == 0) {
                System.out.println( + namber + " :ping pong ");
            } else if (namber % 5 == 0) {
                System.out.println(+namber + " :pong ");
            } else if (namber % 3  == 0) {
                System.out.println(+ namber + " :ping ");
            } else {
                System.out.println(namber);
            }


        }

    }


}








