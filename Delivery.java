import java.util.Scanner;
public class Delivery
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Delivery ID: ");
        String deliveryId = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter Delivery Address: ");
        String deliveryAddress = scanner.nextLine();
        System.out.print("Enter Delivery Status: ");
        String deliveryStatus = scanner.nextLine();
        System.out.print("Enter Delivery Date: ");
        String deliveryDate = scanner.nextLine();
        Delivery delivery = new Delivery (deliveryId, customerName, deliveryAddress, deliveryStatus, deliveryDate);
        System.out.println("\nDelivery Details:");
        System.out.println(delivery);
    }
}