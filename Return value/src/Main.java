// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public  static  double subtotal;

    public static void main(String[] args) {
        subtotal =15.00;

        System.out.println("Subtotal: " + subtotal);

       double total = subtotal + calculateTax(0.08,subtotal);

       System.out.println("Total: " + total);
        }

        public  static  double  calculateTax(double taxRate, double amountToTax)
        {
            double tax = amountToTax *taxRate;
            System.out.println("Tax: " + tax);
            return  tax;
    }
}