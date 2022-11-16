import java.util.Scanner;
import java.util.SortedMap;

public class Codeh {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] myArray = new int[7];
        for (int i = 0; i < 7; i++) {
            myArray[i] = s.nextInt();
        }
        int R1 = myArray[0] + myArray[2] + myArray[4] +myArray[6];
        int R2 = myArray[1] + myArray[2] + myArray[5] +myArray[6];
        int R3 = myArray[3] + myArray[4] + myArray[5] +myArray[6];
        if (R1 % 2 == 0){
            R1 = 0;
        }else {R1 = 1;}
        if (R2 % 2 == 0){
            R2 = 0;
        }else {R2 = 1;}
        if (R3 % 2 == 0){
            R3 = 0;
        }else {R3 = 1;}

        System.out.println();
        double er = R3*Math.pow(2 ,2) + R2*Math.pow(2,1) + R1*Math.pow(2, 0);
        int value = (int)er;
        System.out.println("Ошибка в сообщении "+value);
        System.out.println();
        System.out.println("Правильный вариант: ");

        for (int i = 0; i < 7; i++) {
            if (myArray[value -1] == 0){
                myArray[value -1] = 1;
            }
            if (myArray[value - 1] == 1){
                myArray[value - 1] = 0;
            }
            System.out.print(myArray[i]);
        }


    }
}
