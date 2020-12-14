public class Rectangle extends Shape {
    public double getArea(){
        public double getCircumference(){
            return 2 * width + 2 * height;
        }
        public void move(double disp_x, double disp_y){
            left += disp_x;
            top += disp_y;
        }
        public String toString(){
            return "Rectangle[(" + left ", " + top + ")-(" + (left + width) + ", " + (top + height) + ")]";
        }
        public Rectangle(double left_, double top_, double width_, double height_){
            left = left_;
            top = top_;
            width = width_;
            height = height_;
        }
        private double left;
        private double top;
        private double width;
        private double height;
    }
}
