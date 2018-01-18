package sk.akademiasovy.points;

import java.util.Random;

public class Point3d extends Point {
    private int z;

    public int getZ() {
        return z;
    }

    public Point3d(){
        z = 0;
    }

    public Point3d(int x, int y, int z){
        super(x,y);
        this.z = z;

    }

    @Override
    public double getDistance() {
        return Math.sqrt(getX()*getX() + getY()*getY());
    }

    @Override
    public void generateRandomCor() {
        Random random = new Random();
        this.z = random.nextInt(41)-20;
        super.generateRandomCor();
    }

    public double getDistanceFromOtherPoint(Point3d other){
        return Math.sqrt(Math.pow(getX()-other.getX(),2) + Math.pow(getY()-other.getY(),2) +  Math.pow(z-other.getZ(),2));
    }

    @Override
    public void printInfo() {
        System.out.println("Point {"+z+", "+z+"}"+ "Distance" + getDistance());
    }
}
