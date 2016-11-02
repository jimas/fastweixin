package com.github.sd4324530.fastweixin.message.req;

public class BaseReqMsg extends BaseReq {

    String msgId;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("BaseReqMsg [");
        if (msgId != null) builder.append("msgId=").append(msgId).append(", ");
        if (toUserName != null) builder.append("toUserName=").append(toUserName).append(", ");
        if (fromUserName != null) builder.append("fromUserName=").append(fromUserName).append(", ");
        builder.append("createTime=").append(createTime).append(", ");
        if (msgType != null) builder.append("msgType=").append(msgType);
        builder.append("]");
        return builder.toString();
    }
    
}
