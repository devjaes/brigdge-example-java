package main.java.jaes.bridge;

public abstract class ListItemView {
    protected IViewModel viewModel;

    public ListItemView(IViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public string render() {
        return """
                    <div class="list-item">
                        <h2>Default ListItemView</h2>
                    </div>
                """;
    }
}
