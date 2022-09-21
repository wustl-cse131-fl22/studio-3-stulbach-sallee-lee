package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		
		System.out.println("Choose a number");
		n = scan.nextInt();
		
		
		/*
		 * int fill = 0;
		int[] mat = new int[n];
		
		for (int r = 0; r < mat.length; r++)
		{
				mat[r] = fill + 1;
				System.out.print(mat[r] + " ");
				fill++;
		}
		*/
		
		boolean[] a = new boolean[n];
		for (int i = 2; i < n; i++)
		{
			a[i] = true;
		}
		
		int comp = 0; 
		
		for (int i = 2; i < Math.sqrt(n); i++)
		{
			if (a[i] == true)
			{
				for (int j = i * i; j < n; j = j + i)
				{
					a[j] = false;
					comp++;
				}
			}
		}
		
		
		for (int k = 2; k < a.length; k++)
		{
			if (a[k] == true)
			{
				System.out.print(k + " ");
			}
		}
		
	}

}
