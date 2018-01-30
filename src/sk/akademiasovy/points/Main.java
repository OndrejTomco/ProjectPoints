package sk.akademiasovy.points;

import sk.akademiasovy.Abstract.Person;
import sk.akademiasovy.Abstract.Student;
import sk.akademiasovy.Abstract.Teacher;
import sk.akademiasovy.date.MyDate;
import sk.akademiasovy.other.MyClass;

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

        Object o1 = new Point();
        Point p3 = new Point3d(2,8, 7);
        Geometry g1 = new Point();
        ((Point)g1).printInfo();

        Geometry[] arr = new Geometry[10];

        int i;
        for(i=0;i<10;i++){
            Point3d temp = new Point3d();
            temp.generateRandomCor();
            arr[i] = temp;
        }

        for(Geometry temp:arr){
            ((Point3d)temp).printInfo();
        }


        Point bod15 = new Point(2,5);
        Line line1 = new Line(bod15, new Point(10,4));
        Line line2 = new Line(1,2,4,6);
        System.out.println(line1.getLength());

        Triangle tr1 = new Triangle(new Point(3,3), new Point(4,7), new Point(5,3) );
        System.out.println("Perimeter: " + tr1.getTrianglePerimeter() + " Area "+tr1.getArea()+" isRectangular: "+ tr1.isRectangular()+" Isisosceles: " + tr1.isIsosceles() + " IsEquliateral: " + tr1.isEquilateral());

        MyDate date1 = new MyDate();
        date1.today2();

        MyClass name = new MyClass();
        System.out.println(name.formatName("ondrej"));

        MyClass myclass = new MyClass();
        System.out.println(myclass.isEmailValid("ondrej..@gmail.com"));

        Person p = new Teacher();
        ((Teacher)p).setSalary(2200);

        Person s = new Student();



    }
}
