package 实验3;
import 实验2.Circle1;
import 实验2.Point1;

public class ColorCircle extends Circle1 {
    Color borderColor;
    Color centerColor;
    public ColorCircle(){
        super();
        borderColor=new Color(0,0,0);
        centerColor=new Color(0,0,0);
    }
    public ColorCircle(Point1 center,int radius){
        super(center,radius);
        borderColor=new Color(0,0,0);
        centerColor=new Color(0,0,0);
    }
    public ColorCircle(Color borderColor,Color centerColor){
        super(0,0,0);
        this.borderColor=borderColor;
        this.centerColor=centerColor;
    }
    public ColorCircle(Point1 center,int radius,Color borderColor,Color centerColor){
        super(center,radius);
        this.borderColor=borderColor;
        this.centerColor=centerColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public void setCenterColor(Color centerColor) {
        this.centerColor = centerColor;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public Color getCenterColor() {
        return centerColor;
    }

    @Override
    public int relation(Circle1 c) {
        return super.relation(c);
    }
}
