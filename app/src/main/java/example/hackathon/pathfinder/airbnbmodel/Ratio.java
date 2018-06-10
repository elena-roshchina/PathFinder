
package example.hackathon.pathfinder.airbnbmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ratio {

    @SerializedName("Entire home/apt")
    @Expose
    private Float entireHomeApt;
    @SerializedName("Private room")
    @Expose
    private Float privateRoom;
    @SerializedName("Shared room")
    @Expose
    private Float sharedRoom;

    public Float getEntireHomeApt() {
        return entireHomeApt;
    }

    public void setEntireHomeApt(Float entireHomeApt) {
        this.entireHomeApt = entireHomeApt;
    }

    public Float getPrivateRoom() {
        return privateRoom;
    }

    public void setPrivateRoom(Float privateRoom) {
        this.privateRoom = privateRoom;
    }

    public Float getSharedRoom() {
        return sharedRoom;
    }

    public void setSharedRoom(Float sharedRoom) {
        this.sharedRoom = sharedRoom;
    }

}
