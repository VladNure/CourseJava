/**
 * Created by vlad on 09.11.2015.
 */
public class Example_3_circle {

    public static void main(String[] args) {

        int [] Array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      //---------------���� for ---------------------
        // ������ �� 0 �� 10
        for (int i =0; i <10; i++ ){

            System.out.println (Array[i] );
        }
        //������ �� 10 �� 0
        for ( int i = 9; i>=0; i--) {

            System.out.println ("  " + Array[i] );
        }

        //------------------���� while----------------
        int i = Array.length -1;
        while( i>=0){

            System.out.println(Array [i]);
            i--;
        }

    }
}
