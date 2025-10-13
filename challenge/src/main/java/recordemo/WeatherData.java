package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        //
        double temperaturefahrenheit = (temperatureCelsius * 9/5) + 32;
        return temperaturefahrenheit;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        //
        String output = "Current weather: "+ this.temperatureCelsius+"°C("+temperatureFahrenheit()+") and "+this.conditions;
        return output;
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        //
        double celsius = (double)5/9 * (tempFahrenheit - 32);
        return  new WeatherData(celsius, conditions);
    }

    public static void main(String[] args) {

        WeatherData weather1 = new WeatherData(22.5, "Sunny");
        System.out.println(weather1.getSummary());

        WeatherData weather2 = WeatherData.fromFahrenheit(86, "Partly Cloudy");
        System.out.println(weather2.getSummary());

        System.out.println("Température en °C : " + weather2.temperatureCelsius());
        System.out.println("Température en °F : " + weather2.temperatureFahrenheit());
    }
}