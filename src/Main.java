import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import itens.Client;
import itens.OrderItem;
import itens.Product;
import itens.Order;
import entities.OrderStatus;
public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order? ");
        int N = sc.nextInt();
        for (int i=0; i<N; i++) {
            System.out.println("Enter #" + (i + 1) +  " item data ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double ProductPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, ProductPrice);

            OrderItem it = new OrderItem(quantity, ProductPrice, product);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);

sc.close();

        }
    }
