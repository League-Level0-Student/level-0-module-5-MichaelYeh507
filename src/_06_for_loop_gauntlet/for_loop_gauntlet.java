package _06_for_loop_gauntlet;

public class for_loop_gauntlet {
	public static void main(String[] args) {
		//1
		/* for (int i = 0; i < 101; i++) {
			System.out.println(i);
		} */
		
		//2
		/* for (int j = 101; j > 0; j--) {
			System.out.println(j);
		} */
		
		//3
		/* for (int a = 2; a < 101; a++) {
			System.out.println(a);
		} */
		
		//4
		/* for (int b = 1; b < 100; b++) {
			System.out.println(b);
		} */
		
		//5
		/* for (int c = 1; c < 501; c++) {
			if (c % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			} */
		
		//6
		/*for (int d = 7; d < 778; d++) {
			if (d % 7 == 0) {
				System.out.println(d);
			}
		}*/
		
		//7
		/*int age = 0;
		for (int i = 2006; i < 2020; i++) {
			System.out.println(i + " " + age);
			age++;
		}*/
		
		//1
		/*for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);
			}
		}*/
		
		//2
		/*for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print(j + i * 3 + " ");
			}
			System.out.println(" ");
		}*/
		
		//3
		/*for (int i = 0; i < 10; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.print(j + i * 10 + "\t");
			}
			System.out.println(" ");
		}*/
		
		//4
		/*for (int i = 1; i < 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print('*' + " ");
			}
			System.out.println(" ");
		}*/
		
		//bonus
		
		for (int i = 0; i < 100; i++) {
			System.out.println(100 - i);
		}
	}
}

