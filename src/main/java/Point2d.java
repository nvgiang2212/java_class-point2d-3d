public class Point2d {
    private float x =0.0f;
    private float y =0.0f;

    public Point2d(){
    }

    public Point2d(float x,float y){
        this.x =x;
        this.y =y;
    }

    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    public void setX(float x){
        this.x =x;
    }

    public void setY(float y){
        this.y = y;
    }

    public void  setXY(float x,float y){
        setX(x);
        setY(y);
    }

    public String getXY(){
        return "Array of {"+ this.x +","+this.y+")";
    }
    @Override

    public String toString(){
        return "("
                +this.x
                +","
                +this.y
                +")"
                +" "
                +"and"
                +"\n"
                +getXY();
    }

    public static void main(String[] args) {
        Point2d point2d = new Point2d(1,2);
        System.out.println(point2d);
        point2d.setXY(8,5);
        System.out.println(point2d);
    }
}