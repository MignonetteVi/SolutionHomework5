public class ImageProxy implements Image{
    private String filepath;
    @Override
    public void displayThumbnail() {
        System.out.println("Прокси! Показ миниатюры: " + filepath);
    }

    @Override
    public void displayFullImage() {

    }
}
