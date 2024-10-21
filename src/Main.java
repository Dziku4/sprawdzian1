import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nikodem");
        String name = scanner.nextLine();
        System.out.println("15");
        int age = scanner.nextInt();
        System.out.println("Witaj " + name + ". Za " + (18 - age) + " lata będę miał 18 lat!");
//        na branchu 'twoje imię' w następnej linii wydrukuj pierwszą rzecz jaką chcesz robić po uzyskaniu pełnoletności
        System.out.println("Kupić samochód");
    }
}
