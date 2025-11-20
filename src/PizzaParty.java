import java.util.InputMismatchException;
import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println("Unesite broj pizza:");
                int brojPizza = sc.nextInt();

                System.out.println("Unesite broj ljudi:");
                int brojLjudi = sc.nextInt();

                System.out.println("Svaka osoba dobiva " + izracunajSnite(brojPizza, brojLjudi) + " snita/e.");
                valid = true;

            } catch (ArithmeticException e) {
                System.err.println("Greška: Ne možemo podijeliti pizzu na 0 ljudi.");
            } catch (InputMismatchException e) {
                System.err.println("Greška: Molimo unesite samo cijele brojeve.");
                sc.nextLine();
            }
        }
    }

    public static int izracunajSnite(int brojPizza, int brojLjudi) {
        int brojSnita = brojPizza * 8;
        return brojSnita / brojLjudi;
    }
}