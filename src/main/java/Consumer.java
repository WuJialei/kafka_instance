import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Arrays;
import java.util.Properties;

public class Consumer {

    public void consume(String kafkaIps, String topic, String group) throws InterruptedException{

        Properties config = new Properties();
        // 设置kafka服务列表，多个用逗号分隔
        config.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaIps);
        // 设置消费者分组id
        config.setProperty(ConsumerConfig.GROUP_ID_CONFIG, group);
        // 设置序反列化消息 Key 的类
        config.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        // 设置序反列化消息 value 的类
        config.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());

        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<String, String>(config);

        kafkaConsumer.subscribe(Arrays.asList(topic));

        while (true) {
            ConsumerRecords<String, String> records = kafkaConsumer.poll(1000);
            for (ConsumerRecord<String, String> record : records) {
                String value = record.value();
                long offset = record.offset();
                System.out.println("value = " + value + ", offset = " + offset);
            }
        }

    }

}
