
import kafka.admin.AdminUtils;
import kafka.utils.ZkUtils;
import util.Topic;

import java.util.Properties;

public class CreateTopic {


    public boolean createTopic(Topic topic) {
        boolean ans = false;
        ZkUtils zkUtils = null;
        try {
            zkUtils = ZkUtils.apply(topic.getZkIpPort(), topic.getSessionTimeout(), topic.getLinkTimeout(), topic.isSafty());
            if (!AdminUtils.topicExists(zkUtils, topic.getTopicName())) {
                AdminUtils.createTopic(zkUtils, topic.getTopicName(), topic.getNumPartition(), topic.getNumCopy(),
                        new Properties(), AdminUtils.createTopic$default$6());
                System.out.println("Creating " + topic.getTopicName() + " succeeds!");
                ans = true;
            } else {
                System.out.println(topic.getTopicName() + " has already existed!");
                ans = true;
         }
        } finally {
            if (zkUtils != null) {
                zkUtils.close();
            }
            return ans;
        }
    }


}
