
package example.hackathon.pathfinder.airbnbmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BusinessTravelReadyData {

    @SerializedName("filter_criteria")
    @Expose
    private FilterCriteria filterCriteria;
    @SerializedName("show_btr_upsell")
    @Expose
    private Boolean showBtrUpsell;

    public FilterCriteria getFilterCriteria() {
        return filterCriteria;
    }

    public void setFilterCriteria(FilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    public Boolean getShowBtrUpsell() {
        return showBtrUpsell;
    }

    public void setShowBtrUpsell(Boolean showBtrUpsell) {
        this.showBtrUpsell = showBtrUpsell;
    }

}
