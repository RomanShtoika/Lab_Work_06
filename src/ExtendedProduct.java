import java.util.Scanner;
public class ExtendedProduct extends Product {
    private String manufacturer;
    private String description;

    public void enterExtendedData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the manufacturer: ");
        manufacturer = scanner.nextLine();

        System.out.print("Enter the description: ");
        description = scanner.nextLine();
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Description: " + description);
    }

    public static void main(String[] args) {
        ExtendedProduct extendedProduct = new ExtendedProduct();

        // Введення даних про товар
        extendedProduct.enterData();
        extendedProduct.enterExtendedData();

        // Виведення даних про товар
        System.out.println("\nProduct Details:");
        extendedProduct.displayData();

        // Зниження ціни на 50%
        extendedProduct.reducePrice();

        // Виведення оновлених даних про товар
        System.out.println("\nUpdated Product Details:");
        extendedProduct.displayData();
    }
}

