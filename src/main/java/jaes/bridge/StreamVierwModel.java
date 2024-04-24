package jaes.bridge;

public class StreamVierwModel implements IViewModel {
    ItemViews stream;

    public StreamVierwModel(ItemViews stream) {
        this.stream = stream;
    }

    @Override
    public String title() {
        return "(STREAM)" + this.stream.getTitle();
    }

    @Override
    public String image() {
        return "(STREAM)" + this.stream.getImage() + ".png";
    }
}
