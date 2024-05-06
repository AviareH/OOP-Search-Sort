import java.util.*;
public class GroceryList {
    private HashMap<String, Double> groceries = new HashMap<String, Double>();

    public GroceryList(HashMap<String, Double> groceries) {
        this.groceries = groceries;
    }

    public GroceryList() {
        groceries.clear();
    }

    public HashMap<String, Double> getGroceries() {
        return groceries;
    }

    public void setGroceries(HashMap<String, Double> groceries) {
        this.groceries = groceries;
    }

    public void addGrocery(String name, double weight) {
        groceries.put(name, weight);
    }

    public boolean contains(String name) {
        for (Map.Entry<String, Double> entry : groceries.entrySet()) {
            if (Objects.equals(entry.getKey(), name)) {
                return true;
            }
        }
        return false;
    }

    public void formatPrint(){
        int index = 1;
        for (Map.Entry<String, Double> entry : groceries.entrySet()){
            System.out.println(index+". \n\tName: "+entry.getKey());
            System.out.println(String.format("\tWeight:  %.2f", entry.getValue())+" Kg");
            index++;
        }
    }

    public void sortPrint(){

    }
    static void bubbleSort(HashMap<String, Double> list, int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (list. > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }
}
