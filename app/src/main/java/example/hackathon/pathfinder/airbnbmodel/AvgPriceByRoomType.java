
package example.hackathon.pathfinder.airbnbmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvgPriceByRoomType {

    @SerializedName("ratio")
    @Expose
    private Ratio ratio;
    @SerializedName("avg_price")
    @Expose
    private Object avgPrice;

    public Ratio getRatio() {
        return ratio;
    }

    public void setRatio(Ratio ratio) {
        this.ratio = ratio;
    }

    public Object getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Object avgPrice) {
        this.avgPrice = avgPrice;
    }

}
