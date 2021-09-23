package software.shattered;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.URISyntaxException;

public class TestGreeting {

    @Test
    public void shouldLoad() throws URISyntaxException {
        File config = new File(TestGreeting.class.getClassLoader().getResource("config.yml").toURI());
        var greeter = new Greeter();
        greeter.load(config);
        assert greeter.getGreeting().equals("Hello, %p%!");
        assert greeter.greet("world").equals("Hello, world!");
    }
}
