
package example.hackathon.pathfinder.airbnbmodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Guidebook {

    @SerializedName("continent")
    @Expose
    private String continent;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("guidebook_type")
    @Expose
    private String guidebookType;
    @SerializedName("guidebook_url")
    @Expose
    private String guidebookUrl;
    @SerializedName("header_image_url")
    @Expose
    private String headerImageUrl;
    @SerializedName("known_for")
    @Expose
    private List<String> knownFor = null;
    @SerializedName("lat")
    @Expose
    private Float lat;
    @SerializedName("lng")
    @Expose
    private Float lng;
    @SerializedName("localized_name_for_guest_page")
    @Expose
    private String localizedNameForGuestPage;
    @SerializedName("localized_name_for_homes_pdp")
    @Expose
    private String localizedNameForHomesPdp;
    @SerializedName("market_canonical_url")
    @Expose
    private String marketCanonicalUrl;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("photo_url")
    @Expose
    private String photoUrl;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("xl_photo_url")
    @Expose
    private String xlPhotoUrl;
    @SerializedName("guidebook_pictures_from_vermeer")
    @Expose
    private Object guidebookPicturesFromVermeer;
    @SerializedName("id")
    @Expose
    private Object id;

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getGuidebookType() {
        return guidebookType;
    }

    public void setGuidebookType(String guidebookType) {
        this.guidebookType = guidebookType;
    }

    public String getGuidebookUrl() {
        return guidebookUrl;
    }

    public void setGuidebookUrl(String guidebookUrl) {
        this.guidebookUrl = guidebookUrl;
    }

    public String getHeaderImageUrl() {
        return headerImageUrl;
    }

    public void setHeaderImageUrl(String headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
    }

    public List<String> getKnownFor() {
        return knownFor;
    }

    public void setKnownFor(List<String> knownFor) {
        this.knownFor = knownFor;
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

    public String getLocalizedNameForGuestPage() {
        return localizedNameForGuestPage;
    }

    public void setLocalizedNameForGuestPage(String localizedNameForGuestPage) {
        this.localizedNameForGuestPage = localizedNameForGuestPage;
    }

    public String getLocalizedNameForHomesPdp() {
        return localizedNameForHomesPdp;
    }

    public void setLocalizedNameForHomesPdp(String localizedNameForHomesPdp) {
        this.localizedNameForHomesPdp = localizedNameForHomesPdp;
    }

    public String getMarketCanonicalUrl() {
        return marketCanonicalUrl;
    }

    public void setMarketCanonicalUrl(String marketCanonicalUrl) {
        this.marketCanonicalUrl = marketCanonicalUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getXlPhotoUrl() {
        return xlPhotoUrl;
    }

    public void setXlPhotoUrl(String xlPhotoUrl) {
        this.xlPhotoUrl = xlPhotoUrl;
    }

    public Object getGuidebookPicturesFromVermeer() {
        return guidebookPicturesFromVermeer;
    }

    public void setGuidebookPicturesFromVermeer(Object guidebookPicturesFromVermeer) {
        this.guidebookPicturesFromVermeer = guidebookPicturesFromVermeer;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

}
