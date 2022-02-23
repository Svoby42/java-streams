package com.company.shuffle;

import java.lang.reflect.Array;
import java.util.*;

public class App {

    public static void main(String[] args) {

        int[] array = new int[1000];
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        System.out.println(Arrays.toString(shuffle(array)));

    }

    public static int[] shuffle(int[] array){

        Random random = new Random();

        for(int i = 0; i < array.length; i++){

            int j = random.nextInt(array.length - i);

            int temp1 = array[i];
            array[i] = array[j];
            array[j] = temp1;
        }
        return array;
    }
}
