public class Main {
    public static void main(String[] args) {
        //task1
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }

        //task2
        for (int a = 10; a >= 1; a-- ) {
            System.out.println("Итерация цикла "+ a);
        }

        //task3
        for (int b = 0; b <= 17; b = b + 2) {
            System.out.println("Итерация цикла по четным числам " + b);
        }

        //task4
        for (int c = 10; c >= -10; c--) {
            System.out.println(c);
        }

        //task5
        for (int d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d + " год является високосным");
        }

        //task6
        for (int e = 7; e <= 98; e = e + 7) {
            System.out.println(e);
        }

        //task7
        for (int f = 1; f <= 512; f = f * 2) {
            System.out.println(f);
        }

        //task8
        int total = 0;
        int salary = 29000; //будем считать что прям все 12 месяцев откладывали
        for (int g = 0; g <= 12; g++) {
            total = total + salary;
            System.out.println(total);
        }

        //task9
        int totalI = 0;
        int salaryI = 29000;
        for (int g = 0; g <= 12; g++) {
            totalI = totalI + totalI / 100;
            totalI = totalI + salaryI;
            System.out.println("Месяц " + g + " сумма накоплений равна " + totalI);
        }

        //task10
        //я может не правильно понял задачу, но зачем нам в подсказке написали про умножение в цикле?
        //просто если мы применяем умножение в шаге, то соответсвенно шаг будет предыдущее число х2
        int num = 2;
        for (int h = 1; h <= 10; h++) {
            System.out.println(num + " * " + h + " = " + num * h);
        }
    }
}