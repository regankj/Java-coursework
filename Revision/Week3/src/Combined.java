public class Combined {

    private Shape shape1;
    private Shape shape2;

    public double getArea(){
        return shape1.getArea() + shape2.getArea();
    }

    public double getCircumference(){
        return shape1.getCircumference() + shape2.getCircumference();
    }

    public void move(double disp_x, double disp_y){
        shape1.move(disp_x, disp_y);
        shape2.move(disp_x, disp_y);
    }

    public String toString(){
        return "Combined[" + shape1.toString() + ", " + shape2.toString() + "]";
    }

    public Combined(Shape shape1_, Shape shape2_){
        shape1 = shape1_;
        shape2 = shape2_;
    }
}
