package Source_Code;

public class Square_Shape implements Shape{
    public double height;
    public double x_pos;
    public double y_pos;

    public Square_Shape(double height, double x_pos, double y_pos)
    {
        this.height = height;

    }


    @Override
    public double CalculateArea(double height, double x_pos, double y_pos) {
        return height*height;
    }

}
