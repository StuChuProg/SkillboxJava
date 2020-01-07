import java.math.RoundingMode;

public class Loader {
    public static void main(String[] args) {
        int[] patient = new int[30];
        double min = 32;
        double max = 40;
        double averageTemperature=0;
        int healthyPatients = 0;
        double mH = 36.2;
        double maxH = 36.9;

        for (int i = 0; i < patient.length; i++) {
            double temperature = (min + (Math.random() * (max - min)));
//double temperatureP = DoubleRounder.round(temperature, 3);

           averageTemperature = averageTemperature+temperature;
           if ((temperature > mH) && (temperature < maxH)){
                healthyPatients++;
            }

            System.out.println(temperature);
        }
        System.out.println("Средняя температура пациентов по больнице - " + averageTemperature/30);
        System.out.println("Количество здоровых пациентов - " + healthyPatients);
    }
}

