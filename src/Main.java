public class Main {
    public static void main(String[] args) {
        int customerAccount = 1180;
        int bonusMoney = 100;
        int bonus = customerAccount / bonusMoney;
        if (customerAccount > 1099)
            System.out.println("Начисленные бонусные рубли" + bonus);
    }
}
