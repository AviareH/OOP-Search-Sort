import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WeatherDatabase list = new WeatherDatabase();
        int numsOfitems;
        while(true) {
            System.out.print("How Many Entries: ");
            try {
                numsOfitems = input.nextInt();
                if(numsOfitems > 0) {
                    for (int i = 1; i <= numsOfitems; i++) {
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
                } else{
                    System.out.println("Number Must be Greater Than 0");
                }
            } catch(InputMismatchException e) {
                System.out.println("Please Enter an Integer");
                input.nextLine();
            }
        }
        list.formatPrint();
    }

}

// import java.util.ArrayList;
//
//class Weather {
//    String name;
//    double temperature;
//    double chanceOfRain;
//
//    public Weather(String name, double temperature, double chanceOfRain) {
//        this.name = name;
//        this.temperature = temperature;
//        this.chanceOfRain = chanceOfRain;
//    }
//
//    @Override
//    public String toString() {
//        return name + ": Temperature - " + temperature + ", Chance of Rain - " + chanceOfRain;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Weather> weatherList = new ArrayList<>();
//        weatherList.add(new Weather("City1", 25.5, 0.3));
//        weatherList.add(new Weather("City2", 20.0, 0.5));
//        weatherList.add(new Weather("City3", 30.0, 0.2));
//
//        // Sorting the ArrayList based on temperature using Merge Sort
//        mergeSort(weatherList, 0, weatherList.size() - 1);
//
//        // Printing the sorted ArrayList
//        for (Weather weather : weatherList) {
//            System.out.println(weather);
//        }
//    }
//
//    private static void mergeSort(ArrayList<Weather> arr, int l, int r) {
//        if (l < r) {
//            int m = (l + r) / 2;
//            mergeSort(arr, l, m);
//            mergeSort(arr, m + 1, r);
//            merge(arr, l, m, r);
//        }
//    }
//
//    private static void merge(ArrayList<Weather> arr, int l, int m, int r) {
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        ArrayList<Weather> L = new ArrayList<>(n1);
//        ArrayList<Weather> R = new ArrayList<>(n2);
//
//        for (int i = 0; i < n1; ++i)
//            L.add(arr.get(l + i));
//        for (int j = 0; j < n2; ++j)
//            R.add(arr.get(m + 1 + j));
//
//        int i = 0, j = 0;
//        int k = l;
//        while (i < n1 && j < n2) {
//            if (L.get(i).temperature >= R.get(j).temperature) {
//                arr.set(k, L.get(i));
//                i++;
//            } else {
//                arr.set(k, R.get(j));
//                j++;
//            }
//            k++;
//        }
//
//        while (i < n1) {
//            arr.set(k, L.get(i));
//            i++;
//            k++;
//        }
//
//        while (j < n2) {
//            arr.set(k, R.get(j));
//            j++;
//            k++;
//        }
//    }
//}
