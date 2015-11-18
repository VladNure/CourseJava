/**
 * Created by vlad on 09.11.2015.
 */
public class Conversion {

    public static void main(String[] args)
        {
            byte Byte = 27;

            System.out.println( "Значение переменной которое преобразуем " + Byte);

            short Short = (short)Byte;
            System.out.println( " Преоброзуем byte в short " + Short );

            int Int = (int) Short;
            System.out.println(" Преоброзуем short в int  " + Int );

            long Long =(long)Int;
            System.out.println( " Преоброзуем int в long " + Long );

            float Float = (float) Int;
            System.out.println (" Преоброзуем int в float " + Float);

            double Double = (double) Long;
            System.out.println(" Преоброзуем long в double " +  Double );

            double Double1 = (double)Int;
            System.out.println( " Преоброзуем int в double "+ Double1);

            float Float1 = (float)Long;
            System.out.println(" преобразуем long в float" + Float1);


            char Char ='a';
            System.out.println("Значение переменной char " + Char);

            int Int2 = (int) Char;
            System.out.println( "Переобразуем с char в int " + Int2);


        }


}
