package com.re.wanderlust.core.beans;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SectionHeadingEntity {

   private String sectionHeading;
    private List<ListOfLinksAuthorEntity> listOfLinks = new ArrayList<>();
}
