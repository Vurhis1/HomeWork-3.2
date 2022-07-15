public class Main {
    public static void main(String[] args) {

        int startCheck = 100; //у клиента на счёте 100 рублей
        int addOnStartCheck1 = 1100; //Клиент пополнил счёт
        boolean itog = true;

        int percent;
        if (itog) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = addOnStartCheck1 / 100 * percent;

        if (addOnStartCheck1 < 1100) {

            System.out.println("Бонус не получен");
        } else {
            System.out.println("Итоговый бонус : " + bonus);
        }
    }
}





