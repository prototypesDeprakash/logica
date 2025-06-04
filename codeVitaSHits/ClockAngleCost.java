public class ClockAngleCost {

    public static int calculateMinimumCost(int initialHour, int initialMinute, int targetAngle, 
                                           int hourCost, int minuteCost, int clockwiseCost, int counterclockwiseCost) {
        int minCost = Integer.MAX_VALUE;

        // Normalize the hour to 12-hour format
        initialHour %= 12;

        // Calculate the initial angles of hour and minute hands
        double initialHourAngle = (initialHour * 30) + (initialMinute * 0.5); // Hour hand moves 0.5 degrees per minute
        double initialMinuteAngle = initialMinute * 6;                       // Minute hand moves 6 degrees per minute

        // Try moving the minute hand
        for (int minuteDelta = 0; minuteDelta <= 60; minuteDelta++) {
            // Clockwise movement of minute hand
            double newMinuteAngle = (initialMinuteAngle + minuteDelta * 6) % 360;
            double resultingAngle = Math.abs(newMinuteAngle - initialHourAngle);
            resultingAngle = Math.min(resultingAngle, 360 - resultingAngle); // Smallest angle

            if (Math.abs(resultingAngle - targetAngle) < 1e-9) { // Target angle matched
                int cost = minuteDelta * minuteCost * clockwiseCost;
                minCost = Math.min(minCost, cost);
            }

            // Counterclockwise movement of minute hand
            newMinuteAngle = (initialMinuteAngle - minuteDelta * 6 + 360) % 360;
            resultingAngle = Math.abs(newMinuteAngle - initialHourAngle);
            resultingAngle = Math.min(resultingAngle, 360 - resultingAngle);

            if (Math.abs(resultingAngle - targetAngle) < 1e-9) {
                int cost = minuteDelta * minuteCost * counterclockwiseCost;
                minCost = Math.min(minCost, cost);
            }
        }

        // Try moving the hour hand
        for (int hourDelta = 0; hourDelta <= 12; hourDelta++) {
            // Clockwise movement of hour hand
            double newHourAngle = (initialHourAngle + hourDelta * 30) % 360;
            double resultingAngle = Math.abs(newHourAngle - initialMinuteAngle);
            resultingAngle = Math.min(resultingAngle, 360 - resultingAngle);

            if (Math.abs(resultingAngle - targetAngle) < 1e-9) {
                int cost = hourDelta * hourCost * clockwiseCost;
                minCost = Math.min(minCost, cost);
            }

            // Counterclockwise movement of hour hand
            newHourAngle = (initialHourAngle - hourDelta * 30 + 360) % 360;
            resultingAngle = Math.abs(newHourAngle - initialMinuteAngle);
            resultingAngle = Math.min(resultingAngle, 360 - resultingAngle);

            if (Math.abs(resultingAngle - targetAngle) < 1e-9) {
                int cost = hourDelta * hourCost * counterclockwiseCost;
                minCost = Math.min(minCost, cost);
            }
        }

        return minCost == Integer.MAX_VALUE ? -1 : minCost;
    }

    public static void main(String[] args) {
        // Example Inputs
        int initialHour = 2;
        int initialMinute = 35;
        int targetAngle = 200;
        int hourCost = 10; // Cost of moving hour hand
        int minuteCost = 4; // Cost of moving minute hand
        int clockwiseCost = 1; // Cost multiplier for clockwise direction
        int counterclockwiseCost = 2; // Cost multiplier for counterclockwise direction

        int minCost = calculateMinimumCost(initialHour, initialMinute, targetAngle, hourCost, minuteCost, clockwiseCost, counterclockwiseCost);
        System.out.println("Minimum cost to form the angle: " + minCost + " rupees");
    }
}
