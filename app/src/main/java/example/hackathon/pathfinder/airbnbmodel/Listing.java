
package example.hackathon.pathfinder.airbnbmodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Listing {

    @SerializedName("bathrooms")
    @Expose
    private Float bathrooms;
    @SerializedName("bedrooms")
    @Expose
    private Integer bedrooms;
    @SerializedName("beds")
    @Expose
    private Integer beds;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("extra_host_languages")
    @Expose
    private List<Object> extraHostLanguages = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("instant_bookable")
    @Expose
    private Boolean instantBookable;
    @SerializedName("is_business_travel_ready")
    @Expose
    private Boolean isBusinessTravelReady;
    @SerializedName("is_family_preferred")
    @Expose
    private Boolean isFamilyPreferred;
    @SerializedName("is_new_listing")
    @Expose
    private Boolean isNewListing;
    @SerializedName("lat")
    @Expose
    private Float lat;
    @SerializedName("lng")
    @Expose
    private Float lng;
    @SerializedName("localized_city")
    @Expose
    private String localizedCity;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("neighborhood")
    @Expose
    private String neighborhood;
    @SerializedName("person_capacity")
    @Expose
    private Integer personCapacity;
    @SerializedName("picture_count")
    @Expose
    private Integer pictureCount;
    @SerializedName("picture_url")
    @Expose
    private String pictureUrl;
    @SerializedName("primary_host")
    @Expose
    private PrimaryHost primaryHost;
    @SerializedName("property_type_id")
    @Expose
    private Integer propertyTypeId;
    @SerializedName("property_type")
    @Expose
    private String propertyType;
    @SerializedName("public_address")
    @Expose
    private String publicAddress;
    @SerializedName("reviews_count")
    @Expose
    private Integer reviewsCount;
    @SerializedName("room_type_category")
    @Expose
    private String roomTypeCategory;
    @SerializedName("room_type")
    @Expose
    private String roomType;
    @SerializedName("scrim_color")
    @Expose
    private String scrimColor;
    @SerializedName("space_type")
    @Expose
    private String spaceType;
    @SerializedName("star_rating")
    @Expose
    private Float starRating;
    @SerializedName("thumbnail_url")
    @Expose
    private String thumbnailUrl;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("xl_picture_url")
    @Expose
    private String xlPictureUrl;
    @SerializedName("preview_encoded_png")
    @Expose
    private String previewEncodedPng;
    @SerializedName("picture_urls")
    @Expose
    private List<String> pictureUrls = null;
    @SerializedName("xl_picture_urls")
    @Expose
    private List<String> xlPictureUrls = null;

    public Float getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Float bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Object> getExtraHostLanguages() {
        return extraHostLanguages;
    }

    public void setExtraHostLanguages(List<Object> extraHostLanguages) {
        this.extraHostLanguages = extraHostLanguages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getInstantBookable() {
        return instantBookable;
    }

    public void setInstantBookable(Boolean instantBookable) {
        this.instantBookable = instantBookable;
    }

    public Boolean getIsBusinessTravelReady() {
        return isBusinessTravelReady;
    }

    public void setIsBusinessTravelReady(Boolean isBusinessTravelReady) {
        this.isBusinessTravelReady = isBusinessTravelReady;
    }

    public Boolean getIsFamilyPreferred() {
        return isFamilyPreferred;
    }

    public void setIsFamilyPreferred(Boolean isFamilyPreferred) {
        this.isFamilyPreferred = isFamilyPreferred;
    }

    public Boolean getIsNewListing() {
        return isNewListing;
    }

    public void setIsNewListing(Boolean isNewListing) {
        this.isNewListing = isNewListing;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public String getLocalizedCity() {
        return localizedCity;
    }

    public void setLocalizedCity(String localizedCity) {
        this.localizedCity = localizedCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Integer getPersonCapacity() {
        return personCapacity;
    }

    public void setPersonCapacity(Integer personCapacity) {
        this.personCapacity = personCapacity;
    }

    public Integer getPictureCount() {
        return pictureCount;
    }

    public void setPictureCount(Integer pictureCount) {
        this.pictureCount = pictureCount;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public PrimaryHost getPrimaryHost() {
        return primaryHost;
    }

    public void setPrimaryHost(PrimaryHost primaryHost) {
        this.primaryHost = primaryHost;
    }

    public Integer getPropertyTypeId() {
        return propertyTypeId;
    }

    public void setPropertyTypeId(Integer propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getPublicAddress() {
        return publicAddress;
    }

    public void setPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
    }

    public Integer getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public String getRoomTypeCategory() {
        return roomTypeCategory;
    }

    public void setRoomTypeCategory(String roomTypeCategory) {
        this.roomTypeCategory = roomTypeCategory;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getScrimColor() {
        return scrimColor;
    }

    public void setScrimColor(String scrimColor) {
        this.scrimColor = scrimColor;
    }

    public String getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    public Float getStarRating() {
        return starRating;
    }

    public void setStarRating(Float starRating) {
        this.starRating = starRating;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getXlPictureUrl() {
        return xlPictureUrl;
    }

    public void setXlPictureUrl(String xlPictureUrl) {
        this.xlPictureUrl = xlPictureUrl;
    }

    public String getPreviewEncodedPng() {
        return previewEncodedPng;
    }

    public void setPreviewEncodedPng(String previewEncodedPng) {
        this.previewEncodedPng = previewEncodedPng;
    }

    public List<String> getPictureUrls() {
        return pictureUrls;
    }

    public void setPictureUrls(List<String> pictureUrls) {
        this.pictureUrls = pictureUrls;
    }

    public List<String> getXlPictureUrls() {
        return xlPictureUrls;
    }

    public void setXlPictureUrls(List<String> xlPictureUrls) {
        this.xlPictureUrls = xlPictureUrls;
    }

}
