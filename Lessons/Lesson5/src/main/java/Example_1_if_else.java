/**
 * Created by vlad on 09.11.2015.
 */
public class Example_1_if_else {

    public static void main (String[] args)
    {
        double a = 4 ;
        double b = 5;

      //  a = (double)(Math.random());
       // b = (double ) (Math.random());
        //System.out.println("a = " + a +" b = " + b );



        if (a>b) {
            double c = a * b;
            double d = a / (a + b);
            double f = c +d;

            System.out.println("Суммируем  " + f);

        }
        else if ( a<b) {
            double c = (a*b)/2;
            double d = b+(a*b++);
            double f = c-d;
            System.out.println("Отнимаем  " + f);
        }
        else if (a == b) {
            double c = (a+b)% 5;
            System.out.println("если равны делим по модулю " + c );
        }

    }
}
