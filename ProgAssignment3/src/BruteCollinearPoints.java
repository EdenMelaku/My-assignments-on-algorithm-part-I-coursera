import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;

import java.util.ArrayList;
import java.util.Arrays;

public class BruteCollinearPoints {

   private  Point [] points = null;
   private LineSegment[] segments = null;
    public BruteCollinearPoints(Point[] points) {

        for (int i = 0; i < points.length; i++) {
            if (points[i] == null) {
                throw new IllegalArgumentException();
            }
        }
        this.points = points;
        Arrays.sort(points);


        ArrayList<LineSegment> l = new ArrayList<LineSegment>();

        double slopes[] = new double[points.length];
        boolean isCol = true;
        double curr;
        for (int i = 0; i < points.length-1; i++) {
            curr = slopes[0];
            slopes[i] = points[0].slopeTo(points[i+1]);
            if (curr != slopes[i]) {
             isCol = false;
            }

           // System.out.print(slopes[i]+" ");
        }
       //  System.out.println();
        if (isCol) {

            LineSegment li = new LineSegment(points[0], points[points.length-1]);

            //System.out.println(points[0]+" =>"+points[points.length-1]);

            l.add(li);
            segments = l.toArray(new LineSegment[l.size()]);
            return;


        } else {
            double[][] s = new double[points.length][points.length];
            for (int i = 0; i < points.length; i++) {
                for (int j = i; j < points.length; j++) {
                    s[i][j] = points[i].slopeTo(points[j]);
                    s[j][i] = points[i].slopeTo(points[j]);

                }

            }
            for (int i = 0; i < points.length; i++) {
                for (int j = 0; j < points.length; j++) {

                   // System.out.print(s[i][j] +"               | ");
                }
               // System.out.println();
            }




            StdDraw.enableDoubleBuffering();
            StdDraw.setXscale(0, 32768);
            StdDraw.setYscale(0, 32768);

            ArrayList <Integer> sll= new ArrayList<>();

            for (int k = 0; k < s.length-1; k++) {

                int larPoint = k;
                for (int j = k; j < s.length; j++) {

                    for (int y = j + 1; y < s.length; y++) {

                        if (s[k][j] == s[k][y]) {
                            if (!sll.contains(y)) {
                                sll.add(y);
                                larPoint = y;
                            }


                        }
                    }

                }

                if (larPoint != k) {
                    LineSegment line = new LineSegment(points[k], points[larPoint]);

                    if (!l.contains(line)) {

                        l.add(line);
                        //System.out.println(points[k] + " =>" + points[larPoint]);
                        //System.out.println(l.lastIndexOf(l));

                        points[k].drawTo(points[larPoint]);
                    }

                }
            }
            StdDraw.show();
            segments = l.toArray(new LineSegment[l.size()]);

/*
            for (int i = 0; i < s.length; i++) {
                for (int j = 0;j < s.length; j++) {
                    System.out.print(s[i][j] + " | ");
                }
                System.out.println();
            }
*/

        }



    }  // finds all line segments containing 4 points

    public int numberOfSegments() {

     return segments.length;

    }        // the number of line segments
    public LineSegment[] segments()    {

     return segments;

    }            // the line segments


    public static void main(String... args) {

        Point p = new Point(2, 4);
        Point q = new Point(4, 6);
        Point r = new Point(8, 10);
        Point s = new Point(2, 0);

        Point[] points = new Point[4];
        points[0] = p;
        points[1] = q;
        points[2] = r;
        points[3] = s;

        //BruteCollinearPoints b = new BruteCollinearPoints(points);

        //LineSegment[] l = b.segments();




        In in = new In(args[0]);
        int n = in.readInt();
        Point[] point = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = in.readInt();
            int y = in.readInt();
            point[i] = new Point(x, y);
        }
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);
        for (Point x : point) {
            System.out.println(x);
            x.draw();
        }
      //  StdDraw.show();

        BruteCollinearPoints b = new BruteCollinearPoints(point);


        System.out.println("number of total segments = " + b.numberOfSegments());

    }





}

