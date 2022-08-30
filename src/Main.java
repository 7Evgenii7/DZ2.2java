public class Main {
    public static void main(String[] args) {
        int customerAccount = 1180;
        int bonusMoney = 100;

        if (customerAccount > 1099) {
            int bonus = customerAccount / bonusMoney;
            System.out.println("Бонусные рубли: " + bonus);
            customerAccount += bonus;
        } else {
            System.out.println("Бонусов нет");
        }

        System.out.println("Баланс пользователя: " + customerAccount);
    }
}
