public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    lemonadeStand.increasePrice(1.5);
    System.out.println(lemonadeStand.price);
  }
}

//------------------------------
// Returns

// Remember, variables can only exist in the scope that they were declared in. We can use a value outside of the method it was created in if we return it from the method.

// We return a value by using the keyword return:

// public int numberOfTires() {
//    int tires = 4;
//    // return statement
//    return tires;
// }
//-----------------------------------
// public class Store {
//   // instance fields
//   String productType;
//   double price;
  
//   // constructor method
//   public Store(String product, double initialPrice) {
//     productType = product;
//     price = initialPrice;
//   }
  
//   // increase price method
//   public void increasePrice(double priceToAdd){
//     double newPrice = price + priceToAdd;
//     price = newPrice;
//   }
  
//   // get price with tax method
//   public double getPriceWithTax(){
//     double totalPrice = price + price * 0.08;
//     return totalPrice;
//   }

//   // main method
//   public static void main(String[] args) {
//     Store lemonadeStand = new Store("Lemonade", 3.75);
//     double lemonadePrice = lemonadeStand.getPriceWithTax();
//     System.out.println(lemonadePrice);
//   }
// }