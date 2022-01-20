package NewPojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Root
{
	

	    @JsonIgnoreProperties(ignoreUnknown = true)
	    
    private List<Promotions> promotions;

    public void setPromotions(List<Promotions> promotions){
        this.promotions = promotions;
    }
    public List<Promotions> getPromotions(){
        return this.promotions;
    }
}

