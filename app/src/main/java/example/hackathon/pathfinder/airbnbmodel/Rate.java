
package example.hackathon.pathfinder.airbnbmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rate {

    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("amount_micros")
    @Expose
    private Object amountMicros;
    @SerializedName("amount_formatted")
    @Expose
    private String amountFormatted;
    @SerializedName("is_micros_accuracy")
    @Expose
    private Boolean isMicrosAccuracy;
    @SerializedName("currency")
    @Expose
    private String currency;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Object getAmountMicros() {
        return amountMicros;
    }

    public void setAmountMicros(Object amountMicros) {
        this.amountMicros = amountMicros;
    }

    public String getAmountFormatted() {
        return amountFormatted;
    }

    public void setAmountFormatted(String amountFormatted) {
        this.amountFormatted = amountFormatted;
    }

    public Boolean getIsMicrosAccuracy() {
        return isMicrosAccuracy;
    }

    public void setIsMicrosAccuracy(Boolean isMicrosAccuracy) {
        this.isMicrosAccuracy = isMicrosAccuracy;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
