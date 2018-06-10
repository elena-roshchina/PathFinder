
package example.hackathon.pathfinder.airbnbmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuestDetails {

    @SerializedName("localized_description")
    @Expose
    private String localizedDescription;
    @SerializedName("number_of_adults")
    @Expose
    private Integer numberOfAdults;
    @SerializedName("number_of_children")
    @Expose
    private Integer numberOfChildren;
    @SerializedName("number_of_infants")
    @Expose
    private Integer numberOfInfants;

    public String getLocalizedDescription() {
        return localizedDescription;
    }

    public void setLocalizedDescription(String localizedDescription) {
        this.localizedDescription = localizedDescription;
    }

    public Integer getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(Integer numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public Integer getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(Integer numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public Integer getNumberOfInfants() {
        return numberOfInfants;
    }

    public void setNumberOfInfants(Integer numberOfInfants) {
        this.numberOfInfants = numberOfInfants;
    }

}
