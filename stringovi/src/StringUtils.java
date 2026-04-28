public class StringUtils {

    // metoda za brojanje rijeci u recenici
    public static int brojRijeci(String recenica) {

        // trim() uklanja razmake na pocetku i kraju
        // split("\\s+") dijeli string na rijeci (po razmacima)
        String[] rijeci = recenica.trim().split("\\s+");

        return rijeci.length; // broj elemenata u nizu = broj rijeci
    }


    // metoda koja vraca duzinu najduze rijeci
    public static int najduzaRijec(String recenica) {

        String[] rijeci = recenica.split("\\s+");
        int max = 0;

        // prolazimo kroz sve rijeci
        for (String rijec : rijeci) {

            // ako je trenutna rijec duza od max, zamijeni
            if (rijec.length() > max) {
                max = rijec.length();
            }
        }

        return max;
    }


    // sva slova u velika
    public static String sveVelika(String recenica) {
        return recenica.toUpperCase();
    }


    // sva slova u mala
    public static String sveMala(String recenica) {
        return recenica.toLowerCase();
    }


    // prvo slovo veliko, ostalo malo
    public static String prvoVeliko(String recenica) {

        // provjera da string nije prazan
        if (recenica == null || recenica.isEmpty()) {
            return recenica;
        }

        return recenica.substring(0, 1).toUpperCase() +
               recenica.substring(1).toLowerCase();
    }


    // prvo slovo malo
    public static String prvoMalo(String recenica) {

        if (recenica == null || recenica.isEmpty()) {
            return recenica;
        }

        return recenica.substring(0, 1).toLowerCase() +
               recenica.substring(1);
    }
}