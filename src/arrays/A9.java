package arrays;

import java.util.Arrays;

public class A9 {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};

        System.out.println(arr1==arr2); //false
        System.out.println(arr1==arr1); //true
        System.out.println(Arrays.equals(arr1, arr2)); //true
        System.out.println(arr1.equals(arr2)); //false


    }

}
