package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.pw4j.domains.subdomains.Highestbuy;
import io.github.adorableskullmaster.pw4j.domains.subdomains.Lowestbuy;

public class Tradeprice extends Entity {
  @SerializedName("resource")
  @Expose
  private String resource;
  @SerializedName("avgprice")
  @Expose
  private String avgprice;
  @SerializedName("marketindex")
  @Expose
  private String marketindex;
  @SerializedName("highestbuy")
  @Expose
  private Highestbuy highestbuy;
  @SerializedName("lowestbuy")
  @Expose
  private Lowestbuy lowestbuy;

  public String getResource() {
    return resource;
  }

  public String getAvgprice() {
    return avgprice;
  }

  public String getMarketindex() {
    return marketindex;
  }

  public Highestbuy getHighestbuy() {
    return highestbuy;
  }

  public Lowestbuy getLowestbuy() {
    return lowestbuy;
  }
}