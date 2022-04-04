public class week3Assignment {
 
  public static void main(String[] args) {
   
/* Question 1: 
 * Create an array of int called ages contains these values: 3, 9, 23, 64, 2, 8, 28, 93.
 */
    int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
   
// 1a: Subtract first element from the last element
    
    int subtractionOfLastElementFromFirstElementA = (ages [ages.length - 1] - ages [0]);
    
    System.out.println(subtractionOfLastElementFromFirstElementA);

// 1b: Add new age to array and repeat step 1a
    
    ages [ages.length - 1] = 29;
    
    int subtractionOfLastElementFromFirstElementB = (ages [ages.length - 1] - ages [0]);
    
    System.out.println(subtractionOfLastElementFromFirstElementB);
    
// 1c: Use loop to iterate through the array and calculate the average age. Print. 
    
    double sum = 0;
    
    for(int x : ages) {
      sum += x;
      
    }
    
    System.out.println(sum/ages.length);
    
/* Question 2: 
 * Create an array of String called names.
 * Contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
 */
    System.out.println("\nQuestion #2(a-b):");
    
    String[] names = {"Sam" + " " + "Tommy" + " " + "Tim" + " " + "Sally" + " " + "Buck" + " " + "Bob"};
       
// 2a: Use a loop to iterate through the array & calculate the average number of letters per name. Print.
    
    int sum2 = 0; 
    
    for(String str : names) {
      sum2 += str.length();
      
    }
    
    System.out.println(sum2 / names.length);
    
// 2b: Use a loop to iterate through the array again & concatenate all the names together, separated by spaces, & print.
    
    String sumOfNames = "";
    
    for (String str : names) {
      sumOfNames += str + "";
      
    }
    
    System.out.println(sumOfNames);
    
/* Question 3: 
 * How do you access the last element of an array?
 */
    System.out.println("\nQuestion #3:");
    System.out.println("array[array.length - 1];");
    
/* Question 4: 
 * How do you access the first element of an array?
 */
    
    System.out.println("\nQuestion #4:");
    System.out.println("array[0];");
    
/* Question 5: 
 * Create a new array of int called nameLengths.
 * Write a loop to iterate over the previously created names array.
 * Add length to each name to the nameLengths array.
 */
    
    System.out.println("\nQuestion #5:");
    
    int[] nameLengths = new int[names.length];
    
    for (int i = 0; i < names.length; i++) {
      nameLengths[i] = names[i].length();
      
    }
    
    for (int x :nameLengths) {
      System.out.println(x);
      
    }
    
/* Question 6: 
 * Write a loop to iterate over the nameLengths array.
 * Calculate the sum of all the elements in the array. 
 * Print.
 */
    
    System.out.println("\nQuestion #6:");
    
    double sum3 = 0;
    
    for(int x : nameLengths) {
      sum3 += x;
      
    }
    
    System.out.println(sum3);
      
/* Question 7:
 * Write a method that takes a String, word, and an int, n, as arguments.
 * Return the word concatenated to itself n number of times.
 */
    
    System.out.println("\nQuestion #7:");
    
    System.out.println(multiplyString("HiHiHi", 3));
    
/* Question 8:
 * Write a method that takes two Strings, firstName & lastName.
 * Returns a full name.  
 */
    
    System.out.println("\nQuestion #8:");
 
    System.out.println(createFullName("Nanami", "Kento"));
    
/* Question 9:
  * Write a method that takes an array of int. 
  * Returns true if the sum of all ints in the array is > 100.
  */
    
    System.out.println("\nQuestion #9:");
    
    System.out.println(sumOfNumbersGreaterThan100(nameLengths));
    
/* Question 10:
 * Write a method that takes array double and returns the average of all elements in the array.
 */
    
    System.out.println("\nQuestion #10:");
    
    double[] doubleElementsArray = {3.33, 1.23, 4.44, 2.21, 9.99, 7.56};
    
    System.out.println(averageDoubleElements(doubleElementsArray));
    
/* Question 11:
 * Write a method that takes two arrays of double.
 * Returns true if the average in first array > second array.
 */
    
    System.out.println("\nQuestion #11:");
    
    double[] doubleElemetsArray2 = {9.22, 23.23, 4.03, 33.22, 20.22, 1.21};
    
    System.out.println(firstArrGreaterAverageorLess(doubleElementsArray, doubleElemetsArray2));
    
/* Question 12:
 * Write a method called willBuyDrink that takes a boolean isHotOutside,
 * and a double if moneyInPocket is greater than 10.50.
 */
    
    System.out.println("\nQuestion #12:");
    
    boolean isHotOutside = true;
    double moneyInPocket = 12.12;
    
    System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
    
/* Question 13: 
 * Create a method that solves a problem. 
 * In comments, write what the method does and why you created it.  
 */
    
    System.out.println("\nQuestion #13:");
    
    boolean willPassClass = false;
    int num = 50;
    
    System.out.println(willPassClass);   
  }
      
// End of main method
    
// Methods under this comment.
    
//Question 7 Method

public static String multiplyString(String str, int n) {
  String result = "";
  
  for (int i = 0; i < n; i++) {
    result += str;
    
  }
   
  return str;
  
} 

//Question 8 Method

public static String createFullName(String firstName, String lastName) {
  String fullName = firstName + " " + lastName;
    return fullName;
}

//Question 9 Method

public static boolean sumOfNumbersGreaterThan100(int [] arr) {
  int sum = 0; 
  
  for (int i : arr) {
    sum += i;
    
    if (sum > 100) {
      return true; 
    }
  }
  return false;
}
//Question 10 Method 

    public static double averageDoubleElements(double[] arr) {
      double sum = 0;
      
      for(double i : arr) {
        sum += i;       
      }
      return sum / arr.length;
    }
  
//Question 11 Method
    
    public static boolean firstArrGreaterAverageorLess(double[] arr1, double[] arr2) {
      double sum1 = 0;
      double sum2 = 0;
      
      for (double x1 : arr1) {
        sum1 += x1;
      }
      for (double x2 : arr2) {
        sum2 += x2;       
      }
      if ((sum1 / arr1.length) > (sum2 / arr2.length)) {
        return true;
      }
      return false;
    }
  
//Question 12 Method
    
    public static boolean willBuyDrink(boolean arg, double num) {
      if (arg == true && num > 10.50) {
        return true;        
      }
      return false;
    }
//Question 13 Method

    public static boolean willPassClass(int num) {
      if (num >= 75) { //Determines if class will be passed or not
        return true;
      }
      return false;
    }
    
}// End of main class