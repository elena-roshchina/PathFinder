package example.hackathon.pathfinder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import example.hackathon.pathfinder.airbnbmodel.SearchResult;

public class AirbnbAdapter extends RecyclerView.Adapter<AirbnbAdapter.ViewHolder> {

    private List<SearchResult> searchResults;
    private OnItemClickListener clickListener;

    public AirbnbAdapter(List<SearchResult> searchResults, OnItemClickListener clickListener) {
        this.searchResults = searchResults;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.apps_element, parent, false);
        return new ViewHolder(v, clickListener);

    }

    @Override
    public void onBindViewHolder(@NonNull AirbnbAdapter.ViewHolder holder, int position) {
        SearchResult apptsItem = searchResults.get(position);

        String imageURL = apptsItem.getListing().getPictureUrl();

        Picasso.get().load(imageURL).into(holder.image);
        Integer rateAmount = (apptsItem.getPricingQuote()
                .getRate().getAmount() == null ? 0 : apptsItem.getPricingQuote().getRate().getAmount());
        String s = rateAmount.toString();
        holder.price.setText(s);
        holder.price.append("USD");
        Float rating = apptsItem.getListing().getStarRating();
        holder.rating.setRating(rating == null ? 0f : rating);


    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        if (searchResults == null) {
            return 0;
        }
        return searchResults.size();
    }

    interface OnItemClickListener {
        void onItemClick(@NonNull SearchResult searchResult, int position);
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView image;
        final TextView price;
        final RatingBar rating;

        ViewHolder(View itemView, final OnItemClickListener clickListener) {
            super(itemView);
            this.image = itemView.findViewById(R.id.appsImage);
            this.price = itemView.findViewById(R.id.appsPrice);
            this.rating = itemView.findViewById(R.id.appsRating);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickListener.onItemClick(
                            searchResults.get(getAdapterPosition()), getAdapterPosition()
                    );
                }
            });
        }
    }
}
