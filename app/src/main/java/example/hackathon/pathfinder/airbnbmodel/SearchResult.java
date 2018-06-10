
package example.hackathon.pathfinder.airbnbmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchResult {

    @SerializedName("listing")
    @Expose
    private Listing listing;
    @SerializedName("pricing_quote")
    @Expose
    private PricingQuote pricingQuote;
    @SerializedName("viewed_at")
    @Expose
    private Object viewedAt;

    public Listing getListing() {
        return listing;
    }

    public void setListing(Listing listing) {
        this.listing = listing;
    }

    public PricingQuote getPricingQuote() {
        return pricingQuote;
    }

    public void setPricingQuote(PricingQuote pricingQuote) {
        this.pricingQuote = pricingQuote;
    }

    public Object getViewedAt() {
        return viewedAt;
    }

    public void setViewedAt(Object viewedAt) {
        this.viewedAt = viewedAt;
    }

}
