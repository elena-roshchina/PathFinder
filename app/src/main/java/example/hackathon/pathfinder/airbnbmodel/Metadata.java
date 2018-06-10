
package example.hackathon.pathfinder.airbnbmodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("guidebook")
    @Expose
    private Guidebook guidebook;
    @SerializedName("search")
    @Expose
    private Search search;
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("facets")
    @Expose
    private Facets facets;
    @SerializedName("listings_count")
    @Expose
    private Integer listingsCount;
    @SerializedName("urgency_commitment")
    @Expose
    private UrgencyCommitment urgencyCommitment;
    @SerializedName("golden_ticket_urgency_commitment")
    @Expose
    private GoldenTicketUrgencyCommitment goldenTicketUrgencyCommitment;
    @SerializedName("listing_cards_urgency_commitment_metadata")
    @Expose
    private List<Object> listingCardsUrgencyCommitmentMetadata = null;
    @SerializedName("listing_cards_price_line_urgency_commitment_metadata")
    @Expose
    private List<Object> listingCardsPriceLineUrgencyCommitmentMetadata = null;
    @SerializedName("price_histogram")
    @Expose
    private Object priceHistogram;
    @SerializedName("search_feed_items")
    @Expose
    private List<Object> searchFeedItems = null;
    @SerializedName("avg_price_by_room_type")
    @Expose
    private AvgPriceByRoomType avgPriceByRoomType;
    @SerializedName("messages")
    @Expose
    private Object messages;
    @SerializedName("overrides")
    @Expose
    private Overrides overrides;

    public Guidebook getGuidebook() {
        return guidebook;
    }

    public void setGuidebook(Guidebook guidebook) {
        this.guidebook = guidebook;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Facets getFacets() {
        return facets;
    }

    public void setFacets(Facets facets) {
        this.facets = facets;
    }

    public Integer getListingsCount() {
        return listingsCount;
    }

    public void setListingsCount(Integer listingsCount) {
        this.listingsCount = listingsCount;
    }

    public UrgencyCommitment getUrgencyCommitment() {
        return urgencyCommitment;
    }

    public void setUrgencyCommitment(UrgencyCommitment urgencyCommitment) {
        this.urgencyCommitment = urgencyCommitment;
    }

    public GoldenTicketUrgencyCommitment getGoldenTicketUrgencyCommitment() {
        return goldenTicketUrgencyCommitment;
    }

    public void setGoldenTicketUrgencyCommitment(GoldenTicketUrgencyCommitment goldenTicketUrgencyCommitment) {
        this.goldenTicketUrgencyCommitment = goldenTicketUrgencyCommitment;
    }

    public List<Object> getListingCardsUrgencyCommitmentMetadata() {
        return listingCardsUrgencyCommitmentMetadata;
    }

    public void setListingCardsUrgencyCommitmentMetadata(List<Object> listingCardsUrgencyCommitmentMetadata) {
        this.listingCardsUrgencyCommitmentMetadata = listingCardsUrgencyCommitmentMetadata;
    }

    public List<Object> getListingCardsPriceLineUrgencyCommitmentMetadata() {
        return listingCardsPriceLineUrgencyCommitmentMetadata;
    }

    public void setListingCardsPriceLineUrgencyCommitmentMetadata(List<Object> listingCardsPriceLineUrgencyCommitmentMetadata) {
        this.listingCardsPriceLineUrgencyCommitmentMetadata = listingCardsPriceLineUrgencyCommitmentMetadata;
    }

    public Object getPriceHistogram() {
        return priceHistogram;
    }

    public void setPriceHistogram(Object priceHistogram) {
        this.priceHistogram = priceHistogram;
    }

    public List<Object> getSearchFeedItems() {
        return searchFeedItems;
    }

    public void setSearchFeedItems(List<Object> searchFeedItems) {
        this.searchFeedItems = searchFeedItems;
    }

    public AvgPriceByRoomType getAvgPriceByRoomType() {
        return avgPriceByRoomType;
    }

    public void setAvgPriceByRoomType(AvgPriceByRoomType avgPriceByRoomType) {
        this.avgPriceByRoomType = avgPriceByRoomType;
    }

    public Object getMessages() {
        return messages;
    }

    public void setMessages(Object messages) {
        this.messages = messages;
    }

    public Overrides getOverrides() {
        return overrides;
    }

    public void setOverrides(Overrides overrides) {
        this.overrides = overrides;
    }

}
