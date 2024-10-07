package Source_Code;

public class Circle_Shape implements Shape {
    public double x_pos;
    public double y_pos;
    public double radius;

    public Circle_Shape(double radius, double x_pos, double y_pos)
    {
        this.radius = radius;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
    }


    @Override
    public double CalculateArea(double height,double x_pos, double y_pos) {
        return height*3.14*height;
    }
}
