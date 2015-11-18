/**
 * Created by vlad on 09.11.2015.
 */
public class Swap {

    public static void main(String[] args)
    {
        int a =3;
        int b =5;


        // swap a with b

        a= a+b;
        b =a-b;
        a =a-b;

        System.out.println( "a= " + a + "b=  " + b);

    }



}
