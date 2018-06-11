package example.hackathon.pathfinder;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import example.hackathon.pathfinder.flight.Flight;

public class FlightsAdapter extends RecyclerView.Adapter<FlightsAdapter.FlightsViewHolder> {

    final private ArrayList<Flight> flights;
    final private UserInfo userInfo;


    public FlightsAdapter(UserInfo userInfo) {
        this.flights = new ArrayList<Flight>();
        this.userInfo = userInfo;
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

        Integer flightPrice = Math.round(flight.getValue()/62);
        String startDate = flight.getDepartDate();
        String endDate = flight.getReturnDate();
        Integer classType = flight.getTripClass();

        holder.flightPrice.setText(flightPrice.toString());
        holder.startDate.setText(startDate);
        holder.endDate.setText(endDate);
        holder.classType.setText(ClassType.findById(classType).nameId);

    }

    @Override
    public int getItemCount() {
        return flights.size();
    }

    class FlightsViewHolder extends RecyclerView.ViewHolder {
        final TextView flightPrice;
        final TextView startDate;
        final TextView endDate;
        final TextView classType;

        public FlightsViewHolder(final View itemView) {
            super(itemView);
            this.flightPrice = itemView.findViewById(R.id.flightPriceText);
            this.startDate = itemView.findViewById(R.id.ticketStartDetailsText);
            this.endDate = itemView.findViewById(R.id.ticketEndDetailsText);
            this.classType = itemView.findViewById(R.id.tripClassText);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int idOnClick = getAdapterPosition();
                    Flight flight = flights.get(idOnClick);
                    int price = ((userInfo.getSum() - flight.getValue()) / (userInfo.getDuration()*7));
                    v.getContext().startActivity(
                            Apartments.apptsIntent(
                                    v.getContext(),
                                    userInfo.getDestinationPoint(),
                                    price,
                                    flight
                            )
                    );


                }
            });
        }
    }

    public enum ClassType {
        ECONOMY(0, R.string.string_economy_type),
        BUSINESS(1, R.string.string_business_type),
        FIRST(2, R.string.string_firstClass_type);

        public final int classType;
        @StringRes
        public final int nameId;

        ClassType(int classType, @StringRes int nameId) {
            this.classType = classType;
            this.nameId = nameId;
        }

        public static ClassType findById(int id) {
            for (ClassType classType :
                    values()) {
                if (classType.classType == id) {
                    return classType;
                }
            }
            throw new NoSuchElementException();

        }
    }
}
