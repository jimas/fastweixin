package com.github.sd4324530.fastweixin.message.req;

public class BaseEvent extends BaseReq {

    private String event;

    public BaseEvent() {
        setMsgType(ReqType.EVENT);
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("BaseEvent [");
        if (event != null) builder.append("event=").append(event).append(", ");
        if (toUserName != null) builder.append("toUserName=").append(toUserName).append(", ");
        if (fromUserName != null) builder.append("fromUserName=").append(fromUserName).append(", ");
        builder.append("createTime=").append(createTime).append(", ");
        if (msgType != null) builder.append("msgType=").append(msgType);
        builder.append("]");
        return builder.toString();
    }
    
}
