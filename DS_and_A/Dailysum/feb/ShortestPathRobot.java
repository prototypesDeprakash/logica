package Dailysum.feb;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class ShortestPathRobot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of sides and the starting point
        int n = scanner.nextInt();
        double px = scanner.nextDouble();
        double py = scanner.nextDouble();
        Point2D startPoint = new Point2D.Double(px, py);

        // Read the vertices of the polygon
        List<Point2D> vertices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            vertices.add(new Point2D.Double(x, y));
        }

        // Calculate the shortest path
        double shortestPath = calculateShortestPath(startPoint, vertices);

        // Print the result rounded to 2 decimal places
        System.out.printf("%.2f%n", shortestPath);
    }

    private static double calculateShortestPath(Point2D startPoint, List<Point2D> vertices) {
        int n = vertices.size();
        List<Line2D> sides = new ArrayList<>();

        // Create the sides of the polygon
        for (int i = 0; i < n; i++) {
            Point2D p1 = vertices.get(i);
            Point2D p2 = vertices.get((i + 1) % n);
            sides.add(new Line2D.Double(p1, p2));
        }

        // Generate all possible permutations of the sides
        List<List<Line2D>> permutations = generatePermutations(sides);

        double minDistance = Double.MAX_VALUE;

        // Calculate the distance for each permutation
        for (List<Line2D> permutation : permutations) {
            double distance = 0;
            Point2D currentPoint = startPoint;

            for (Line2D side : permutation) {
                Point2D closestPoint = getClosestPointOnLine(currentPoint, side);
                distance += currentPoint.distance(closestPoint);
                currentPoint = closestPoint;
            }

            // Return to the starting point
            distance += currentPoint.distance(startPoint);

            if (distance < minDistance) {
                minDistance = distance;
            }
        }

        return minDistance;
    }

    private static List<List<Line2D>> generatePermutations(List<Line2D> sides) {
        List<List<Line2D>> permutations = new ArrayList<>();
        permute(sides, 0, permutations);
        return permutations;
    }

    private static void permute(List<Line2D> sides, int start, List<List<Line2D>> permutations) {
        if (start >= sides.size()) {
            permutations.add(new ArrayList<>(sides));
            return;
        }

        for (int i = start; i < sides.size(); i++) {
            Collections.swap(sides, start, i);
            permute(sides, start + 1, permutations);
            Collections.swap(sides, start, i);
        }
    }

    private static Point2D getClosestPointOnLine(Point2D point, Line2D line) {
        double x1 = line.getX1();
        double y1 = line.getY1();
        double x2 = line.getX2();
        double y2 = line.getY2();

        double dx = x2 - x1;
        double dy = y2 - y1;
        double lengthSquared = dx * dx + dy * dy;

        if (lengthSquared == 0) {
            return new Point2D.Double(x1, y1);
        }

        double t = ((point.getX() - x1) * dx + (point.getY() - y1) * dy) / lengthSquared;
        t = Math.max(0, Math.min(1, t));

        double closestX = x1 + t * dx;
        double closestY = y1 + t * dy;

        return new Point2D.Double(closestX, closestY);
    }
}