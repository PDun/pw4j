package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.domains.City;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class CityQuery implements IEntityQuery {
  private int cid;

  public CityQuery(int cid) {
    this.cid = cid;
  }

  @Override
  public ApiQuery build() {
    String url = QueryURL.CITY_URL.getUrl().concat("id=").concat(Integer.toString(cid));
    return new ApiQuery<>(url, new City());
  }
}