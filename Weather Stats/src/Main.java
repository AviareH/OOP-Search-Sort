import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WeatherDatabase list = new WeatherDatabase();
        int numsOfItems;
        while (true) {
            System.out.print("How Many Entries: ");
            try {
                numsOfItems = input.nextInt();
                if (numsOfItems > 0) {
                    for (int i = 1; i <= numsOfItems; i++) {
                        System.out.println("Entry " + i + ".");
                        System.out.print("\tDay: ");
                        String dayName = input.next();
                        System.out.print("\tTemperature: ");
                        double temperature = input.nextDouble();
                        System.out.print("\tWill Rain: ");
                        boolean willRain = input.nextBoolean();
                        list.addStats(dayName, temperature, willRain);
                    }
                    break;
                } else {
                    System.out.println("Number Must be Greater Than 0");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please Enter an Integer");
                input.nextLine();
            }
        }
        list.formatPrint();
        WeatherDatabase.mergeSort(0, list.getWeather().size() - 1);
        System.out.println("---------------SORTED------------------");
        list.formatPrint();
        list.flip();

        while (true) {
            System.out.print("Search For (-2 to Exit): ");
            try {
                double lookFor = input.nextDouble();
                if (lookFor == -2) {
                    System.out.println("Aborted\n");
                    break;
                }
                int index = list.binarySearch(lookFor);
                if (index != -1) {
                    String name = list.getWeather().get(index).getDayName();
                    double temperature = list.getWeather().get(index).getTemperature();
                    boolean willRain = list.getWeather().get(index).getWillRain();
                    System.out.println("Found");
                    System.out.println(name + ": " + temperature + "°. Will Rain: " + willRain);
                } else {
                    System.out.println("Not Found");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please Enter a Valid Number");
                input.nextLine();
            }
        }
    }
}