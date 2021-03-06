import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        double startingScore; // Начальный счет
        double replenishmentAmount; // Сумма пополения
        double amountOnAccount; // Сумма на счету

        startingScore = 5;
        replenishmentAmount = 1199.10;


        if (replenishmentAmount > 1000) {
            long bonus = (long) replenishmentAmount / 100; // Количество начисленных бонусов
            amountOnAccount = startingScore + replenishmentAmount + bonus;
            System.out.println("На Ваш счет поступил платеж в размере: " + replenishmentAmount + " рублей. Ваш бонус от пополнения составляет: " + bonus + " рублей. Баланс Вашего счета: " + amountOnAccount + " рублей");
        } else {
            long bonus = 0; // Количество начисленных бонусов
            amountOnAccount = startingScore + replenishmentAmount;
            System.out.println("На Ваш счет поступил платеж в размере: " + replenishmentAmount + " рублей. Ваш бонус от пополнения составляет: " + bonus + " рублей (для получения бонусов следует пополнить счет более чем на 1000 рублей). Баланс Вашего счета: " + amountOnAccount + " рублей");

        }
    }
}