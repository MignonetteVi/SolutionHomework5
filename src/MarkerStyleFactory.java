import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getStyle(String icon, String color, String labelStyle) {
        String key = icon + color + labelStyle;
        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(icon, color, labelStyle));
        }
        return styles.get(key);
    }

    private MarkerStyleFactory() {
    }

    public static int getTotalStyles() {
        return styles.size();
    }
}
