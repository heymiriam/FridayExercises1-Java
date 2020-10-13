package week1.classes;

public class Rectangle {
    private int width;
    private int height;
    private String color;
//    private int widthHeight;

    public void Rectangle{
        width=1;
        height=1;
        color="Blue";
    }
    public Rectangle(int width, int height, String color){
        this.width=width;
        this.height=height;
        this.color=color;
 //       this.widthHeight=widthHeight;
        setWidth(width);
        setHeight(height);
        setColor(color);
        setColorCap(color);
        //this.colorCheck=colorCheck;
    }
    public int getWidth() {
        return width;}
    public int getHeight() {
        return height;}
    public getColor(){
        return color;}

//    public boolean colorCheck(String color){
//     return colorLength(color);
//    }

    public void setColor(String color){
        if (color.length() > 2 && color.length() < 20, ) {
            this.color = color;
        }else{
            System.out.println("Blue");
       }
    }
    public String setColorCap(String color){
        String this.color = color.substring(0, 1).toUpperCase() + color.substring(1);
    }
    public void setWidth(int width){
        if(width>=0){
            this.width=width;
        }else{
            System.out.println(0);
        }
    }
    public void setHeight(int height){
        if(height>=0){
            this.height=height;
        }else{
            System.out.println(0);
        }
    }
    private boolean colorLength(String color) {
        if (!color.equals(this.color)) {
            System.out.println("Blue");
            return false;
        }
        System.out.println(color);
        return true;
    }
    public int getWidthHeight{
        return width*height;
    }

    public String getColor() {
        return color;
    }

    public void draw(){
        char colorLetter=color.charAt(0);
        System.out.println("Width: "+ width);
        System.out.println("Height: " + height);
        System.out.println("Color: " + color);
//        System.out.println("Width and Height " + widthHeight);
    }
}
