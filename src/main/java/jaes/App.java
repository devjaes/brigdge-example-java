package jaes;

import main.java.jaes.bridge.ListItemView;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        final ListItemView[] views = new ListItemView[] {
                new JustTextListItemView(new VideoViewModel("video1")),
                new JustTextListItemView(new VideoViewModel("video2")),
                new JustTextListItemView(new VideoViewModel("video3")),
                new JustTextListItemView(new VideoViewModel("video4")),
                new JustTextListItemView(new VideoViewModel("video5")),
        };

        for (ListItemView view : views) {
            System.out.println(view.render());
        }
    }
}
