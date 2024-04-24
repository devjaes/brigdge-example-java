package jaes.bridge;

public class ItemViews {
    private String type;
    private String title;
    private String image;

    public ItemViews(String type, String title, String image) {
        this.type = type;
        this.title = title;
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
