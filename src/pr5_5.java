import java.util.Scanner;

class Point_pr5_3 {
    private int x, y;
    public Point_pr5_3(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint_pr5_3 extends Point_pr5_3 {
    private String color;
    public ColorPoint_pr5_3(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    public void setXY (int x, int y) {
        move(x, y);
    }
    public void setColor (String color) {
        this.color = color;
    }
    public String toString() {
        return this.color + "색의 (" + getX() + "," + getY() + ")의 점";
    }
}
public class pr5_5 {
    public static void main(String args[]) {
        ColorPoint_pr5_3 cp = new ColorPoint_pr5_3(5, 5, "Yellow");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
}