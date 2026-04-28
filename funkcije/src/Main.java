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

        System.out.println(jeParan(4)); // true
        System.out.println(jeParan(5)); // false
    }

    // 🔹 1. OBICNA FUNKCIJA
    public static int saberi(int a, int b) {
        return a + b;
    }

    // 🔹 2. VOID FUNKCIJA
    public static void ispisiPoruku(String poruka) {
        System.out.println("Poruka: " + poruka);
    }

    // 🔹 3. REKURZIVNA FUNKCIJA
    public static int faktorijel(int n) {
        if (n == 0) {
            return 1;
        }
        return n * faktorijel(n - 1);
    }

    // 🔹 4. BOOLEAN FUNKCIJA
    public static boolean jeParan(int broj) {
        return broj % 2 == 0;
    }
}