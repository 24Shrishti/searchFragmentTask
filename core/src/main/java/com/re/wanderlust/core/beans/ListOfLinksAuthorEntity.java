package com.re.wanderlust.core.beans;

import com.re.wanderlust.core.models.internals.ListOfLinksAuthorAttributes;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ListOfLinksAuthorEntity {

    private ListOfLinksAuthorAttributes listOfLinksAttributes;
    private List<ListOfLinksAuthorAttributes> subLinks = new ArrayList<>();
}
