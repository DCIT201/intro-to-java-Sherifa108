import java.util.Scanner;
public class TemperatureConverter {
    Public Station void main(String[]args)
    {Scanner scanner = new
    Scanner (System.in);
    
    System.out.printIn("Choose an option:");
    System.out.printIn("1. Convert Celsius to Fahrenheit");
    System.out.printIn(2. Convert Fahrenheit to Celsius);
    System.out.print("Enter your choice(1 or 2):");
    
    int choice = scanner.nextInt();

    System.out.print("Enter the temperature value");
    double temperature = scanner.nextDouble();

    double converterTemperature;

    if (choice==1){
        convertedTemperature=
        celsiustoFahrenheit(temperature);
        System.out.printIn(temperature + "degrees Celsius is equal to" +convertedTemperature + "degrees Fahrenheit.");
    }   else if (choice==2){
        convertedTemperature=
        FahrenheittoCelsius(temperature);
        System.out.printIn(temperature + "degrees Fahrenheit is equal to" + convertedTemperature + "degrees Celsius.");
    }   else{
        System.out.printIn("Invalid choice.");
    }
    scanner.close();
    }

    public static double
    celsiustoFahrenheit(double celsius) {
        return (celsius*9/5) + 32;
    }

    public static double
    fahrenheittoCelsius(double fahrenheit){
        return (fahrenheit - 32)*5/9;
    }
}