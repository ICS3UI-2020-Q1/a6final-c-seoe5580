import java.util.Scanner;
/**
 * This program determines deck count
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user to input 5 integers
    System.out.println("Please enter the value of 5 cards:");

    // sets up arrays for amount of data
    int[] num = new int[5];
    int[] lowNum = new int[5];
    int[] highNum = new int[5];
    
    // declares a variable for future calculations
    int lowNumActual = 2;
    int highNumActual = 10;
    int answer = 0;

    // sets the lowNums value to more than one number
    for(int i = 0; i < lowNum.length; i++){
      lowNum[i] = lowNumActual;
      lowNumActual = lowNumActual + 1;
    }

    // sets the highNums value to more than one number
    for(int i = 0; i < highNum.length; i++){
      highNum[i] = highNumActual;
      highNumActual = highNumActual + 1;
    }

    // gets the user's input and calculates the answer
    for(int i = 0; i < num.length; i++){
      num[i] = input.nextInt();
      for(int j = 0; j < num.length; j++){
        if(num[i] == lowNum[j]){
        answer = answer + 1;
        }else if(num[i] == highNum[j]){
        answer = answer - 1;
        }else{
        answer = answer + 0;
        }
      }
    }

    // prints out the answer
    System.out.println("The count would be " + answer);
  }
}