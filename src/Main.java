cdimport java.util.Scanner;

//public class Main {
//
//    private static Scanner s = new Scanner(System.in);
//    private static int[] baseData = new int[10];
//
//    public static void main(String[] args) {
//        System.out.println("Enter 10 integers:");
//        getInput();
//        printArray(baseData);
//        resizeArray();
////        System.out.println("Enter 12 integers:");
////        getInput();
//        baseData[10] = 12;
//        baseData[11] = 1234;
////        baseData[10] = 67;
////        baseData[11] = 34;
//        printArray(baseData);
//
//    }
//
//    private static void getInput()
//    {
//        for(int i = 0; i < baseData.length; i++)
//            baseData[i] = s.nextInt();
//    }
//
//    private static void printArray(int[] arr)
//    {
//        for(int i = 0; i < arr.length; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
//
//    private static void resizeArray()
//    {
//        int[] original = baseData;
//
//        baseData = new int[12];
//        for (int i = 0; i < original.length; i++)
//            baseData[i] = original[i];
//    }
//
//}
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery Items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item.");
        System.out.println("\t 4 - To remove an Item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");

    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());

    }

    public  static void modifyItem() {
        System.out.print("Please enter item number: ");
        int position = scanner.nextInt();
        System.out.print("Please enter replacement item: ");
        String item = scanner.nextLine();
        groceryList.modifyGroceryItem(scanner.nextInt(), item);
    }

    public static void searchForItem() {
        System.out.print("Please enter the item to search for: ");
        String search = scanner.nextLine();
        String searchReturn = groceryList.findItems(search);
        if(searchReturn != null) {
            System.out.println("Found '" + searchReturn + "' in our shopping list.");
        } else {
            System.out.println("Search " + search + " returned empty.");
        }
    }

    public static void printList() {
        groceryList.printGroceryList();
    }

    public static void removeItem() {
        System.out.print("Please enter the item number: ");
        groceryList.removeGroceryItem(scanner.nextInt() - 1);

    }




}

