package tempAverage;
import java.util.ArrayList;
import java.util.Scanner;

public class TempAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter the temperature for " + getDayOfWeek(i) + ": ");
            double temperature = scanner.nextDouble();
            scanner.nextLine();
            days.add(getDayOfWeek(i));
            temperatures.add(temperature);
        }

        System.out.println("Temperature for each day:");
        for (int i = 0; i < 7; i++) {
            System.out.println(days.get(i) + ": " + temperatures.get(i) + " degrees");
        }

        double sum = 0;
        for (double temperature : temperatures) {
            sum += temperature;
        }
        double weeklyAverage = sum / temperatures.size();
        System.out.println("Weekly average temperature: " + weeklyAverage + " degrees");

        
        System.out.print("\nEnter 'week' to see the temperature for each day and the weekly average: ");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("week")) {
        	System.out.println("\nTemperature for each day: ");
        	for (int i = 0; i < 7; i++) {
        		System.out.println(days.get(i) + ": " + temperatures.get(i) + "degress");
        	}
        	System.out.println("weekly average temperature: " + weeklyAverage + " degrees");
        }
        
        scanner.close();
    }

    public static String getDayOfWeek(int dayIndex) {
        switch (dayIndex) {
            case 0: return "Monday";
            case 1: return "Tuesday";
            case 2: return "Wednesday";
            case 3: return "Thursday";
            case 4: return "Friday";
            case 5: return "Saturday";
            case 6: return "Sunday";
            default: return "";
        }
    }
}
