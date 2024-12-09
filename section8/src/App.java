import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product p1 = new Product();

        System.out.println("Enter product data:");
        System.out.println("Name: ");
        p1.name = sc.nextLine();
        System.out.println("Price: ");
        p1.price = sc.nextDouble();     
        System.out.println("Quantity: ");
        p1.quantity = sc.nextInt();     
        
        System.out.println(p1); // chama o método toString();

        sc.close();
    }
}
