package homework22_02_20;

//Write a class with the name Wall. The class needs two fields
// (instance variables) with name width and height of type double.
public class Wall {
    double width, height, area;

    public Wall() {
    }

    public Wall(double width, double height) {
        if (width < 0)
            width = 0;
        if (height < 0)
            height = 0;
        area = height * width;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("Area =" + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double setWidth(double width) {
        if (width < 0) {
            width = 0;
        }
        return width;
    }

    public double setHeight(double height) {
        if (height < 0) {
            height = 0;
        }

        return height;
    }

    public double getArea() {
// area = height*width;
        return area;
    }
}

