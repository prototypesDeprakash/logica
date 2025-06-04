import java.util.*;
import java.util.Map.Entry;

public class SegmentIntersection {

    static class Segment {
        int xpositionStart, ypositionStart, EndOfx, EndOfy;

        boolean isVertical() {
            return xpositionStart == EndOfx;
        }

        boolean isHorizontal() {
            return ypositionStart == EndOfy;
        }

        boolean isDiagonal() {
            return Math.abs(EndOfx - xpositionStart) == Math.abs(EndOfy - ypositionStart);
        }
    }
    static void solve(Scanner sc) {
        numSegments = sc.nextInt();
        for (int i = 0; i < numSegments; i++) {
            Segment seg = new Segment();
            seg.xpositionStart = sc.nextInt();
            seg.ypositionStart = sc.nextInt();
            seg.EndOfx = sc.nextInt();
            seg.EndOfy = sc.nextInt();
            segments.add(seg);
            addSegment(seg, i);
        }
        requiredIntersect = sc.nextInt();
        int total = 0;
        for (Entry<Pair, List<Integer>> entry : pointMap.entrySet()) {
            Pair point = entry.getKey();
            List<Integer> segList = entry.getValue();
            if (segList.size() == requiredIntersect) {
                total += calculateMinDistance(point, segList);
            }
        }
        System.out.print(total);
    }
    static int numSegments, requiredIntersect;
    static List<Segment> segments = new ArrayList<>();
    static Map<Pair, List<Integer>> pointMap = new HashMap<>();

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

       
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Pair)) {
                return false;
            }
            Pair pair = (Pair) o;
            return x == pair.x && y == pair.y;
        }

       
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    static void addSegment(Segment segment, int idx) {
        int xpositionStart = segment.xpositionStart;
        int ypositionStart = segment.ypositionStart;
        int EndOfx = segment.EndOfx;
        int EndOfy = segment.EndOfy;

        if (segment.isVertical()) {
            int yBegin = Math.min(ypositionStart, EndOfy);
            int yFinish = Math.max(ypositionStart, EndOfy);
            for (int y = yBegin; y <= yFinish; y++) {
                pointMap.computeIfAbsent(new Pair(xpositionStart, y), k -> new ArrayList<>()).add(idx);
            }
        } else if (segment.isHorizontal()) {
            int xBegin = Math.min(xpositionStart, EndOfx);
            int xFinish = Math.max(xpositionStart, EndOfx);
            for (int x = xBegin; x <= xFinish; x++) {
                pointMap.computeIfAbsent(new Pair(x, ypositionStart), k -> new ArrayList<>()).add(idx);
            }
        } else if (segment.isDiagonal()) {
            int steps = Math.abs(EndOfx - xpositionStart);
            int dx = (EndOfx - xpositionStart) / steps;
            int dy = (EndOfy - ypositionStart) / steps;
            for (int i = 0; i <= steps; i++) {
                int x = xpositionStart + i * dx;
                int y = ypositionStart + i * dy;
                pointMap.computeIfAbsent(new Pair(x, y), k -> new ArrayList<>()).add(idx);
            }
        }
    }

    static int distanceBetweenPoints(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            return Math.abs(y1 - y2);
        }
        if (y1 == y2) {
            return Math.abs(x1 - x2);
        }
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            return Math.abs(x1 - x2);
        }
        return 0;
    }

    static int calculateMinDistance(Pair pt, List<Integer> segList) {
        List<Integer> distances = new ArrayList<>();
        for (int segIdx : segList) {
            Segment seg = segments.get(segIdx);
            boolean isEndpoint = (pt.x == seg.xpositionStart && pt.y == seg.ypositionStart) || 
                                 (pt.x == seg.EndOfx && pt.y == seg.EndOfy);
            if (isEndpoint) {
                int oppositeX = (pt.x == seg.xpositionStart && pt.y == seg.ypositionStart) ? seg.EndOfx : seg.xpositionStart;
                int oppositeY = (pt.x == seg.xpositionStart && pt.y == seg.ypositionStart) ? seg.EndOfy : seg.ypositionStart;
                distances.add(distanceBetweenPoints(pt.x, pt.y, oppositeX, oppositeY));
            } else {
                distances.add(distanceBetweenPoints(pt.x, pt.y, seg.xpositionStart, seg.ypositionStart));
                distances.add(distanceBetweenPoints(pt.x, pt.y, seg.EndOfx, seg.EndOfy));
            }
        }
        return distances.isEmpty() ? 0 : Collections.min(distances);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
