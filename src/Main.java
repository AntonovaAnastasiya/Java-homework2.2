public class Main {
    public static void main(String[] args) {

        // входные данные
        int initialamount = 100;
        int amountplus = 1600;
        int bonus = amountplus / 100;
        int bonus2 = 0;
        int total = initialamount + amountplus + bonus;
        int total2 = initialamount + amountplus + bonus2;


        //Логика
        if (amountplus > 1000) {
            System.out.println("Итоговый счет");
            System.out.println(total);
        }
        if (amountplus < 1000) {
            System.out.println("Итоговый счет");
            System.out.println(total2);
        }
    }
}
