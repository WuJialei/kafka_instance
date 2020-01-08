import org.junit.Test;
import util.Topic;

import static org.junit.Assert.*;

public class DeleteTopicTest {

    @Test
    public void deleteTopic() {

        Topic topic = new Topic(
                "10.10.27.35:2182",
                30000,
                3000,
                false,
                "CreateTopicTest",
                1,
                1
        );
        DeleteTopic deleteTopic = new DeleteTopic();
        boolean ans = deleteTopic.deleteTopic(topic);
        System.out.println("result: " + ans);

    }
}