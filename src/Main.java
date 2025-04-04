import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

// Тест (пример работы методов из классов и +- кака-то абстракция реализации этого подхода в реальной жизни)
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Proxy Pattern: Image Viewer...");
    Image image = new ImageProxy("house1.jpg");

    System.out.println("1 - Показать миниатюру\n2 - Показать полное изображение");
    int choice = scanner.nextInt();
    if (choice == 1) {
        image.displayThumbnail();
    } else if (choice == 2) {
        image.displayFullImage();
    }

    System.out.println("\nProtection Proxy: Uploaf...");
    scanner.nextLine();
    System.out.print("Введите агента: ");
    String agent = scanner.nextLine();
    System.out.print("Введите название изображения: ");
    String uploadName = scanner.nextLine();
    UploadImageProxy uploader = new UploadImageProxy(agent);
    uploader.upload(uploadName);

    System.out.println("\nFlyweight Pattern: Map Markers...");
    List<LocationMarker> markers = new ArrayList<>();
    for (int i = 0; i < 500; i++) {
        MarkerStyle style = MarkerStyleFactory.getStyle("hospital", "red", "bold");
        markers.add(new LocationMarker(i, i + 1, style));
    }
    for (int i = 0; i < 500; i++) {
        MarkerStyle style = MarkerStyleFactory.getStyle("restaurant", "blue", "italic");
        markers.add(new LocationMarker(i, i + 2, style));
    }

    System.out.println("Отрисовка первых 5 маркеров:");
    for (int i = 0; i < 5; i++) {
        markers.get(i).render();
    }

    System.out.println("Всего маркеров: " + markers.size());
    System.out.println("Уникальных стилей: " + MarkerStyleFactory.getTotalStyles());
}
}