package tugassg.wiranata.com;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import tugassg.wiranata.com.R;
import tugassg.wiranata.com.Response;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private List<Response> data = new ArrayList<>();

    public MainAdapter(List<Response> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bindDataToView(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivPoster;
        private TextView tvTitle;
        private TextView tvOverview ;
        private TextView tvRelease;
        private RatingBar ratingBar;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

            ivPoster = itemView.findViewById(R.id.poster);
            tvTitle = itemView.findViewById(R.id.title);
            tvOverview = itemView.findViewById(R.id.overview);
            tvRelease = itemView.findViewById(R.id.release_date);
            ratingBar = itemView.findViewById(R.id.voteAverage);
        }

        public void bindDataToView(final Response team){
            team.setVoteAverage(9);
            team.setGender("Action");
            Glide.with(itemView.getContext()).load(team.getPosterPath()).into(ivPoster);
            tvTitle.setText(team.getMovie());
            tvOverview.setText(team.getOverview());
            tvRelease.setText(team.getReleaseDate());
            ratingBar.setRating(((float) (team.getVoteAverage() / 2)));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(itemView.getContext(), team.getMovie(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                    intent.putExtra("EXTRA_DATA", team);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
