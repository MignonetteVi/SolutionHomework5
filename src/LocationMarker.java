public class LocationMarker {
    private int x, y;
    private MarkerStyle style;

    public LocationMarker(int x, int y, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.style = style;
    }

    public void render() {
        style.draw(x, y);
    }
}
