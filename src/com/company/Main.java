package com.company;
//Create an array with the following values: [2,5,9,0,2,1,8,5,4]
//Loop through the array and print out the index each time the value equals 5.
public class Main {

    public static void main(String[] args) {
	// write your code here

    int[] numbers = {2,5,9,0,2,1,8,5,4};
    for(int i=0; i<numbers.length; i++){
        if (numbers[i] == 5) {
            System.out.println(i);
        }
        }
    }

    }

