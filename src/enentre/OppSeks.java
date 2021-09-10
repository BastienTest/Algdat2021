package enentre;

public class OppSeks {
    public static long fak(int n){
       long sum = 1;
       for (int i = n; i>1; i--){
           sum = sum * i;
       }

        return sum;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fak(n));
    }
}
// Det utføres n-1 multiplikasjoner