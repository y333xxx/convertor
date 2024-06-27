
import java.util.Scanner;

    public class Main {
        final static double ROUBLES_PER_DOLLAR = 72.12;

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String x = new String();
            String y = new String();
            ;
            int dollars, digit, n, i;
            double roubles;

            instruct();

            do {
                System.out.println("Введите корректное колличество конвертаций: ");
                n = input.nextInt();
            } while (n <= 0);

            for (i = 0; i < n; ++i) {
                System.out.println("Введите сумму денег в долларах:");
                dollars = input.nextInt();
                digit = dollars % 10;
                roubles = findRoubles(dollars);
                if (dollars >= 11 && dollars <= 14) {
                    x = "их";
                    y = "ов";
                } else if (digit >= 5 && digit <= 9) {
                    x = "их";
                    y = "ов";
                } else if (digit >= 2 && digit <= 4) {
                    x = "их";
                    y = "а";
                } else if (digit == 1) {
                    x = "ий";
                    y = "";
                }

                System.out.println(dollars + " американск" + x + " доллар" + y + " в рублях: " + (int) (((roubles * 100) / 100.00)) + " RUB");
            }
        }

        public static void instruct() {
            System.out.println("Эта программа конвертирует сумму денег" + " из американских долларов в рубли. " + "Курс покупки равен " + ROUBLES_PER_DOLLAR);
        }
        public static double findRoubles(int dollars){
           return ROUBLES_PER_DOLLAR*dollars;
        }
    }