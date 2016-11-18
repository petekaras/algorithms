import java.util.*;

public class CoveringSegments {

    public static int[] optimalPoints(Segment[] segments) {

        //sort segments by lowest endpoint first
        Arrays.sort(segments, new Comparator<Segment>() {
            @Override
            public int compare(Segment segment, Segment t1) {
                if(segment.end < t1.end){
                    return -1;
                }
                if(segment.end == t1.end){
                    return 0;
                }
                return 1;
            }
        });

        //write your code here
        //for(Segment seg : segments){
          //  System.out.println(seg);
        //}


        List<Integer> endPoints = new ArrayList<>();
        for(int i=0;i<segments.length;i++){
            int nearestEnd = segments[i].end;
            //end of array
            if(i != segments.length-1) {
                int nextSegmentStart = segments[(i + 1)].start;
                while (nearestEnd >= nextSegmentStart) {
                    i++;
                    //end of array
                    if (i == segments.length - 1) {
                        break;
                    } else {
                        nextSegmentStart = segments[i + 1].start;
                    }
                }
            }

            endPoints.add(nearestEnd);

        }

        return endPoints.stream().mapToInt(i -> i).toArray();
    }

    public static class Segment {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Segment{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        int[] points = optimalPoints(segments);
        System.out.println(points.length);
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}
 