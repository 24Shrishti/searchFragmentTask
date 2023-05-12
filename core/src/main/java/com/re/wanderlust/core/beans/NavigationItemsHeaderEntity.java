package com.re.wanderlust.core.beans;

import lombok.Data;

@Data
public class NavigationItemsHeaderEntity {
    private String text;
    private String url;
    private String anchorTitle;
    private String openInNewWindow;
    private String mode;
    private String flyoutPagePath;
    private String parentPagePath;
    private String iterationLevel;
}
