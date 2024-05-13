import java.util.*;
public class GroceryList {
    private ArrayList<String> groceries = new ArrayList<>();

    public GroceryList(ArrayList<String> groceries) {
        this.groceries = groceries;
    }

    public GroceryList() {
        groceries.clear();
    }

    public ArrayList<String> getGroceries() {
        return groceries;
    }

    public void setGroceries(ArrayList<String> groceries) {
        this.groceries = groceries;
    }

    public void addGrocery(String name) {
        groceries.add(name.toLowerCase());
    }

    public boolean contains(String name) {
        for (String grocery : groceries) {
            if(grocery.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void formatPrint() {
        for(int i=1;i<=groceries.size();i++){
            System.out.println("Entry "+i+".\n\t"+groceries.get(i-1));
        }
    }
    static int MAX = 100;
    public void sortPrint()
    {
        String[] arr = groceries.toArray(new String[groceries.size()]);

        int n = arr.length;
        String temp;

        // Sorting strings using bubble sort
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (arr[j].compareTo(arr[i]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i=1;i<=arr.length;i++){
            System.out.println("Entry "+i+".\n\t"+arr[i-1]);
        }
    }

}


