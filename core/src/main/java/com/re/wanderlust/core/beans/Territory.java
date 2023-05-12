package com.re.wanderlust.core.beans;

import com.re.wanderlust.core.models.internals.TerritoryAttribute;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Territory {
private TerritoryAttribute territoryAttribute;
private List<Country> countryList = new ArrayList<>();
private String countryListJson;
}
