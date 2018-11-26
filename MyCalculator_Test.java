public class MyCalculator_Test{
  private static MyCalculator calc = new MyCalculator();

  private static boolean test_StartValueOffFirstNumber(){
    double temp = calc.getFirstNumber();
    if(10 == temp){
      return true;
    }
    return false;
  }

  public static void main(String[] args){
    if(test_StartValueOffFirstNumber()){
      System.out.println("test_StartValueOffFirstNumber: " + "PASSED");
    } else{
      System.out.println("test_StartValueOffFirstNumber: " + "FAILED");
    }

  } //main
} //class
