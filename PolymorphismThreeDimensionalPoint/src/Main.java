
public class Main {


    public static double calculateTotalLength(Measurable... objects) {
        double totalLength = 0;
        for (Measurable object : objects) {
            totalLength += object.getLength();
        }
        return totalLength;
    }


    public static void main(String[] args) {

        Line line = new Line(15);
        PolyLine polyLine = new PolyLine(10);



        double totalLengthGlobal = calculateTotalLength(line, polyLine);
        System.out.println("Total length: " + totalLengthGlobal);
    }
}
