
package example.hackathon.pathfinder.airbnbmodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Facets {

    @SerializedName("availability")
    @Expose
    private List<Availability> availability = null;
    @SerializedName("room_type")
    @Expose
    private List<RoomType> roomType = null;
    @SerializedName("hosting_amenity_ids")
    @Expose
    private List<HostingAmenityId> hostingAmenityIds = null;
    @SerializedName("top_amenities")
    @Expose
    private List<TopAmenity> topAmenities = null;
    @SerializedName("facilities_amenities")
    @Expose
    private List<FacilitiesAmenity> facilitiesAmenities = null;
    @SerializedName("house_rules_amenities")
    @Expose
    private List<HouseRulesAmenity> houseRulesAmenities = null;
    @SerializedName("other_amenities")
    @Expose
    private List<OtherAmenity> otherAmenities = null;
    @SerializedName("top_other_amenities")
    @Expose
    private List<TopOtherAmenity> topOtherAmenities = null;

    public List<Availability> getAvailability() {
        return availability;
    }

    public void setAvailability(List<Availability> availability) {
        this.availability = availability;
    }

    public List<RoomType> getRoomType() {
        return roomType;
    }

    public void setRoomType(List<RoomType> roomType) {
        this.roomType = roomType;
    }

    public List<HostingAmenityId> getHostingAmenityIds() {
        return hostingAmenityIds;
    }

    public void setHostingAmenityIds(List<HostingAmenityId> hostingAmenityIds) {
        this.hostingAmenityIds = hostingAmenityIds;
    }

    public List<TopAmenity> getTopAmenities() {
        return topAmenities;
    }

    public void setTopAmenities(List<TopAmenity> topAmenities) {
        this.topAmenities = topAmenities;
    }

    public List<FacilitiesAmenity> getFacilitiesAmenities() {
        return facilitiesAmenities;
    }

    public void setFacilitiesAmenities(List<FacilitiesAmenity> facilitiesAmenities) {
        this.facilitiesAmenities = facilitiesAmenities;
    }

    public List<HouseRulesAmenity> getHouseRulesAmenities() {
        return houseRulesAmenities;
    }

    public void setHouseRulesAmenities(List<HouseRulesAmenity> houseRulesAmenities) {
        this.houseRulesAmenities = houseRulesAmenities;
    }

    public List<OtherAmenity> getOtherAmenities() {
        return otherAmenities;
    }

    public void setOtherAmenities(List<OtherAmenity> otherAmenities) {
        this.otherAmenities = otherAmenities;
    }

    public List<TopOtherAmenity> getTopOtherAmenities() {
        return topOtherAmenities;
    }

    public void setTopOtherAmenities(List<TopOtherAmenity> topOtherAmenities) {
        this.topOtherAmenities = topOtherAmenities;
    }

}
