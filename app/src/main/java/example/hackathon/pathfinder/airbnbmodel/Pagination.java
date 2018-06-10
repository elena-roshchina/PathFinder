
package example.hackathon.pathfinder.airbnbmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination {

    @SerializedName("next_offset")
    @Expose
    private Integer nextOffset;
    @SerializedName("result_count")
    @Expose
    private Integer resultCount;

    public Integer getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
    }

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

}
