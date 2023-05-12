package com.re.wanderlust.core.services;

import com.re.wanderlust.core.beans.request.GalleryEntity;

public interface GalleryCompService {
    /**
     * return the current status of the service.
     *
     * @param tourGalleryApiUrl
     * @return list
     * return to data from api.
     */
    GalleryEntity getGalleryData(String tourGalleryApiUrl);

}
