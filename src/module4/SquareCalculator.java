package module4;

public class SquareCalculator {

    public static double getTriangleSquare(double triangleSideLength, double triangleHeightLength){

        return (triangleSideLength / 2) * triangleHeightLength;
    }

    public static double getRectangleSquare(double rectangleSideALength, double rectangleSideBLength){

        return rectangleSideALength * rectangleSideBLength;
    }

    public static double getCircleSquare(double circleRadius){

        return Math.PI * circleRadius * circleRadius;
    }

    public static void main(String[] args) {

        System.out.println(SquareCalculator.getCircleSquare(5.0));
        System.out.println(SquareCalculator.getRectangleSquare(5.0, 10.0));
        System.out.println(SquareCalculator.getTriangleSquare(10.0, 2.0));

    }

}
