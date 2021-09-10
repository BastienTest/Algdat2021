package enenfem;

public class OppEn {

    public static int maks(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = maksverdi;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                }
                else if (a[i] > maksverdi){
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;              // m oppdateres
                    a[sist] = maksverdi;
                }
            }
            }
    }
    public static void main(String[] args) {
        int [] a = {9, 7, 8, 12, 4, 6, 12, 3};
        System.out.println(maks(a));
    }
} // maks
// test pout github