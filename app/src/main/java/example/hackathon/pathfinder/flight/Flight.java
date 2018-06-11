
package example.hackathon.pathfinder.flight;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Flight implements Parcelable{

    @SerializedName("value")
    @Expose
    private Integer value;
    @SerializedName("trip_class")
    @Expose
    private Integer tripClass;
    @SerializedName("show_to_affiliates")
    @Expose
    private Boolean showToAffiliates;
    @SerializedName("return_date")
    @Expose
    private String returnDate;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("number_of_changes")
    @Expose
    private Integer numberOfChanges;
    @SerializedName("gate")
    @Expose
    private Object gate;
    @SerializedName("found_at")
    @Expose
    private String foundAt;
    @SerializedName("duration")
    @Expose
    private Object duration;
    @SerializedName("distance")
    @Expose
    private Integer distance;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("depart_date")
    @Expose
    private String departDate;
    @SerializedName("actual")
    @Expose
    private Boolean actual;

    protected Flight(Parcel in) {
        if (in.readByte() == 0) {
            value = null;
        } else {
            value = in.readInt();
        }
        if (in.readByte() == 0) {
            tripClass = null;
        } else {
            tripClass = in.readInt();
        }
        byte tmpShowToAffiliates = in.readByte();
        showToAffiliates = tmpShowToAffiliates == 0 ? null : tmpShowToAffiliates == 1;
        returnDate = in.readString();
        origin = in.readString();
        if (in.readByte() == 0) {
            numberOfChanges = null;
        } else {
            numberOfChanges = in.readInt();
        }
        foundAt = in.readString();
        if (in.readByte() == 0) {
            distance = null;
        } else {
            distance = in.readInt();
        }
        destination = in.readString();
        departDate = in.readString();
        byte tmpActual = in.readByte();
        actual = tmpActual == 0 ? null : tmpActual == 1;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (value == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(value);
        }
        if (tripClass == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(tripClass);
        }
        dest.writeByte((byte) (showToAffiliates == null ? 0 : showToAffiliates ? 1 : 2));
        dest.writeString(returnDate);
        dest.writeString(origin);
        if (numberOfChanges == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(numberOfChanges);
        }
        dest.writeString(foundAt);
        if (distance == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(distance);
        }
        dest.writeString(destination);
        dest.writeString(departDate);
        dest.writeByte((byte) (actual == null ? 0 : actual ? 1 : 2));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Flight> CREATOR = new Creator<Flight>() {
        @Override
        public Flight createFromParcel(Parcel in) {
            return new Flight(in);
        }

        @Override
        public Flight[] newArray(int size) {
            return new Flight[size];
        }
    };

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getTripClass() {
        return tripClass;
    }

    public void setTripClass(Integer tripClass) {
        this.tripClass = tripClass;
    }

    public Boolean getShowToAffiliates() {
        return showToAffiliates;
    }

    public void setShowToAffiliates(Boolean showToAffiliates) {
        this.showToAffiliates = showToAffiliates;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getNumberOfChanges() {
        return numberOfChanges;
    }

    public void setNumberOfChanges(Integer numberOfChanges) {
        this.numberOfChanges = numberOfChanges;
    }

    public Object getGate() {
        return gate;
    }

    public void setGate(Object gate) {
        this.gate = gate;
    }

    public String getFoundAt() {
        return foundAt;
    }

    public void setFoundAt(String foundAt) {
        this.foundAt = foundAt;
    }

    public Object getDuration() {
        return duration;
    }

    public void setDuration(Object duration) {
        this.duration = duration;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartDate() {
        return departDate;
    }

    public void setDepartDate(String departDate) {
        this.departDate = departDate;
    }

    public Boolean getActual() {
        return actual;
    }

    public void setActual(Boolean actual) {
        this.actual = actual;
    }

}
