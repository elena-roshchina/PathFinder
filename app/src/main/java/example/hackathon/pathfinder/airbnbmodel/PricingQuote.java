
package example.hackathon.pathfinder.airbnbmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PricingQuote {

    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("can_instant_book")
    @Expose
    private Boolean canInstantBook;
    @SerializedName("check_in")
    @Expose
    private Object checkIn;
    @SerializedName("check_out")
    @Expose
    private Object checkOut;
    @SerializedName("guests")
    @Expose
    private Integer guests;
    @SerializedName("guest_details")
    @Expose
    private GuestDetails guestDetails;
    @SerializedName("long_term_discount_amount_as_guest")
    @Expose
    private Integer longTermDiscountAmountAsGuest;
    @SerializedName("monthly_price_factor")
    @Expose
    private Object monthlyPriceFactor;
    @SerializedName("price")
    @Expose
    private Object price;
    @SerializedName("rate")
    @Expose
    private Rate rate;
    @SerializedName("rate_type")
    @Expose
    private String rateType;
    @SerializedName("rate_with_service_fee")
    @Expose
    private RateWithServiceFee rateWithServiceFee;
    @SerializedName("weekly_price_factor")
    @Expose
    private Object weeklyPriceFactor;

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Boolean getCanInstantBook() {
        return canInstantBook;
    }

    public void setCanInstantBook(Boolean canInstantBook) {
        this.canInstantBook = canInstantBook;
    }

    public Object getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Object checkIn) {
        this.checkIn = checkIn;
    }

    public Object getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Object checkOut) {
        this.checkOut = checkOut;
    }

    public Integer getGuests() {
        return guests;
    }

    public void setGuests(Integer guests) {
        this.guests = guests;
    }

    public GuestDetails getGuestDetails() {
        return guestDetails;
    }

    public void setGuestDetails(GuestDetails guestDetails) {
        this.guestDetails = guestDetails;
    }

    public Integer getLongTermDiscountAmountAsGuest() {
        return longTermDiscountAmountAsGuest;
    }

    public void setLongTermDiscountAmountAsGuest(Integer longTermDiscountAmountAsGuest) {
        this.longTermDiscountAmountAsGuest = longTermDiscountAmountAsGuest;
    }

    public Object getMonthlyPriceFactor() {
        return monthlyPriceFactor;
    }

    public void setMonthlyPriceFactor(Object monthlyPriceFactor) {
        this.monthlyPriceFactor = monthlyPriceFactor;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public RateWithServiceFee getRateWithServiceFee() {
        return rateWithServiceFee;
    }

    public void setRateWithServiceFee(RateWithServiceFee rateWithServiceFee) {
        this.rateWithServiceFee = rateWithServiceFee;
    }

    public Object getWeeklyPriceFactor() {
        return weeklyPriceFactor;
    }

    public void setWeeklyPriceFactor(Object weeklyPriceFactor) {
        this.weeklyPriceFactor = weeklyPriceFactor;
    }

}
