package ru.stqa.utk.sandbox;

/**
 * Created by Tonya on 26.10.2017.
 */
public class Simple {

   public static boolean isSimple(int n) {
       for (int i = 2; i < n; i++) {
           if (n % i == 0){
               return false;
       }
   }
return true;
}


    public static boolean isSimpleFast(int n) {
       int m = (int)Math.sqrt(n);
        for (int i = 2; i < m; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
