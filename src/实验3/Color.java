package 实验3;

public class Color {
    private int red,green,blue;
    public Color(int r,int g,int b){
        this.red=r;
        this.green=g;
        this.blue=b;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
}
