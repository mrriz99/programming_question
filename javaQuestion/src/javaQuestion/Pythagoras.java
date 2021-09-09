package javaQuestion;
import java.util.Scanner;

public class Pythagoras {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        Scanner scn = new Scanner(System.in);

	        long n = scn.nextLong();
	        evaluate(n);
	    }

	static void evaluate(long n) {
	        if (n == 1 || n == 2)
	            System.out.println(-1);

	        else if (n % 2 == 0) {

	            // Calculating for even case
	            System.out.println(((n * n) / 4) - 1 + " " + (((n * n) / 4) + 1));
	        }

	        else if (n % 2 != 0) {

	            System.out.println((n * n - 1) / 2 + " " + (n * n + 1) / 2);
	        }
	    }

	}


