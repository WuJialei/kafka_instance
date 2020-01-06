package util;

public class Create {


    // zookeeper的地址，session超时时间，连接超时时间，是否启用zookeeper安全机制, topic名称，partition数量，副本数量
    private String zkIpPort;

    private  int sessionTimeout;

    private int linkTimeout;

    private boolean isSafty;

    private String topicName;

    private int numPartition;

    private int numCopy;


    public Create(String zkIpPort, int sessionTimeout, int linkTimeout, boolean isSafty, String topicName, int numPartition, int numCopy) {
        this.zkIpPort = zkIpPort;
        this.sessionTimeout = sessionTimeout;
        this.linkTimeout = linkTimeout;
        this.isSafty = isSafty;
        this.topicName = topicName;
        this.numPartition = numPartition;
        this.numCopy = numCopy;
    }

    public String getZkIpPort() {
        return zkIpPort;
    }

    public void setZkIpPort(String zkIpPort) {
        this.zkIpPort = zkIpPort;
    }

    public int getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(int sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public int getLinkTimeout() {
        return linkTimeout;
    }

    public void setLinkTimeout(int linkTimeout) {
        this.linkTimeout = linkTimeout;
    }

    public boolean isSafty() {
        return isSafty;
    }

    public void setSafty(boolean safty) {
        isSafty = safty;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public int getNumPartition() {
        return numPartition;
    }

    public void setNumPartition(int numPartition) {
        this.numPartition = numPartition;
    }

    public int getNumCopy() {
        return numCopy;
    }

    public void setNumCopy(int numCopy) {
        this.numCopy = numCopy;
    }


}
