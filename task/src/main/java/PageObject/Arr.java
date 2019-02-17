package PageObject;

/**
 * Created by Tonya on 3/24/2018.
 */
import java.util.Arrays;

    public class Arr {

        public Boolean vozvrat(String A){

            String B="";
            String C=A.replace(" ","");
            char[] mass =C.toCharArray();
            char[] mass2=new char[mass.length];
            for ( int i =mass.length-1; i>= 0;){
                for(int j=0;j<mass2.length; j++){

                    mass2[j]=mass[i]; i--;

                    B+=mass2[j];

                }

            }
            System.out.println(B);
            System.out.println(C);
            return B.equalsIgnoreCase(C);

        }

        public static void main(String args[]){
            Arr C=new Arr();
            System.out.println(C.vozvrat("Madam'      I'm Adam"));
        }

    }