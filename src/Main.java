public class Main {

    public static void main(String[] args) {

        // my answer:
        int myIntValue = 200;
        double myTotalValue = 0.45359237d * (myIntValue);

        System.out.println(myTotalValue);

        // tim's answer:

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms = " + convertedKilograms);

    }
}