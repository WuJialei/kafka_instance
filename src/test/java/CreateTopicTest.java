import org.junit.Test;
import util.Create;

import static org.junit.Assert.*;

public class CreateTopicTest {

    @Test
    public void createTopic() {
        Create create = new Create(
                "10.10.27.35:2182",
                30000,
                3000,
                false,
                "CreateTopicTest",
                1,
                1
                );
        CreateTopic createTopic = new CreateTopic();
        boolean ans = createTopic.createTopic(create);
        System.out.println("result: " + ans);
    }
}