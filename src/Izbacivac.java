import java.util.Scanner;

public class Izbacivac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Dobrodosli u Club Java.");
            System.out.println("Unesite svoje godine: ");

            int dob = sc.nextInt();
            provjeriDob(dob);

        } catch (IllegalArgumentException e) {
            System.err.println("Ulaz zabranjen: " + e.getMessage());
        }

    }

    public static void provjeriDob(int dob) {
        if (dob < 18) {
            throw new IllegalArgumentException("Premlad za ulazak.");
        } else if (dob > 100) {
            throw new IllegalArgumentException("Osobna iskaznica izgleda lazno.");
        } else {
            System.out.println("Dobrodosli u klub!");
        }
    }
}
