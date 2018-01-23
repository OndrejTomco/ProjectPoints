package sk.akademiasovy.points;

public class Triangle implements InterfaceTriangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSideA(){
        return b.getDistanceFromOtherPoint(c);
    }

    public double getSideB(){
        return a.getDistanceFromOtherPoint(c);
    }

    public double getSideC(){
        return b.getDistanceFromOtherPoint(a);
    }

    public double getTrianglePerimeter(){
        return getSideA() + getSideB() + getSideC();
    }

    @Override
    public double getArea() {
        double s = getTrianglePerimeter()/2;
        double area = Math.sqrt(s*s-getSideA())*(s*s-getSideB())*(s*s-getSideC());
        return area;
    }

    @Override
    public boolean isRectangular() {
        double a = getSideA();
        double b = getSideB();
        double c = getSideC();

        if(a*a + b*b  == c*c){
            return true;
        }

        else if(c*c+b*b == a*a){
            return true;
        }

        else if(c*c+a*a == b*b){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isEquilateral() {
        double A = c.getDistanceFromOtherPoint(b);
        double B = a.getDistanceFromOtherPoint(c);
        double C = a.getDistanceFromOtherPoint(b);

        if(A==B && B==C){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isIsosceles() {
        double sideA = c.getDistanceFromOtherPoint(b);
        double sideB = a.getDistanceFromOtherPoint(c);
        double sideC = a.getDistanceFromOtherPoint(b);

        if(sideA == sideB){
            return true;
        }

        if(sideA == sideC){
            return true;
        }

        if(sideC == sideB){
            return true;
        }

        else{
            return false;
        }
    }


}
