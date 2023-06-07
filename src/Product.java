import java.util.Scanner;

public class Exercise_5 {
    private String name;
    private double price;
    private int warrantyPeriod;

    public void enterData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the product name: ");
        name = scanner.nextLine();

        System.out.print("Enter the product price: ");
        price = scanner.nextDouble();

        System.out.print("Enter the warranty period (in months): ");
        warrantyPeriod = scanner.nextInt();
    }

    public void displayData() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }

    public void reducePrice() {
        price = price * 0.5;
        System.out.println("Price reduced by 50%!");
    }

    public static void main(String[] args) {
        Exercise_5 product = new Exercise_5();

        // Введення даних про товар
        product.enterData();

        // Виведення даних про товар
        System.out.println("\nProduct Details:");
        product.displayData();

        // Зниження ціни на 50%
        product.reducePrice();

        // Виведення оновлених даних про товар
        System.out.println("\nUpdated Product Details:");
        product.displayData();
    }
}
