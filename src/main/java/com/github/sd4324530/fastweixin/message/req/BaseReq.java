package com.github.sd4324530.fastweixin.message.req;

public class BaseReq {

    String toUserName;
    String fromUserName;
    long   createTime;
    String msgType;

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("BaseReq [");
        if (toUserName != null) builder.append("toUserName=").append(toUserName).append(", ");
        if (fromUserName != null) builder.append("fromUserName=").append(fromUserName).append(", ");
        builder.append("createTime=").append(createTime).append(", ");
        if (msgType != null) builder.append("msgType=").append(msgType);
        builder.append("]");
        return builder.toString();
    }
    
}
