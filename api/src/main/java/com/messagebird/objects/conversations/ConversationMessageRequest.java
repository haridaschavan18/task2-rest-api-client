package com.messagebird.objects.conversations;

import java.util.Map;

/**
 * Request object that is used to send new messages over a channel.
 */
public class ConversationMessageRequest {

    private ConversationContentType type;
    private ConversationContent content;
    private String channelId;
    private String reportUrl;
    private String trackId;
    private String ttl;
    private Map<String, Object> source;

    public ConversationContentType getType() {
        return type;
    }

    public void setType(ConversationContentType type) {
        this.type = type;
    }

    public ConversationContent getContent() {
        return content;
    }

    public void setContent(ConversationContent content) {
        this.content = content;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public Map<String, Object> getSource() {
        return source;
    }

    public void setSource(Map<String, Object> source) {
        this.source = source;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }
    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    @Override
    public String toString() {
        return "ConversationMessageRequest{" +
                "type=" + type +
                ", content=" + content +
                ", channelId='" + channelId + '\'' +
                ", reportUrl='" + reportUrl + '\'' +
                ", source=" + source +
                ", trackID=" + trackId +
                ", ttl=" + ttl +
                '}';
    }
}