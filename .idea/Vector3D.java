import java.lang.Math;

public class Vector3D {

    private double xval;
    private double yval;
    private double zval;

    //Constructor for creating a vector
    public static void Vector(double x, double y, double z){
        xval = x;
        yval = y;
        zval = z;
    }

    //getters for individual values
    public static double getX(){
        return xval;
    }

    public static double getY(){
        return yval;
    }

    public static double getZ(){
        return zval;
    }

    //ToString
    public static String toString(Vector v){
        return System.out.println("(" + String.format(%.2f, v.getX()) +  ", " + String.format(%.2f, v.getY()) + ", " + String.format(%.2f, v.getZ()) + ")");
    }

    //Magnitude
    public static double getMagnitude(Vector v){
        return Math.sqrt(((v.getX() * v.getX()) + (v.getY() * v.getY()) + (v.getZ() * v.getZ())));
    }

    //Normalize
    public static Vector normalize(Vector v){
        double nx = xval/getMagnitude(v);
        double ny = yval/getMagnitude(v);
        double nz = zval/getMagnitude(v);
        return new Vector(nx, ny, nz);
    }

    //add
    public static Vector add(Vector v1, Vector v2){
        double x = v1.getX() + v2.getX();
        double y = v1.getY() + v2.getY();
        double z = v1.getZ() + v2.getZ();
        return new Vector(x, y, z);
    }

    //multiply
    public static Vector multiply(Vector v1, int constant){
        double x = v1.getX() * constant;
        double y = v1.getY() * constant;
        double z = v1.getZ() * constant;
        return new Vector(x, y, z);
    }

    //dot product
    public static double dotProduct(Vector v1, Vector v2){
        double x = v1.getX() * v2.getX();
        double y = v1.getY() * v2.getY();
        double z = v1.getZ() * v2.getZ();
        return x + y + z
    }

    //angle between
    public static double angleBetween(Vector v1, Vector v2){
        double dot = dotProduct(v1, v2);
        double mag1 = getMagnitude(v1);
        double mag2 = getMagnitude(v2);
        double angle = Math.acos(dot/mag1);
        return angle;
    }

    //cross product
    public static Vector crossProduct(Vector v1, Vector v2){
        double x = v1.getY() * v2.getZ() - v1.getZ() * v2.getY();
        double y = v1.getZ() * v2.getX() - v1.getX() * v2.getZ();
        double z = v1.getX() * v2.getY() - v1.getY() * v2.getX();
        return new Vector(x, y, z);
    }
}