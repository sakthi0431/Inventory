import java.util.Scanner;
public class SalesCalculator
    {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items sold: ");
        int numberOfItems = scanner.nextInt();
        double totalSales = 0;
        for (int i = 1; i <= numberOfItems; i++) 
        {
            System.out.println("Enter the price of item " + i + ": ");
            double price = scanner.nextDouble();
            System.out.println("Enter the quantity of item " + i + ": ");
            int quantity = scanner.nextInt();
            totalSales += price * quantity;
        }
        System.out.println("Total sales amount: $" + totalSales);

        scanner.close();
    }
}
