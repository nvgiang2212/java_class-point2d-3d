public class Point3d extends Point2d {
    private float z =0.0f;

    public Point3d(){
    }

    public Point3d(float x,float y,float z){
        super(x, y);
        this.z = z;
    }

    public float getZ(){
        return this.z;
    }

    public void setZ(float z){
        this.z =z;
    }

    public void setXYZ(float x,float y,float z){
        super.setXY(x, y);
        this.z =z;
    }

    public String getXYZ(){
        return "Array of {"
                +super.getX()
                +","
                +super.getY()
                +","
                +this.z
                +"}";
    }

    public String toString(){
        return "("
                +super.getX()
                +","
                +super.getY()
                +","
                +this.z
                +")";
    }

    public static void main(String[] args) {
        Point3d point3d = new Point3d();
        System.out.println(point3d);
        point3d = new Point3d(5,6,8);
        System.out.println(point3d);
        point3d.setXYZ(18,24,22);
        System.out.println(point3d);
    }

}