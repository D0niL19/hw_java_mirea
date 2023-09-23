package pract3.n1;

import java.util.Random;

import static java.lang.Math.random;

public class n1 {
    public static void main(String[] args){
        Double[] doubles = new Double[5];

        for (int i = 0; i < 5; i++){
            doubles[i] = random();
            System.out.println(doubles[i]);
        }
        System.out.println();
        Random random = new Random();

        for (int i = 0; i < 5; i++){
            doubles[i] = random.nextDouble();
            System.out.println(doubles[i]);
        }

    }
}
