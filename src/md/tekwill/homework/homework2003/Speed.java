package md.tekwill.homework.homework2003;

public class Speed {
    public static void main(String[] args) {
        //Test Data
        float distanceMeters = 2500;
        float timeHours = 5;
        float timeMinutes = 56;
        float timeSeconds = 23;
            //Conversion
            float meterSeconds = distanceMeters / (timeHours *  3600 + timeMinutes * 60 + timeSeconds);
            float kilometersHour = (distanceMeters / 1000) / (timeHours + timeMinutes/60 + timeSeconds/3600);
            float milesHour = (distanceMeters / 1609) / (timeHours + timeMinutes/60 + timeSeconds/3600);
        //Output
        System.out.println("Your speed in meters/second is " + meterSeconds);
        System.out.println("Your speed in kilometers/hour is " + kilometersHour);
        System.out.println("Your speed in miles/hour is " + milesHour);

    }
}
