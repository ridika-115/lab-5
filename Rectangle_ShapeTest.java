package Test_Code;

import Source_Code.Rectangle_Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rectangle_ShapeTest {
    @Test
    public void testSquareShape()
    {
        Rectangle_Shape rs = new Rectangle_Shape(3,5,4,5);
        rs.CalculateArea(3,4,5,4);
    }

}