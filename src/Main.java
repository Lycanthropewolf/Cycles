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
        for (year =1896;  year <= afterYear; year = year + 79) {
            System.out.println(" Комета пролетела над землей в " + year + " году");
        }

        // Задание 4



    }


}



