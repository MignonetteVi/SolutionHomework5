public class HighResolutionImage implements Image{
    private String filepath;

    public HighResolutionImage(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Миниатюра: " + filepath);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Изображение: " + filepath);
    }
}
