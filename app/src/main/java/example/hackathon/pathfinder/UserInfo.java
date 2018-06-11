package example.hackathon.pathfinder;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class UserInfo implements Parcelable {

    private UserInfo(Parcel in) {
        sum = in.readInt();
        startPoint = in.readString();
        destinationPoint = in.readString();
        startDate = (Date) in.readSerializable();
        duration = in.readInt();
    }

    UserInfo(){
        sum = 0;
        startPoint = "";
        destinationPoint = "";
        startDate = new Date();
        duration = 0;
    }

    public static final Creator<UserInfo> CREATOR = new Creator<UserInfo>() {
        @Override
        public UserInfo createFromParcel(Parcel in) {
            return new UserInfo(in);
        }

        @Override
        public UserInfo[] newArray(int size) {
            return new UserInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(sum);
        dest.writeString(startPoint);
        dest.writeString(destinationPoint);
        dest.writeSerializable(startDate);
        dest.writeSerializable(duration);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    private int sum;

    private String startPoint;

    private String destinationPoint;

    private Date startDate;

    private int duration;
}
