package Source_Code;

public class Main {
    public static void main(String[] args) {

        Printer p = new Print_By_Asc();
        p.printShapes();

        Rectangle_Shape rs = new Rectangle_Shape(4,5,2,3);
        System.out.println(rs.CalculateArea(4,5,2,3));
        Circle_Shape cs = new Circle_Shape(4,5,6);

    }
}
