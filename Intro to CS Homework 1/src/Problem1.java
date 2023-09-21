public class Problem1 {

    // Uses the value of a double representing a temperature value in Fahrenheit and outputs the value in
    // both Fahrenheit and Celsius.
    public String calculateTemperature(double fahrenheit) {
        double celsius = ((fahrenheit - 32) * 5) / 9;
        return "Temp in Fahrenheit: " + fahrenheit + ", Temp in Celsius: " + celsius;
    }

    // -----------------------------------
    // main method -- executes the calculateTemperature method with various test temperatures
    // on an instance of the class and prints the output.
    // -----------------------------------
    public static void main(String[] args) {
        Problem1 temp = new Problem1();
        String test1 = temp.calculateTemperature(36.5);
        System.out.println(test1);
        String test2 = temp.calculateTemperature(0.5545);
        System.out.println(test2);
        String test3 = temp.calculateTemperature(-2267);
        System.out.println(test3);
        String test4 = temp.calculateTemperature(0.0);
        System.out.println(test4);
        String test5 = temp.calculateTemperature(4);
        System.out.println(test5);
    }
}
