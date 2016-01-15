package module4;

public class CoordinatesCalculator {

    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public CoordinatesCalculator(double x1, double y1, double x2, double y2){

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getDistance(){

        return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public static void main(String[] args) {

        CoordinatesCalculator coordinatesCalculator = new CoordinatesCalculator(1, 2, 5, 5);

        System.out.println(coordinatesCalculator.getDistance());

        coordinatesCalculator.setX1(3);

        System.out.println(coordinatesCalculator.getDistance());
    }
}
