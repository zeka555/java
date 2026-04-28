import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // unos recenice od korisnika
        System.out.print("Unesi recenicu: ");
        String recenica = scanner.nextLine();

        // pozivanje metoda iz druge klase (StringUtils)
        System.out.println("\n--- REZULTATI ---");

        System.out.println("Broj rijeci: " + StringUtils.brojRijeci(recenica));

        System.out.println("Najduza rijec ima slova: " + 
                            StringUtils.najduzaRijec(recenica));

        System.out.println("Sve veliko: " + 
                            StringUtils.sveVelika(recenica));

        System.out.println("Sve malo: " + 
                            StringUtils.sveMala(recenica));

        System.out.println("Prvo slovo veliko: " + 
                            StringUtils.prvoVeliko(recenica));

        System.out.println("Prvo slovo malo: " + 
                            StringUtils.prvoMalo(recenica));
    }
}