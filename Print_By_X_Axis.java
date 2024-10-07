package Source_Code;

import java.util.Collections;
import java.util.Comparator;

public class Print_By_X_Axis extends Printer {

    @Override
    public void printShapes() {

        Collections.sort(shapes);

        System.out.println("Shapes sorted by area:");
        for (Double area : shapes) {
            System.out.println("Area: " + area);
        }
    }
}
