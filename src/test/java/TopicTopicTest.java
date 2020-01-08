import org.junit.Test;
import util.Topic;

public class TopicTopicTest {

    @Test
    public void createTopic() {
        Topic topic = new Topic(
                "10.10.27.35:2182",
                30000,
                3000,
                false,
                "CreateTopicTest",
                1,
                1
                );
        CreateTopic createTopic = new CreateTopic();
        boolean ans = createTopic.createTopic(topic);
        System.out.println("result: " + ans);
    }
}