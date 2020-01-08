import org.junit.Test;

import static org.junit.Assert.*;

public class ProducerTest {

    @Test
    public void produce() {

        String topic = "CreateTopicTest";
        String kafkaIps = "10.10.27.35:9092";

        Producer producer = new Producer();
        try {
            producer.produce(kafkaIps, topic);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}

