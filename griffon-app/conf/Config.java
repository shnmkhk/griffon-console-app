import griffon.util.AbstractMapResourceBundle;

import javax.annotation.Nonnull;
import java.util.Map;

import static java.util.Arrays.asList;
import static griffon.util.CollectionUtils.map;

public class Config extends AbstractMapResourceBundle {
    @Override
    protected void initialize(@Nonnull Map<String, Object> entries) {
        map(entries)
            .e("application", map()
                .e("title", "NASA App")
                .e("startupGroups", asList("console"))
                .e("autoShutdown", true)
            )
            .e("mvcGroups", map()
                .e("console", map()
                    .e("model", "org.example.ConsoleModel")
                    .e("view", "org.example.ConsoleView")
                    .e("controller", "org.example.ConsoleController")
                )
            );
    }
}