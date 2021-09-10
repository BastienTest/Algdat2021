package enentre;

import java.util.Arrays;

public class OppFem {
    public static int[] minmaks(int[] a){
        int m1 = 0;
        int m2 = 1;
        int[] b = {m1, m2};

        if(a[m1] > a[m2]){

            m1 = 1;
            m2 = 0;
        }
        else{
            m1 = a[0];
            m2 = a[1];
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {3, 2};
        System.out.println(Arrays.toString(minmaks(a)));
    }
}
