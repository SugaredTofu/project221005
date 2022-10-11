interface Shape_pr5_13{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle_pr5_13 implements Shape_pr5_13{
    private int radius;
    public Circle_pr5_13(int radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("반지름이 " + this.radius + "인 원입니다.");
    }
    public double getArea() {
        return PI * radius * radius;
    }
}

public class pr5_13 {
    public static void main(String args[]) {
        Shape_pr5_13 donut = new Circle_pr5_13(10);
        donut.redraw();
        System.out.println("면적은 " + donut.getArea());
    }
}