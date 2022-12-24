public class Main {
    public static void main(String[] args) {
        int a = 257980;
        byte b = 54;
        short c = 21000;
        long d = 123456789L;
        float e = 25.78f;
        double f = 1.51;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        float g = 27.12f;
        long h = 987678965549L;
        double j = 2.786;
        short k = 569;
        short l = -159;
        int m = 27897;
        byte n = 67;

        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int paper = 480;
        int studentPaper = paper / (class1 + class2 + class3);
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");

        int bottle1 = 16;
        int time1 = 2;
        int time2 = 20;
        int time3 = 1440;
        int time4 = 4320;
        int time5 = 44640;
        int bottle2 = bottle1 * time2 / time1;
        int bottle3 = bottle1 * time3 / time1;
        int bottle4 = bottle1 * time4 / time1;
        int bottle5 = bottle1 * time5 / time1;
        System.out.println("За 20 минут машина произвела " + bottle2 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottle3 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottle4 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottle5 + " штук бутылок");

        int x = 120;
        int y1 = 2;
        int y2 = 4;
        int y = y1 + y2;
        int z = x / y;
        int x1 = z * y1;
        int x2 = z * y2;
        System.out.println("В школе, где " + z + " классов, нужно " + x1 + " банок белой краски и " + x2 + " банок коричневой краски");

        int banana1 = 80;
        int banana = banana1 * 5;
        int milk1 = 105;
        int milk = milk1 * 2;
        int icecream1 = 100;
        int icecream = icecream1 * 2;
        int eggs1 = 70;
        int eggs = eggs1 * 4;
        int bf = banana + milk + icecream + eggs;
        float bf1 = bf / 1000;
        System.out.println("вес спортзавтрака " + bf + " г");
        System.out.println("вес спортзавтрака " + bf1 + " кг");

        double weightLoss = 7;
        double weightLoss1 = 0.25;
        double weightLoss2 = 0.5;
        double day1 = weightLoss / weightLoss1;
        double day2 = weightLoss / weightLoss2;
        double days = (day1 + day2) / 2;
        System.out.println("если спортсмен будет терять каждый день по 250 грамм у него уйдет на похудение " + day1 + " дней");
        System.out.println("если спортсмен будет терять каждый день по 500 грамм у него уйдет на похудение " + day2 + " дней");
        System.out.println("в среднем, чтобы добиться результата похудения спортсмену потребуется " + days + " дней");

        int salary1 = 67760;
        int salary2 = 83690;
        int salary3 = 76230;
        int newSalary1 = salary1/10+salary1;
        int newSalary2 = salary2/10+salary2;
        int newSalary3 = salary3/10+salary3;
        int yearSalary1 = salary1 * 12;
        int yearSalary2 = salary2 * 12;
        int yearSalary3 = salary3 * 12;
        int newYearSalary1 = newSalary1 * 12;
        int newYearSalary2 = newSalary2 * 12;
        int newYearSalary3 = newSalary3 * 12;
        int diffSalary1 = newYearSalary1 - yearSalary1;
        int diffSalary2 = newYearSalary2 - yearSalary2;
        int diffSalary3 = newYearSalary3 - yearSalary3;
        System.out.println("Маша теперь получает " + newSalary1 + " рублей. Годовой доход вырос на " + diffSalary1 + " рублей");
        System.out.println("Денис теперь получает " + newSalary2 + " рублей. Годовой доход вырос на " + diffSalary2 + " рублей");
        System.out.println("Кристина теперь получает " + newSalary3 + " рублей. Годовой доход вырос на " + diffSalary3 + " рублей");




    }


}