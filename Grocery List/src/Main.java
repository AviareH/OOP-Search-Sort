import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GroceryList list = new GroceryList();
        int numsOfitems;
        while(true) {
            System.out.print("How Many Entries: ");
            try {
                numsOfitems = input.nextInt();
                if(numsOfitems > 0) {
                    for (int i = 1; i <= numsOfitems; i++) {
                        System.out.println("Entry " + i + ".");
                        System.out.print("\tName: ");
                        String name = input.next();
                        System.out.print("\tWeight: ");
                        double weight = input.nextDouble();
                        list.addGrocery(name, weight);
                    }
                    break;
                } else{
                    System.out.println("Number Must be Greater Than 0");
                }
            } catch(InputMismatchException e) {
                System.out.println("Please Enter an Integer");
                input.nextLine();
            }
        }

        System.out.println("\n-----SEARCH-----");

        while(true){
            System.out.print("Search For (0 to Exit): ");
            String lookFor = input.next();
            if(lookFor.equals("0")){
                System.out.println("Aborted\n");
                break;
            } else if(!list.contains(lookFor)){
                System.out.println("Not Found");
                System.out.println("Would You Like To Add It?");
                System.out.print("Y/N: ");
                String choice = input.next();
                if(choice.equals("Y")){
                    System.out.print("Weight: ");
                    double weight = input.nextDouble();
                    list.addGrocery(lookFor,weight);
                    System.out.println("Added to List\n");
                }
                else{
                    break;
                }
            }
            System.out.println("Found "+lookFor);
        }

        list.formatPrint();
    }
}
