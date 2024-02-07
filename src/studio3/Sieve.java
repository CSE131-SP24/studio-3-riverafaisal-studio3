package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many items are being seived?");
		int n = in.nextInt();
		int[] array = new int[n - 1];
		for (int i = 2; i <= n; i++)
		{
			array[i - 2] = i;
		}
		
		for (int p = 2; p < n; p++)
		{
			if (array[p - 2] != 0)
			{
				for (int i = 2; p * i <= n; i++)
				{
					int sieved = p * i - 2;
					array[sieved] = 0;
				}
			}
		}
		
		for (int i = 0; i < n - 1; i++)
		{
			if (array[i] != 0)
			{
				System.out.print(array[i] + " ");
			}
		}

	}

}
