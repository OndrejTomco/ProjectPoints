package sk.akademiasovy.points;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(8,12);
        System.out.println("Point p1 is in " + p1.getQuadrant() + " quadrant");

        Point p2 = new Point();
        p2.generateRandomCor();

        System.out.println("Point p2 is in " + p2.getQuadrant() + " quadrant");
        System.out.println(p2.getDistance());
        p2.printInfo();
        System.out.println("Distance between points: " + p2.getDistanceFromOtherPoint(p1));
        Point3d point1 = new Point3d();
        point1.generateRandomCor();
        point1.printInfo();


    }
}
