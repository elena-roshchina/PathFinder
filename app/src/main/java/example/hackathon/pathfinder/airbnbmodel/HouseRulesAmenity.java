
package example.hackathon.pathfinder.airbnbmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HouseRulesAmenity {

    @SerializedName("key")
    @Expose
    private Integer key;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("preselected")
    @Expose
    private Boolean preselected;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getPreselected() {
        return preselected;
    }

    public void setPreselected(Boolean preselected) {
        this.preselected = preselected;
    }

}
