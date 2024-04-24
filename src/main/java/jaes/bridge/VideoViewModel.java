package main.java.jaes.bridge;

public class VideoViewModel implements IViewModel {
    string video;

    public VideoViewModel(string video) {
        this.video = video;
    }

    @Override
    public string title() {
        return "(VIDEO)" + this.video;
    }

    @Override
    public string image() {
        return "(VIDEO)" + this.video + ".png";
    }

}
