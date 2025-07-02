import java.util.*;

class UniqueSortedIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>(); // TreeSet automatically sorts and removes duplicates

        // Accepting integers from the user
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num); // Adding to TreeSet will automatically remove duplicates
        }

        // Displaying integers in sorted order
        System.out.println("Integers in sorted order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Searching for a particular element
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        if (numbers.contains(searchElement)) {
            System.out.println(searchElement + " is found in the collection.");
        } else {
            System.out.println(searchElement + " is not found in the collection.");
        }

        scanner.close();
    }
}
