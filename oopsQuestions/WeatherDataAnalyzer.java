import java.util.*;

public class WeatherDataAnalyzer {
    public static void main(String[] args) {
        float[][] data = new float[7][24]; // random demo values
        Random rand = new Random();
        for (int i=0;i<7;i++) for (int j=0;j<24;j++) data[i][j] = 20 + rand.nextFloat()*15;

        int hottestDay = 0, coldestDay = 0;
        float maxAvg = -999, minAvg = 999;

        for (int i=0;i<7;i++) {
            float sum=0;
            for (int j=0;j<24;j++) sum+=data[i][j];
            float avg = sum/24;
            System.out.println("Day " + (i+1) + " avg temp: " + avg);
            if (avg>maxAvg){ maxAvg=avg; hottestDay=i; }
            if (avg<minAvg){ minAvg=avg; coldestDay=i; }
        }

        System.out.println("Hottest Day: " + (hottestDay+1));
        System.out.println("Coldest Day: " + (coldestDay+1));
    }
}
