package tugassg.wiranata.com;

import com.google.gson.annotations.SerializedName;

public class Response{
	@SerializedName("overview")
	private String overview;
	@SerializedName("movie")
	private String movie;
	@SerializedName("release_date")
	private String releaseDate;
	private double voteAverage;
	@SerializedName("poster_path")
	private String posterPath;

	public void setOverview(String overview){
		this.overview = overview;
	}

	public String getOverview(){
		return overview;
	}

	public void setMovie(String movie){
		this.movie = movie;
	}

	public String getMovie(){
		return movie;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public void setVoteAverage(double voteAverage){
		this.voteAverage = voteAverage;
	}

	public double getVoteAverage(){
		return voteAverage;
	}

	public void setPosterPath(String posterPath){
		this.posterPath = posterPath;
	}

	public String getPosterPath(){
		return posterPath;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"overview = '" + overview + '\'' + 
			",movie = '" + movie + '\'' + 
			",release_date = '" + releaseDate + '\'' + 
			",vote_average = '" + voteAverage + '\'' + 
			",poster_path = '" + posterPath + '\'' + 
			"}";
		}
}
