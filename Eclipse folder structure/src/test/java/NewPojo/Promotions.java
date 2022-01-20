package NewPojo;

import java.util.ArrayList;
import java.util.List;
public class Promotions
{
    private String promotionId;

    private int orderId;

    private List<String> promoArea;

    private String promoType;

    private boolean showPrice;

    private boolean showText;

    private LocalizedTexts localizedTexts;

    private List<Properties> properties;

    private List<Images> images;

    public void setPromotionId(String promotionId){
        this.promotionId = promotionId;
    }
    public String getPromotionId(){
        return this.promotionId;
    }
    public void setOrderId(int orderId){
        this.orderId = orderId;
    }
    public int getOrderId(){
        return this.orderId;
    }
    public void setPromoArea(List<String> promoArea){
        this.promoArea = promoArea;
    }
    public List<String> getPromoArea(){
        return this.promoArea;
    }
    public void setPromoType(String promoType){
        this.promoType = promoType;
    }
    public String getPromoType(){
        return this.promoType;
    }
    public void setShowPrice(boolean showPrice){
        this.showPrice = showPrice;
    }
    public boolean getShowPrice(){
        return this.showPrice;
    }
    public void setShowText(boolean showText){
        this.showText = showText;
    }
    public boolean getShowText(){
        return this.showText;
    }
    public void setLocalizedTexts(LocalizedTexts localizedTexts){
        this.localizedTexts = localizedTexts;
    }
    public LocalizedTexts getLocalizedTexts(){
        return this.localizedTexts;
    }
    public void setProperties(List<Properties> properties){
        this.properties = properties;
    }
    public List<Properties> getProperties(){
        return this.properties;
    }
    public void setImages(List<Images> images){
        this.images = images;
    }
    public List<Images> getImages(){
        return this.images;
    }
}
