package enento;

public class enento {



        public static int min(int[] a){
           if(a.length < 1)
               throw new java.util.NoSuchElementException("Tabellen a er tom!");

            int m = 0;
           for(int i=1; i<a.length; i++){

               if (a[i] <= a[m]){
                   m = i;
               }
           }
           return m;
    }

    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 1, 2, 7, 19};

        System.out.println(min(a));
    }
}
