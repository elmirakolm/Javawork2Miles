//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Стоимость билета
        int ticketPrice = 13676;

        // Расчет количества миль
        int miles = ticketPrice / 20;

        System.out.println("Количество начисленных миль за купленный билет: " + miles);
    }
}