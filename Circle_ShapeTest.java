package Test_Code;
import Source_Code.Circle_Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Circle_ShapeTest {

    @Test
        public void testCircleShape()
        {
            Circle_Shape cs = new Circle_Shape(3,5,5);
            cs.CalculateArea(3,4,5);
        }
}
