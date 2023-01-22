package com.rahul;

import java.util.Scanner;

public class Pattern {
	
	/*
	 * * * *
	 * * * *
	 * * * *
	 * * * *
	 */
	
	public static void pattern1(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	/*
	 *
	 * *
	 * * *
	 * * * *
	 */
	public static void pattern2(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	/*
	 1
	 1 2
	 1 2 3
	 1 2 3 4
	 
	 */
	public static void pattern3(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
	}
	
	/*
	 1
	 2 2
	 3 3 3
	 4 4 4 4 
	 */
	
	public static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	/*
	 * * * *
	 * * *
	 * *
	 * 
	 */
	
	public static void pattern5(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	/*
	 1 2 3 4
	 1 2 3
	 1 2
	 1
	 */
	public static void pattern6(int n) {
		for(int i=1;i<=n;i++) {
			int t=1;
			for(int j=n;j>=i;j--) {
				System.out.print(t+++" ");
			}
			System.out.println();
		}
	}
	
	/*
	 1 
	 0 1 
	 1 0 1 
	 0 1 0 1 
	 1 0 1 0 1 

	 */
	public static void pattern7(int n) {
		boolean b=true;
		boolean t=true;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				b=false;
			}else {
				b=true;
			}
			for(int j=1;j<=i;j++) {
				
				if(b) {
					System.out.print(1+" ");
					b=false;
				}else {
					System.out.print(0+" ");
					b=true;
				}
			}
			System.out.println();
			
		}
	}
	/*
	 1 
	 2 3 
	 4 5 6 
	 7 8 9 10 
	 11 12 13 14 15 
	 */
	public static void pattern8(int n) {
		int temp=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(temp+++" ");
			}
			System.out.println();
		}
		
	}
	
	/*
	 A 
	 A B 
	 A B C 
	 A B C D 
	 A B C D E 
	 */
	public static void pattern9(int n) {
		
		for(int i=1;i<=n;i++) {
			int temp=(int)'A';
			for(int j=1;j<=i;j++) {
				System.out.print((char)(temp++)+" ");
			}
			System.out.println();
		}
	}
	
	/*
	A B C D E 
	A B C D 
	A B C 
	A B 
	A 
*/
	public static void pattern10(int n) {
		
		for(int i=1;i<=n;i++) {
			int temp=(int)'A';
			for(int j=n;j>=i;j--) {
				System.out.print((char)(temp++)+" ");
			}
			System.out.println();
		}
	}
	
	/*
	A 
	B B 
	C C C 
	D D D D 
	*/
	public static void pattern11(int n) {
		int ex=0;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				int temp=(int)'A';
				System.out.print((char)(temp+ex)+" ");
			}
			ex++;
			System.out.println();
		}
	}
	/*
	E 
	D E 
	C D E 
	B C D E 
	A B C D E 
	*/
	public static void pattern12(int n) {
		for(int i=1;i<=n;i++) {
			int temp=(int)'A'+n-i;
			for(int j=1;j<=i;j++) {
	
				System.out.print((char)(temp++)+" ");
			}
			System.out.println();
			
		}
	}
	
	public static void pattern13(int n) {
		
		for(int i=1;i<=n;i++) {
			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pattern12(n);
		
		sc.close();
	}

}
