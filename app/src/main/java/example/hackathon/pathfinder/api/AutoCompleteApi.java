package example.hackathon.pathfinder.api;

import java.util.List;

import example.hackathon.pathfinder.autocomplete.AutoCompleteResult;
import example.hackathon.pathfinder.autocomplete.AutoCompleteResults;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AutoCompleteApi {
    @GET("places2?")
    Call<List<AutoCompleteResult>> getData(@Query("term") String term,
                                           @Query("locale") String locale,
                                           @Query("types") String types);
}
