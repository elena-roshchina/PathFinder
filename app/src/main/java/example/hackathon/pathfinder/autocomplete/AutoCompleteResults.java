package example.hackathon.pathfinder.autocomplete;

import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AutoCompleteResults {

    @SerializedName("index_strings")
    @Expose
    private List<AutoCompleteResult> data;

    public List<AutoCompleteResult> getData() {
        return data;
    }

    public void setData(List<AutoCompleteResult> data) {
        this.data = data;
    }
}
