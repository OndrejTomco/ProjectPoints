package sk.akademiasovy.points;

public class Line {
    private Point a;
    private Point b;

    public Line(Point a, Point b){
        this.a = a;
        this.b = b;
    }

    public Line(int Xa,int Ya,int Xb,int Yb){
        a = new Point(Xa,Ya);
        b = new Point(Xb,Yb);
    }

    public double getLength(){
        return a.getDistanceFromOtherPoint(b);
    }

    public Point getMidOfLine(){
        return new Point(a.getX()+b.getX());
    }

    public boolean isParalelToAxisOfX(){
        return a.getY() == b.getY();
    }

    public boolean isParalelToAxisOfY(){
        return a.getX() == b.getX();

    }
}
