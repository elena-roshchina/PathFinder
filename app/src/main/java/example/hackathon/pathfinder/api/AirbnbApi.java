package example.hackathon.pathfinder.api;

import java.util.List;

import example.hackathon.pathfinder.airbnbmodel.AirBnbModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AirbnbApi {
    @GET("/v2/search_results")
    Call<AirBnbModel> getData(@Query("client_id") String client_id,
                                    @Query("currency") String currencyName,
                                    @Query("_format") String format,
                                    @Query("_limit") int limit,
                                    @Query("location") String location,
                                    @Query("price_max") int price_max,
                                    @Query("price_min") int price_min,
                                    @Query("sort") int sort);


}
