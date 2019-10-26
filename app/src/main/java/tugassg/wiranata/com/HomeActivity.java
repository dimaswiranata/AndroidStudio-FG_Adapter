package tugassg.wiranata.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView rvMain;
    private MainAdapter adapter;
    Type listType = new TypeToken<List<Response>>() {}.getType();
    private final String jsonData = "[\n" +
            "    {\n" +
            "        \"movie\": \"Fight Club\",\n" +
            "        \"release_date\": \"1999-10-15\",\n" +
            "        \"poster_path\": \"https://www.foxmovies.com/s3/dev-temp/en-US/__5979479c91993-063cba48f96602b1b3e9408fc56367f3e7bc08d5-b0b8b5e7e78fb391.jpg\",\n" +
            "        \"overview\": \"A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground fight clubsforming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"movie\": \"Fight Club\",\n" +
            "        \"release_date\": \"1999-10-15\",\n" +
            "        \"poster_path\": \"https://www.foxmovies.com/s3/dev-temp/en-US/__5979479c91993-063cba48f96602b1b3e9408fc56367f3e7bc08d5-b0b8b5e7e78fb391.jpg\",\n" +
            "        \"overview\": \"A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground fight clubsforming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"movie\": \"Fight Club\",\n" +
            "        \"release_date\": \"1999-10-15\",\n" +
            "        \"poster_path\": \"https://www.foxmovies.com/s3/dev-temp/en-US/__5979479c91993-063cba48f96602b1b3e9408fc56367f3e7bc08d5-b0b8b5e7e78fb391.jpg\",\n" +
            "        \"overview\": \"A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground fight clubsforming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"movie\": \"Fight Club\",\n" +
            "        \"release_date\": \"1999-10-15\",\n" +
            "        \"poster_path\": \"https://www.foxmovies.com/s3/dev-temp/en-US/__5979479c91993-063cba48f96602b1b3e9408fc56367f3e7bc08d5-b0b8b5e7e78fb391.jpg\",\n" +
            "        \"overview\": \"A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground fight clubsforming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"movie\": \"Fight Club\",\n" +
            "        \"release_date\": \"1999-10-15\",\n" +
            "        \"poster_path\": \"https://www.foxmovies.com/s3/dev-temp/en-US/__5979479c91993-063cba48f96602b1b3e9408fc56367f3e7bc08d5-b0b8b5e7e78fb391.jpg\",\n" +
            "        \"overview\": \"A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground fight clubsforming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.\"\n" +
            "    },\n" +
            "    {\n" +
            "       \"movie\": \"Fight Club\",\n" +
            "        \"release_date\": \"1999-10-15\",\n" +
            "        \"poster_path\": \"https://www.foxmovies.com/s3/dev-temp/en-US/__5979479c91993-063cba48f96602b1b3e9408fc56367f3e7bc08d5-b0b8b5e7e78fb391.jpg\",\n" +
            "        \"overview\": \"A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground fight clubsforming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.\"\n" +
            "    }\n" +
            "]\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rvMain = findViewById(R.id.rv_fpl);

        Gson gson = new Gson();

        List<Response> data = gson.fromJson(jsonData, listType);
        adapter = new MainAdapter(data);

        rvMain.setAdapter(adapter);
        rvMain.setLayoutManager(new LinearLayoutManager(this));

        rvMain.setItemAnimator(new DefaultItemAnimator());
    }
}
