/**
 * Created by vlad on 09.11.2015.
 */

public class ModularDivision
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число которое хотите поделить ");
        int a = in.nextInt();
        System.out.print("Введите модуль  ");
        int b = in.nextInt();
        System.out.println("число которое будем делить " + a + " модуль  " + b);



        System.out.println ( "b = "  + b % 10);



    }
}
