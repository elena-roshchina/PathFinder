package example.hackathon.pathfinder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import example.hackathon.pathfinder.flight.Flight;

public class FlightsAdapter extends RecyclerView.Adapter<FlightsAdapter.FlightsViewHolder> {

    private ArrayList<Flight> flights;


    public FlightsAdapter() {
        this.flights = new ArrayList<Flight>();
    }

    public void addFlights(List<Flight> flights) {
        this.flights.addAll(flights);
        notifyItemRangeInserted(this.flights.size() - flights.size(), flights.size());
    }

    @NonNull
    @Override
    public FlightsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new FlightsViewHolder(inflater.inflate(R.layout.ticket_element, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FlightsViewHolder holder, int position) {
        final Flight flight = flights.get(position);

        Integer flightPrice = flight.getValue();
        String startDate = flight.getDepartDate();
        String endDate = flight.getReturnDate();
        Integer classType = flight.getTripClass();

        holder.flightPrice.setText(flightPrice.toString());
        holder.startDate.setText(startDate);
        holder.endDate.setText(endDate);
        holder.classType.setText(classType.toString());

    }

    @Override
    public int getItemCount() {
        return flights.size();
    }

    static class FlightsViewHolder extends RecyclerView.ViewHolder {
        final TextView flightPrice;
        final TextView startDate;
        final TextView endDate;
        final TextView classType;


        public FlightsViewHolder(View itemView) {
            super(itemView);
            this.flightPrice = itemView.findViewById(R.id.flightPriceText);
            this.startDate = itemView.findViewById(R.id.ticketStartDetailsText);
            this.endDate = itemView.findViewById(R.id.ticketEndDetailsText);
            this.classType = itemView.findViewById(R.id.tripClassText);
        }
    }
}
