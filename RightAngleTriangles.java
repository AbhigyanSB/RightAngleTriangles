
public class RightAngleTriangles {

	public static void main(String[] args) {
		
		int a = 6; // initializing the value of "a" as 6 as given on the question
		
		{
			System.out.println("Pattern A"); /* for the pattern "A" in the question */
		}
		for (int b=1; b<=a; b++) { /* initializing "b" for pattern "A" */
			for (int c=1; c<=b; c++) { /* displaying the pattern of the numbers */
				System.out.printf("%-2d", c);
			}
			System.out.print("\n"); // spacing between the two patterns
		}
		
		{
			System.out.print("\n"); // spacing between the two patterns
			System.out.println("Pattern B"); /* for the pattern "B" in the question */
		}
		for (int b=6; b>=0; b--) {  /* initializing "b" for pattern "B" */
			for (int c=1; c<=b; c++) {  /* displaying the pattern of the numbers */
				System.out.printf("%-2d", c);
			}
			System.out.print("\n");  // spacing between the two patterns
		}
		
		{
			System.out.println("Pattern C"); /* for the pattern "C" in the question */
		}
		for (int b=1; b<=a; b++) {  /* initializing "b" for the spacing on the left side */
			for (int c=b; c<a; c++) {
				System.out.print("  ");
			}
			for (int d=b; d>=1; d--) {  /* displaying the pattern of the numbers */
				System.out.printf("%-2d", d);
			}
			System.out.print("\n");	 // spacing between the two patterns
			}

		{
			System.out.print("\n"); // spacing between the two patterns
			System.out.println("Pattern D"); /* for the pattern "D" in the question */
		}
		for (int b=6; b>=0; b--) { /* initializing "b" for the spacing on the left side */
			for (int c=b; c<a; c++) {
				System.out.print("  ");
			}
			for (int d=1; d<=b; d++) {  /* displaying the pattern of the numbers */
				System.out.printf("%-2d", d);
			}
			System.out.print("\n");	 // final spacing of pattern "D"
			}
		
	}

}
