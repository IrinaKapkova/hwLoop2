public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №1");
        task1_1();
        task1_2();
        task1_3();
        System.out.println("Домашнее задание №2");
       task2_1();
       task2_2();
       task2_3();
        task2_4();
        System.out.println("Домашнее задание №3");
        task3_1();
        task3_2();
    }
    //homework1
    public static void task1_1() {
        System.out.println("Задание 1");
        int deposit = 0;
        int interestRate = 12;
        int i = 0;
        while (deposit <= 2459000) {
            deposit=deposit+15000+deposit/12*interestRate/100;
            i=i+1;
            System.out.println("Месяц "+i + " сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println("Для накопления необходимой суммы потребуется " +i+ " месяцев");
    }
    public static void task1_2() {
        System.out.println("Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i=i+1;
        }
        for (int p = 10; p>= 1; p--) {
            System.out.println(p);
        }
    }
    public static void task1_3() {
        System.out.println("Задание 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;

        for (int i = 1; i <= 10; i++) {
            population=population+ population*(17-8)/1000;
            System.out.println("Год  "+i + " численность населения составляет " + population + " человек");
        }
    }
    //homework2
    public static void task2_1() {
        System.out.println("Задание 1");
        int deposit = 0;
        int interestRate = 7;
        int i = 0;
        while (deposit <= 12_000_000) {
            deposit=deposit+15000+deposit/12*interestRate/100;
            i=i+1;
            System.out.println("Месяц "+i + " сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println("Для накопления необходимой суммы потребуется " +i+ " месяцев");
    }

    public static void task2_2() {
        System.out.println("Задание 2");
        int deposit = 0;
        int interestRate = 7;
        int i = 0;
        while (deposit <= 12_000_000) {
            deposit=deposit+15000+deposit/12*interestRate/100;
            i=i+1;
           if (i%6==0)
            {System.out.println("Месяц "+i + " сумма накоплений равна " + deposit + " рублей");}
        }
        System.out.println("Для накопления необходимой суммы потребуется " +i+ " месяцев");
    }
    public static void task2_3() {
        System.out.println("Задание 3");
        int deposit = 0;
        int interestRate = 7;
        int i = 0;
        while (i <= 9*12) {
            deposit=deposit+15000+deposit/12*interestRate/100;
            i=i+1;
            if (i%6==0)
            {System.out.println(i/6 + " полугодие сумма накоплений равна " + deposit + " рублей");}
        }
    }

    public static void task2_4() {
        System.out.println("Задание 4");
        int friday = 2;
        int i=0;
        int p=0;
        while (i <= 31) {
            i=i+1;
            p=i-friday;
            if (p % 7==0) {
                System.out.println("Сегодня пятница, " + i + " число. Необходимо подготовить отчет.");
            }
            }
        }
    //homework3
    public static void task3_1() {
        System.out.println("Задание 1");
        int  Year = 2022;
        int period=200;
        int trajectory=79;
        int k=Year-period;
        int p = Year-Year%trajectory;
        System.out.println(p+trajectory);
        while (p>=k) {
            System.out.println(p);
            p=p-trajectory;
        }
    }
    public static void task3_2() {
        System.out.println("Задание 2");
        for (int p = 1; p<= 10; p++) {
            System.out.println("2*" + p + "="+ p*2);
        }
    }
}