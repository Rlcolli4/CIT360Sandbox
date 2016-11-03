
public class calculatorForjunit {
	  public double evaluate(String expression) {
		    double sum = 0;
		    for (String summand: expression.split("\\+"))
		      sum += Double.valueOf(summand);
		    return sum;
		  }
	  
	  public double subtract(String expression) {
		    double dif = 0;
		    for (String summand: expression.split("\\-"))
		      dif -= Double.valueOf(summand);
		    return dif;
		  }
	  
}
