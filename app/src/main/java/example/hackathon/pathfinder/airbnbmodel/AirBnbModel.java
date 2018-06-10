
package example.hackathon.pathfinder.airbnbmodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AirBnbModel {

    @SerializedName("search_results")
    @Expose
    private List<SearchResult> searchResults = null;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;

    public List<SearchResult> getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(List<SearchResult> searchResults) {
        this.searchResults = searchResults;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

}
