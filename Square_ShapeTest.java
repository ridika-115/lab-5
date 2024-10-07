package Test_Code;
import Source_Code.Rectangle_Shape;
import Source_Code.Square_Shape;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class Square_ShapeTest {

    @Test
    public void testSquareShape()
    {
        Square_Shape ss = new Square_Shape(3,5,4);
        ss.CalculateArea(3,4,5);
    }
}