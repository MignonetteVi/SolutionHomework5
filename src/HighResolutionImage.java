public class HighResolutionImage implements Image{
    private String filepath;

    private void loadFromDisk() {
        DiskLoader.load(filepath);
    }

    public HighResolutionImage(String filepath) {
        this.filepath = filepath;
        loadFromDisk();
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
