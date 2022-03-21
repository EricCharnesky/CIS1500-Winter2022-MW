package lab9;

public class Rectangle {

    private int length;
    private int width;

    // optional - but good to have
    public Rectangle(int length, int width){
        setLength(length);
        setWidth(width);
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return length * 2 + width * 2;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = 0;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }
}
