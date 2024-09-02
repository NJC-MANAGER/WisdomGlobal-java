package objects_in_java;
//write an object that describes the fields of a rectangle
public class Rectangle {
    //Fields or characteristics of a rectangle
    private double length;
    private double width;

    // some of the actions that can be taken on these fields-methods
  public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
    public double getLength(){
        return length;
    }
    public  void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void  setWidth(double width){
        this.width = width;
    }
    }
