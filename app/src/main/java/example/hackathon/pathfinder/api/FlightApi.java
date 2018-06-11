package example.hackathon.pathfinder.api;

import java.util.List;

import example.hackathon.pathfinder.flight.FlightResults;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FlightApi {
    @GET("prices/latest")
    Call<FlightResults> getData(@Query("token") String token,
                                @Query("origin") String origin,
                                @Query("destination") String destination,
                                @Query("beginning_of_period") String beginning_of_period,
                                @Query("period_type") String period_type,
                                @Query("show_to_affiliates") boolean show_to_affiliates,
                                @Query("limit") int limit,
                                @Query("trip_duration") int tripDuration);
}
