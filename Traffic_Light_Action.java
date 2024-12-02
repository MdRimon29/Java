/*Traffic Light Action
Problem Statement: Determine actions based on traffic light colors and the presence of pedestrians. 
The rules are:

Green light: "Drive" if no pedestrian is waiting, "Slow down" if a pedestrian is waiting.
Yellow light: "Prepare to stop", regardless of pedestrians.
Red light: "Stop", regardless of pedestrians.
*/

import java.util.*;
public class Traffic_Light_Action {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String lightColor = sc.nextLine (); // Traffic light color
        boolean isPedestrianWaiting = true; // Is a pedestrian waiting?

        if ("Green".equals(lightColor)) {
            if (isPedestrianWaiting) {
                System.out.println("Slow down");
            } else {
                System.out.println("Drive");
            }
        } else if ("Yellow".equals(lightColor)) {
            System.out.println("Prepare to stop");
        } else if ("Red".equals(lightColor)) {
            System.out.println("Stop");
        }
    }
}