import java.math.BigInteger;

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

        System.out.println("\n");

        BigInteger start = BigInteger.TEN.pow(49);
        BigInteger end = BigInteger.TEN.pow(50);


        BigInteger two = BigInteger.valueOf(2);
        BigInteger three = BigInteger.valueOf(3);


        int count = 0;


        for (BigInteger i = start; i.compareTo(end) < 0; i = i.add(BigInteger.ONE)) {

            if (i.mod(two).equals(BigInteger.ZERO) || i.mod(three).equals(BigInteger.ZERO)) {
                System.out.println(i);
                count++;

                if (count == 10) {
                    break;
                }
            }
        }

        System.out.println("\n");
        BigInteger maxLongValue = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger sqrtMaxLongValue = maxLongValue.sqrt();


        BigInteger current = sqrtMaxLongValue.add(BigInteger.ONE);
        int countsquare = 0;

        while (countsquare < 10) {
            BigInteger square = current.pow(2);
            System.out.println(square);
            current = current.add(BigInteger.ONE);
            countsquare++;
        }
    }
}