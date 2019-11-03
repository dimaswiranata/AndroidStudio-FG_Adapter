package tugassg.wiranata.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import javax.xml.transform.Result;

public class DetailActivity extends AppCompatActivity {

    private ImageView ivBackdrop;
    private ImageView ivPoster;
    private RatingBar rbVoteAvarage;
    private TextView tvRelease;
    private TextView tvOverview;
    private TextView tvTitle;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivBackdrop = findViewById(R.id.detail_backdrop);
        ivPoster = findViewById(R.id.detail_poster);
        rbVoteAvarage = findViewById(R.id.detail_voteAverage);
        tvRelease = findViewById(R.id.detail_releaseDate);
        tvOverview = findViewById(R.id.detail_overview);
        tvTitle = findViewById(R.id.detail_title);
        ratingBar = findViewById(R.id.voteAverage);

        Response dataFromIntent = getIntent().getParcelableExtra("EXTRA_DATA");

        Glide.with(this).load(dataFromIntent.getPosterPath()).into(ivBackdrop);
        Glide.with(this).load(dataFromIntent.getPosterPath()).into(ivPoster);
        tvRelease.setText(dataFromIntent.getReleaseDate());
        tvOverview.setText(dataFromIntent.getOverview());
        tvTitle.setText(dataFromIntent.getMovie());
        rbVoteAvarage.setRating(((float) (dataFromIntent.getVoteAverage() / 2)));

    }
}
