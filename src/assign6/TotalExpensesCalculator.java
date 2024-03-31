package assign6;
import java.util.Scanner;

public class TotalExpensesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input quantity and price per item
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();
        
        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();
        
        double totalExpenses;
        
        // Calculate total expenses based on the quantity and price per item
        if (quantity > 50) {
            totalExpenses = quantity * pricePerItem * 0.9; // 10% discount
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses = quantity * pricePerItem * 0.95; // 5% discount
        } else {
            totalExpenses = quantity * pricePerItem; // No discount
        }
        
        // Print total expenses
        System.out.println("Total expenses: " + totalExpenses);
        
        scanner.close();
    }
}
i


