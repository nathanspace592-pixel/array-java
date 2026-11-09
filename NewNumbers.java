import java.util.Scanner;

public class NewNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = -1;
        }

        
        int count = 0;
        System.out.println("Please enter 10 numbers between 10 and 100 (inclusive):");
        
        while (count < 10) {
            System.out.printf("Enter number %d: ", count + 1);
            int num = input.nextInt();

           
            if (num >= 10 && num <= 100) {
                numbers[count] = num;
                count++;
            } else {
                System.out.println("Invalid input! Number must be between 10 and 100. Try again.");
            }
        }

        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == -1) {
                continue;
            }
            
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = -1; // Mark duplicate as empty
                }
            }
        }

        
        System.out.println("\nArray contents after eliminating duplicates:");
        boolean first = true;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != -1) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(numbers[i]);
                first = false;
            }
        }
        System.out.println(); 
        
        input.close();
    }
}
