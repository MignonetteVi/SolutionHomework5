//Flyweight Pattern
public class MarkerStyle {
    private String icon;
    private String color;
    private String labelStyle;

    public MarkerStyle(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public void draw(int x, int y) {
        System.out.println("Маркер '" + icon + "' в (" + x + ", " + y + ") цвет: " + color);
    }
}
