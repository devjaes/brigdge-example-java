public class WithThumbnailListItemView extends ListItemView {
    public WithThumbnailListItemView(IViewModel viewModel) {
        super(viewModel);
    }

    @Override
    public string render() {
        return """
                    <div class="list-item">
                        <h2>WithThumbnailListItemView</h2>
                        <p>%s</p>
                        <img src="%s" />
                    </div>
                """.formatted(this.viewModel.title(), this.viewModel.image());
    }
}
