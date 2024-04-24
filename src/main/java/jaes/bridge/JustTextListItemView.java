package main.java.jaes.bridge;

public class JustTextListItemView extends ListItemView {

    public JustTextListItemView(IViewModel viewModel) {
        super(viewModel);
    }

    @Override
    public string render() {
        return """
                    <div class="list-item">
                        <h2>JustTextListItemView</h2>
                        <p>%s</p>
                    </div>
                """.formatted(this.viewModel.title());
    }
}
