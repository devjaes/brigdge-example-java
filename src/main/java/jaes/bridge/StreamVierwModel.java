
package main.java.jaes.bridge;

public class StreamVierwModel extends IViewModel {
    string stream;

    public StreamVierwModel(string stream) {
        this.stream = stream;
    }

    @Override
    public string title() {
        return "(STREAM)" + this.stream;
    }

    @Override
    public string image() {
        return "(STREAM)" + this.stream + ".png";
    }
}
