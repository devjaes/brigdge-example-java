package jaes;

import java.util.LinkedList;

import jaes.bridge.ItemViews;
import jaes.bridge.JustTextListItemView;
import jaes.bridge.ListItemView;
import jaes.bridge.StreamVierwModel;
import jaes.bridge.VideoViewModel;
import jaes.bridge.WithThumbnailListItemView;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ItemViews[] list = new ItemViews[] {
                new ItemViews("video", "Tutorial js", "Imagen1"),
                new ItemViews("video", "Tutorial python", "imagen2"),
                new ItemViews("stream", "Probando juegos", "image3"),
                new ItemViews("stream", "Noche de chat", "imagen4")
        };

        LinkedList<ListItemView> views = new LinkedList<>();

        for (ItemViews item : list) {
            if (item.getType().equals("video")) {
                views.push(Math.random() > 0.5 ? new JustTextListItemView(new VideoViewModel(item))
                        : new WithThumbnailListItemView(new VideoViewModel(item)));
            } else if (item.getType().equals("stream")) {
                views.push(Math.random() > 0.5 ? new JustTextListItemView(new StreamVierwModel(item))
                        : new WithThumbnailListItemView(new StreamVierwModel(item)));
            }
        }

        for (ListItemView view : views) {
            System.out.println(view.render());
        }
    }
}
