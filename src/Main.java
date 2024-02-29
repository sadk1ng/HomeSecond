public class Main {
    public static void main(String[] args) {

        int ticketCost = 13676; // стоимость билета в рублях
        int miles20Rubles = 1; // количество миль за каждые 20 рублей

        // Рассчет количества бонусных миль
        int miles = ticketCost / 20 * miles20Rubles;

        System.out.println("За билет стоимостью " + ticketCost + " рублей начислено " + miles + " миль.");
    }
}