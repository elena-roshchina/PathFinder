
package example.hackathon.pathfinder.airbnbmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoldenTicketUrgencyCommitment {

    @SerializedName("message_type")
    @Expose
    private String messageType;
    @SerializedName("message")
    @Expose
    private Message_ message;

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public Message_ getMessage() {
        return message;
    }

    public void setMessage(Message_ message) {
        this.message = message;
    }

}
