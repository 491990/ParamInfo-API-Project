package NewPojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"channelId","stationId","price","startTime","endTime","listingId","channelNumber","channelTitle","programTitle","type","subscriptionGuid","guid","updated","title","locationId","subscriptionGuids","seriesId","seasonNumber","seriesPaId","episodeNumber","seriesGuid","seasonId","noOfEpisodes","firstEpisodeId"})
public class Properties
{
	
	 @JsonIgnoreProperties(ignoreUnknown = true)
	 
	 
    private String year;

    private String programType;

    private String currency;

    private String programAvailabilityId;

    private Rating rating;

    private List<String> categories;

    private List<String> genre;

    private ProgramDescription programDescription;

    private String duration;

    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
        return this.year;
    }
    public void setProgramType(String programType){
        this.programType = programType;
    }
    public String getProgramType(){
        return this.programType;
    }
    public void setCurrency(String currency){
        this.currency = currency;
    }
    public String getCurrency(){
        return this.currency;
    }
    public void setProgramAvailabilityId(String programAvailabilityId){
        this.programAvailabilityId = programAvailabilityId;
    }
    public String getProgramAvailabilityId(){
        return this.programAvailabilityId;
    }
    public void setRating(Rating rating){
        this.rating = rating;
    }
    public Rating getRating(){
        return this.rating;
    }
    public void setCategories(List<String> categories){
        this.categories = categories;
    }
    public List<String> getCategories(){
        return this.categories;
    }
    public void setGenre(List<String> genre){
        this.genre = genre;
    }
    public List<String> getGenre(){
        return this.genre;
    }
    public void setProgramDescription(ProgramDescription programDescription){
        this.programDescription = programDescription;
    }
    public ProgramDescription getProgramDescription(){
        return this.programDescription;
    }
    public void setDuration(String duration){
        this.duration = duration;
    }
    public String getDuration(){
        return this.duration;
    }
}

