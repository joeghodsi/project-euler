/**
 * @author EvoFusion
 *
 */
public final class ProjectEuler {

   public static void main(String[] args) {
      System.out.println(sumOfMultiplesOf3And5(20));
   }
	
	/**
	 * Problem 1
	 * Find the sum of all the multiples of 3 or 5 below a given ceiling.
	 * 
	 * @param ceiling All multiples in the sum must be less than ceiling
	 */
	public static int sumOfMultiplesOf3And5(int ceiling) {
		int sum = 0, i = 0, mult3 = 0;
		
		for(i = 1; i*5 < ceiling; i++) {
			sum += i*5;
			mult3 = i*3;
			if(mult3%5 != 0)
				sum += mult3;
		}
		
		for(; i*3 < ceiling; i++) {
			mult3 = i*3;
			if(mult3%5 != 0)
				sum += mult3;
		}
		
		return sum;
	}
}
