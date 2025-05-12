public class Main {
    public static void main(String[] args) {
        int[] payment = new int [] {123, 321, 444, 555, 666,};
        int sum = 0;
        for (int i = 0; i < payment.length; i++) {
            sum = sum + payment[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        //Задание 2
        System.out.println("Задание 2");
        int [] payment1 = new int[] {332, 332323, 1, 2323, 57785};
        int maxPayment = payment1[0];
        int minPayment = payment1[0];
        for (int i = 0; i < payment1.length; i++) {
            if (payment1[i] >  maxPayment){
                maxPayment = payment1[i];
            }
        }
        for (int i = 0; i < payment1.length; i++) {
            if (payment1[i] < minPayment) {
                minPayment = payment1[i];
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %d рублей. Максимальная сумма трат за неделю составила %d рублей. %n", minPayment, maxPayment);
        //Задание 3
        System.out.println("Задание 3");
        int[] payment3 = new int [] {123, 321, 444, 555, 666,};
        int sum3 = 0;
        int weekInMonth = payment3.length;
        for (int i = 0; i < payment3.length; i++) {
            sum3 = sum3 + payment3[i];
        }
        double averagePayment = (double)sum3 / weekInMonth;
        System.out.printf("Средняя сумма трат за месяц составила "+ averagePayment + " рублей.");
        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length; i++) {

        }
    }
}