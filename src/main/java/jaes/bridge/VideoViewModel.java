package jaes.bridge;

public class VideoViewModel implements IViewModel {
    ItemViews video;

    public VideoViewModel(ItemViews video) {
        this.video = video;
    }

    @Override
    public String title() {
        return "(VIDEO)" + this.video.getTitle();
    }

    @Override
    public String image() {
        return "(VIDEO)" + this.video.getImage() + ".png";
    }

}
