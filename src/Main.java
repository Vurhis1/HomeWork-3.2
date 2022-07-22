public class Main {
    public static void main(String[] args) {

        int startCheck = 100; //у клиента на счёте 100 рублей
        int addOnStartCheck1 = 1000; //Клиент пополнил счёт 1000 руб
        boolean task = true; //условие, при которым бонус будет получен, либо нет

        int percent;
        if (task) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = addOnStartCheck1 / 100 * percent;

        if (addOnStartCheck1 < 1000) {

            System.out.println("Бонус не получен");
            System.out.println("На вашем счету: " + (startCheck + addOnStartCheck1));
        } else {
            System.out.println("Итоговый бонус : " + bonus);
            System.out.println("На вашем счёту: " + (startCheck + addOnStartCheck1 + bonus));
        }
    }
}






