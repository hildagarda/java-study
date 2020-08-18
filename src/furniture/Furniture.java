package furniture;

public class Furniture {

    private String name;

    private String style;

    private String color;

    private int price;

    public void setName(String name) {
        this.name = name;
    };

    public String getName() {
        return name;
    };

    public void setStyle(String style) {
        this.style = style;
    };

    public String getStyle() {
        return style;
    }

    public void setColor(String color) {
        this.color = color;
    };

    public String getColor() {
        return color;
    };

    public void setPrice(int price) {
        this.price = price;
    };

    public int getPrice() {
        return price;
    };

    public Furniture (String name, String style, String color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
    };

    public void Serve (){

    };

    public Furniture (){

    };





}
