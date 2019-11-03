package tugassg.wiranata.com;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Response implements Parcelable {
	@SerializedName("overview")
	private String overview;
	@SerializedName("movie")
	private String movie;
	@SerializedName("release_date")
	private String releaseDate;
	private double voteAverage;
	@SerializedName("poster_path")
	private String posterPath;
	private String Gender;

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	protected Response(Parcel in) {
		overview = in.readString();
		movie = in.readString();
		releaseDate = in.readString();
		voteAverage = in.readDouble();
		posterPath = in.readString();
	}

	public static final Creator<Response> CREATOR = new Creator<Response>() {
		@Override
		public Response createFromParcel(Parcel in) {
			return new Response(in);
		}

		@Override
		public Response[] newArray(int size) {
			return new Response[size];
		}
	};

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

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel parcel, int i) {
		parcel.writeString(overview);
		parcel.writeString(movie);
		parcel.writeString(releaseDate);
		parcel.writeDouble(voteAverage);
		parcel.writeString(posterPath);
	}
}
