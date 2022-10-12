public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int total = 0;
        int money = 15000;
        int month = 0;
        while (total <= 2459000) {
            total += money;
            month = month + 1;
        }
        System.out.println(month+" месяца потребуется, чтобы сумма накоплений равна "+ total + " рублей");
        System.out.println(total);
        //Задание 2
        System.out.println("Задание 2");
        System.out.println("While");
        int first = 0;
        int second = 10;
        while (first < 10) {
            first += 1;
            System.out.println(first);
        }
        System.out.println("For");
        for (; second >= 0; second--) {
            System.out.println(second);
        }
        //Задание 3
        System.out.println("Задание 3");
        int Y = 12_000_000;
        int bornPerYear = 17;
        int diePerYear = 8;
        int i = 0;
        while (i < 10) {
            i += 1;
            Y = Y + ((Y/1000)*bornPerYear - (Y/1000) * diePerYear);
            System.out.println("Год "+i +" численность населения составляет " +Y);
        }
        //Задание 4
        System.out.println("Задание 4");
        double bankTotal = 0;
        double total1 = 15000;
        double perCent = 0.07;
        i = 0;
        while (total1 <= 12_000_000) {
            i += 1;
            total1 = total1+ total1*perCent;
            System.out.println("Месяц " + i + " сумма накоплений равна "+total1);
        }
        System.out.println("Задание 5");
        double bankTotal2 = 0;
        double total2 = 15000;
        double perCent2 = 0.07;
        int i1 = 0;
        while (total2 <= 12_000_000) {
            i1 += 1;
            total2 = total2+ total2*perCent2;
            if(i1 == 6) {
                System.out.println("Месяц " + i1 + " сумма накоплений равна " + total2);
            }if (i1 == 12) {
                System.out.println("Месяц " + i1 + " сумма накоплений равна " + total2);
            }
            if (i1 == 18) {
                System.out.println("Месяц " + i1 + " сумма накоплений равна " + total2);
            }
            if (i1 == 24) {
                System.out.println("Месяц " + i1 + " сумма накоплений равна " + total2);
            }
            }
        System.out.println("Задание 6");
        int bankTotal3 = 0;
        int total3 = 15000;
        double perCent3 = 0.07;
        int totalMonth = 12*9;
        int i2 = 0;
        while (i2 < totalMonth) {
            bankTotal3=(int) (bankTotal3+6*(total3*(1+perCent3)));
            System.out.println("Месяц "+ (i2 = i2+ 6)+" сумма накоплений равна "+ bankTotal3);
        }
        //Задание 7
        System.out.println("Задание 7");
        int friday = 7;
        int fridayCounter = 0;
        int monthDays = 31;
        while (fridayCounter < monthDays) {
            fridayCounter = friday + fridayCounter;
            System.out.println("Сегодня пятница "+ fridayCounter + " -е число. Необходимо подготовить отчет.");
        }
        //Задание 8
        System.out.println("Задание 8");
        int comet = 79;
        int yearStart = 1817;
        int yearEnd= 2017;
        while (yearStart < yearEnd) {
            yearStart = yearStart + comet;
            System.out.println("Комета пролетала рядом с Землей в " + yearStart + " году");
        }
        //Задание 9
        System.out.println("Задание 9");
        int two = 2;
        int number = 1;
        for (int i10 = 2; i10 <= 20; i10 = i10 + 2) {
            System.out.println(two + "*"+number++ +"=" +i10);
        }
        }
    }