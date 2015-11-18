/**
 * Created by vlad on 12.11.2015.
 */
public class Sorting {
    public static void main( String[] args ){

        int [] Array =  {2,10,32,12,43,21,22,54} ;

               for (int i = Array.length-1; i >= 0;i--) {

                   for (int j = 0; j < i;j++) {

                       if (Array[j] > Array[j+1]){
                           int tmp = Array [j];
                           Array[j] = Array [j+1];
                           Array[j+1] = tmp;

                       }
                   }


                   System.out.println(Array[i]);
               }
    }
}
