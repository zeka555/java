public class Main {

    public static void main(String[] args) {

        // POZIV OBICNE FUNKCIJE
        int zbir = saberi(5, 3);
        System.out.println("Zbir je: " + zbir);

        // POZIV VOID FUNKCIJE
        ispisiPoruku("Ovo je void funkcija!");

        // POZIV REKURZIVNE FUNKCIJE
        int faktorijel = faktorijel(5);
        System.out.println("Faktorijel broja 5 je: " + faktorijel);
    }


    // 🔹 1. OBICNA FUNKCIJA (vraca vrijednost)
    public static int saberi(int a, int b) {

        // ova funkcija prima 2 broja i vraca njihov zbir
        return a + b;
    }


    // 🔹 2. VOID FUNKCIJA (ne vraca nista)
    public static void ispisiPoruku(String poruka) {

        // void znaci da funkcija samo izvrsava neku akciju
        // ovdje samo ispisujemo tekst
        System.out.println("Poruka: " + poruka);
    }


    // 🔹 3. REKURZIVNA FUNKCIJA (poziva samu sebe)
    public static int faktorijel(int n) {

        // BASE CASE (uslov za zaustavljanje)
        if (n == 0) {
            return 1;
        }

        // REKURZIVNI POZIV
        return n * faktorijel(n - 1);
    }
}