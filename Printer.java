package Source_Code;
import java.util.*;

public abstract class Printer{
    Circle_Shape cs = new Circle_Shape(5,6,8);
    Rectangle_Shape rs = new Rectangle_Shape(5,6,2,4);
    Square_Shape ss = new Square_Shape(5,2,6);

    List<Double> shapes = new ArrayList<>();
    public void addShapes()
    {
        shapes.add(cs.CalculateArea(6.6, 2,5));
        shapes.add(rs.CalculateArea(3,5,5,7));
        shapes.add(ss.CalculateArea(6.6,6,7));
        shapes.add(rs.CalculateArea(4.5,5,8,1));
    }

    public abstract void printShapes();

}
