
public class Calculator {
	
	public static void main(String[] args) {

	    double first = 10;
	    double second = 20;

	    
	    char operator = '+';

	    double result;

	    switch (operator) {
	      case '+':
	        result = first + second;
	        break;

	      case '-':
	        result = first - second;
	        break;

	      case '*':
	        result = first * second;
	        break;

	      case '/':
	        result = first / second;
	        break;

	      default:
	        System.out.printf("Error! operator is not correct");
	        return;
	    }

	    System.out.println(first + " " + operator + " " + second + " = " + result);
	  }


}
