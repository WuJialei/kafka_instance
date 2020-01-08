import kafka.admin.AdminUtils;
import kafka.utils.ZkUtils;
import util.Topic;

import java.util.Properties;

public class DeleteTopic {


    public boolean deleteTopic(Topic topic) {
        boolean ans = false;
        ZkUtils zkUtils = null;
        try {
            zkUtils = ZkUtils.apply(topic.getZkIpPort(), topic.getSessionTimeout(), topic.getLinkTimeout(), topic.isSafty());
            if (AdminUtils.topicExists(zkUtils, topic.getTopicName())) {
                AdminUtils.deleteTopic(zkUtils, topic.getTopicName());
                System.out.println("Deleting " + topic.getTopicName() + " succeeds!");
                ans = true;
            } else {
                System.out.println(topic.getTopicName() + " has never existed!");
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
