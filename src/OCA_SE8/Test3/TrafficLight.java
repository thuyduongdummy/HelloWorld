package OCA_SE8.Test3;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight {
    public static void main(String[] args) {
        int $ = 80000;
        List<String> trafficLight = new ArrayList<>();
        trafficLight.add(1, "RED");
        trafficLight.add(2, "ORANGE");
        trafficLight.add(3, "GREEN");

       trafficLight.remove(new Integer(2));

        System.out.println(trafficLight);
    }
}
