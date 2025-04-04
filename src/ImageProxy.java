public class ImageProxy implements Image{
    private String filepath;
    private HighResolutionImage realImage;

    public ImageProxy(String filepath, HighResolutionImage realImage) {
        this.filepath = filepath;
        this.realImage = realImage;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Прокси! Показ миниатюры: " + filepath);
    }

    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new HighResolutionImage(filepath);
        }
        realImage.displayFullImage();
    }
}
