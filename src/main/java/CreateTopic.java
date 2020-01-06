
import kafka.admin.AdminUtils;
import kafka.utils.ZkUtils;
import org.apache.kafka.common.security.JaasUtils;
import util.Create;

import java.util.Properties;

public class CreateTopic {

    public boolean createTopic(Create create) {
        boolean ans = false;
        ZkUtils zkUtils = null;
        try {
            zkUtils = ZkUtils.apply(create.getZkIpPort(), create.getSessionTimeout(), create.getLinkTimeout(), create.isSafty());
            if (!AdminUtils.topicExists(zkUtils, create.getTopicName())) {
                AdminUtils.createTopic(zkUtils, create.getTopicName(), create.getNumPartition(), create.getNumCopy(),
                        new Properties(), AdminUtils.createTopic$default$6());
                System.out.println("Creating " + create.getTopicName() + " succeeds!");
                ans = true;
            } else {
                System.out.println(create.getTopicName() + " has already existed!");
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
