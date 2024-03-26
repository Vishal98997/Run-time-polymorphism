class shape{
    public void area(double radius){
        double ar=Math.PI*Math.pow(radius,2);
        System.out.println("Area of circle="+ar);
    }
    public void area(int side){
        int ar=side*side;
        System.out.println("Area of square ="+ar);
    }
    public void area(int length, int breadth){
        int ar=length*breadth;
        System.out.println("Area of rectangle"+ar);
    }
}

public class staticpolymor {
    public static void main(String[] args) {
        shape s=new shape();
        s.area(10);//square
        s.area(10.0);// circle
        s.area(5,7);//rectangle;
    }
}
