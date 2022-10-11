class Point5_3
{
    private int x, y; // 한 점을 구성하는 x, y 좌표
    public Point5_3()
    {
        this.x = this.y = 0;
    }
    public Point5_3(int x, int y)
    {
        this.x = x; this.y = y;
    }
    public void showPoint()
    { // 점의 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }
}
class ColorPoint5_3 extends Point5_3
{
    private String color; // 점의 색
    public ColorPoint5_3(int x, int y, String color)
    {
        super(x, y); // Point의 생성자 Point(x, y) 호출
        this.color = color;
    }
    public void showColorPoint()
    { // 컬러 점의 좌표 출력
        System.out.print(color);
        showPoint(); // Point 클래스의 showPoint() 호출
    }
}
public class ex5_3
{
    public static void main(String[] args)
    {
        ColorPoint5_3 cp = new ColorPoint5_3(5, 6, "blue");
        cp.showColorPoint();
    }
}