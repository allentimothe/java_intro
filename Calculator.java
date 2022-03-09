//Basic Calculator Operations
public class Calculator{
  public Calculator(){

  }
  public int add(int a, int b){
    int sum = a + b;
    return sum;
  }
  public int subtract(int a, int b){
    int difference = a - b;
    return difference;
  }
  public int multiply(int a, int b){
    int product = a * b;
    return product;
  }
  public int divide(int a, int b){
    int divided = a / b;
    return divided;
  }
  public int modulo(int a, int b){
    int remainder = a % b;
    return remainder;
  }
public static void main(String[] args){
  Calculator myCalculator = new Calculator();
  System.out.println(myCalculator.add(5, 7));
  System.out.println(myCalculator.subtract(45, 11));
}
}