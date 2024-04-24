package jaes.bridge;

public abstract class ListItemView {
    protected IViewModel viewModel;

    public ListItemView(IViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public String render() {
        return """
                    <div class="list-item">
                        <h2>Default ListItemView</h2>
                    </div>
                """;
    }
}
