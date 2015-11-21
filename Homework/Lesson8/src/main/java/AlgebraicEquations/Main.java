package AlgebraicEquations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vlad on 21.11.2015.
 */
public class Main {


    public static void main (String[] args)throws IOException{
        int uravniniy =0;
        int neizvest =0 ;

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите кол-во уравнений : ");
        uravniniy = Integer.parseInt(read.readLine());
        System.out.println();

        System.out.println("Введите количество неизвесных : ");
        neizvest = Integer.parseInt(read.readLine());
        neizvest ++;
        double [][] matr =  new double[uravniniy][neizvest];

        // Заполняем массив
        for (int i=0; i < uravniniy; i++){
            System.out.println((i+1) + "-я строка ");

            for (int j=0; j < neizvest; j++){
                matr[i][j] = Double.parseDouble(read.readLine());

            }

        }

        // Вывод массива

        System.out.println();
        System.out.println("Исходная матрица ");
        for (int i = 0; i < uravniniy; i++){
            for(int j = 0 ; j < neizvest; j++){
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }

        // Прямой ход
        double tmp = 0.0;
        double[] xx = new double[neizvest];
        int k = 0;

        for (int i = 0; i < uravniniy; i++) {

            tmp = matr[i][i];

            for (int j = uravniniy; j >= i; j--) {
                matr[i][j] /= tmp;
            }

            for (int j = i + 1; j < uravniniy; j++) {

                tmp = matr[j][i];

                for (k = uravniniy; k >= i; k--) {
                    matr[j][k] -= tmp * matr[i][k];
                }
            }
        }
          // Обратный ход
            xx[uravniniy-1] = matr[uravniniy - 1][uravniniy];
            for (int i = uravniniy -2; i >=0; i--){
                xx[i] = matr[i][uravniniy];
                 for (int j = uravniniy+1;j< uravniniy; j++ ){
                     xx[i] -= matr[i][j]*xx[j];

                 }

            }

            // Вывод корней
            System.out.println("Корни уровнения ");
            for (int i=0; i< uravniniy; i++){
                System.out.println("x" + (i+1) + "=" + xx[i]);
            }



    }
}
