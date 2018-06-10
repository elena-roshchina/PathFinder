
package example.hackathon.pathfinder.airbnbmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Search {

    @SerializedName("business_travel_ready_data")
    @Expose
    private BusinessTravelReadyData businessTravelReadyData;
    @SerializedName("is_business_travel_verified")
    @Expose
    private Boolean isBusinessTravelVerified;
    @SerializedName("mobile_session_id")
    @Expose
    private String mobileSessionId;
    @SerializedName("native_currency")
    @Expose
    private String nativeCurrency;
    @SerializedName("price_type")
    @Expose
    private String priceType;
    @SerializedName("price_range_max_native")
    @Expose
    private Integer priceRangeMaxNative;
    @SerializedName("price_range_min_native")
    @Expose
    private Integer priceRangeMinNative;
    @SerializedName("search_id")
    @Expose
    private String searchId;

    public BusinessTravelReadyData getBusinessTravelReadyData() {
        return businessTravelReadyData;
    }

    public void setBusinessTravelReadyData(BusinessTravelReadyData businessTravelReadyData) {
        this.businessTravelReadyData = businessTravelReadyData;
    }

    public Boolean getIsBusinessTravelVerified() {
        return isBusinessTravelVerified;
    }

    public void setIsBusinessTravelVerified(Boolean isBusinessTravelVerified) {
        this.isBusinessTravelVerified = isBusinessTravelVerified;
    }

    public String getMobileSessionId() {
        return mobileSessionId;
    }

    public void setMobileSessionId(String mobileSessionId) {
        this.mobileSessionId = mobileSessionId;
    }

    public String getNativeCurrency() {
        return nativeCurrency;
    }

    public void setNativeCurrency(String nativeCurrency) {
        this.nativeCurrency = nativeCurrency;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public Integer getPriceRangeMaxNative() {
        return priceRangeMaxNative;
    }

    public void setPriceRangeMaxNative(Integer priceRangeMaxNative) {
        this.priceRangeMaxNative = priceRangeMaxNative;
    }

    public Integer getPriceRangeMinNative() {
        return priceRangeMinNative;
    }

    public void setPriceRangeMinNative(Integer priceRangeMinNative) {
        this.priceRangeMinNative = priceRangeMinNative;
    }

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

}
