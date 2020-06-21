package 实验3;

import 实验2.Point1;

import java.util.Scanner;

@SuppressWarnings("all")
public class Test {
    public static void main(String[] args) {
        System.out.println("请输入圆1的圆心，半径");
        Scanner input=new Scanner(System.in);
        Point1 p1=new Point1(input.nextInt(),input.nextInt());
        int r1=input.nextInt();
        System.out.println("边框颜色为");
        Color bc1=new Color(input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println("圆心颜色为");
        Color cc1=new Color(input.nextInt(),input.nextInt(),input.nextInt());
        ColorCircle c=new ColorCircle(p1,r1);
        c.setBorderColor(bc1);
        c.setCenterColor(cc1);
        System.out.println(c.perimeter(c.getRadius()));
        System.out.println(c.area(c.getRadius()));
        System.out.println("请输入圆2的圆心，半径");
        Scanner input1=new Scanner(System.in);
        Point1 p2=new Point1(input1.nextInt(),input1.nextInt());
        int r2=input1.nextInt();
        System.out.println("边框颜色为");
        Color bc2=new Color(input1.nextInt(),input1.nextInt(),input1.nextInt());
        System.out.println("圆心颜色为");
        Color cc2=new Color(input1.nextInt(),input1.nextInt(),input1.nextInt());
        ColorCircle c2=new ColorCircle(p2,r2);
        c.setBorderColor(bc2);
        c.setCenterColor(cc2);
        System.out.println(c2.perimeter(c2.getRadius()));
        System.out.println(c2.area(c2.getRadius()));
        c.relation(c2);
    }
}
