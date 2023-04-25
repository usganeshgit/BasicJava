public class Testcases {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculator cl = new Calculator(6,3);
      if(cl.sum(6,3)==9)
      {
    	  System.out.print("Sum Executed successfully");
      }
      if(cl.multiply(6,3)==18)
      {
    	  System.out.print("Multiply Executed successfully");
      }
      if(cl.division(6,3)==2)
      {
    	  System.out.print("division Executed successfully");
      }
      if(cl.subtract(6,3)==3)
      {
    	  System.out.print("Subtract Executed successfully");
      }
}
