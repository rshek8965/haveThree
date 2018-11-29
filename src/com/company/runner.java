package com.company;

public class runner {

    public static void main(String[] args) {
	int[] arr = {3, 1, 3, 1, 3}; //true
	int[] arr2 = {3, 1, 3, 3}; //false
	int[] arr3 = {3, 4, 3, 3, 4}; //false

        System.out.println(haveThree.check(arr));
        System.out.println(haveThree.check(arr2));
        System.out.println(haveThree.check(arr3));
    }
}
