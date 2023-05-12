package com.re.wanderlust.core.beans;

import com.re.wanderlust.core.models.internals.RideList;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

@Data
public class RideListEntity {
    private List<RideList> rideLists = new ArrayList<>();
    private Map<String, String> categories = new HashMap<>();
    private Set<String> location = new HashSet<>();
}


