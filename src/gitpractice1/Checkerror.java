package gitpractice1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Checkerror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		// TODO Auto-generated method stub
		Random rng = new Random();
		int number;
		int[] num = new int[101];
		//num[0]=10;
		//Generating an array with 101 random number
		for(int i=0; i<101; i++)
		{
			number = rng.nextInt(101); //generating the random number
			num[i]=number; //storing the random number in array
				
		}
		
		//How to print a array
		for(int j=0;j<101;j++)
		{
			System.out.println(num[j]+" ");
		}
		
		//Sorting the array
		Arrays.sort(num);
		for(int k=0;k<101;k++)
		{
			System.out.print(num[k]+" ");
		}
		System.out.println();
		System.out.println("please enter smallest number");
		int n = scr.nextInt();
		System.out.println(num[n-1]);

	}

}
