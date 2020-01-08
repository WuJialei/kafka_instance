import org.junit.Test;

import static org.junit.Assert.*;

public class ConsumerTest {

    @Test
    public void consume() {
        String topic = "CreateTopicTest";
        String kafkaIps = "10.10.27.35:9092";
        String group = " ";

        Consumer consumer = new Consumer();
        try {
            consumer.consume(kafkaIps, topic, group);
            //consumer.consume(kafkaIps, topic);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

