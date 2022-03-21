package lab9;

public class Square extends Rectangle {

    public Square(int length){
        // only if Rectangle has a constructor that requires arguments
        super(length, length);
    }

    @Override
    public void setLength(int length){
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(int width){
        super.setLength(width);
        super.setWidth(width);
    }
}
