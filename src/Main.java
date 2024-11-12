//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyDate currentDate = new MyDate();
        System.out.println("Текущая дата:");
        System.out.println("Год: " + currentDate.getYear());
        System.out.println("Месяц: " + (currentDate.getMonth() + 1)); // +1, так как месяцы начинаются с 0
        System.out.println("День: " + currentDate.getDay());

        MyDate specificDate = new MyDate(34355555133101L);
        System.out.println("\nДата для указанного времени:");
        System.out.println("Год: " + specificDate.getYear());
        System.out.println("Месяц: " + (specificDate.getMonth() + 1)); // +1, так как месяцы начинаются с 0
        System.out.println("День: " + specificDate.getDay());
    }
}