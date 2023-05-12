package com.re.wanderlust.core.services;

import com.re.wanderlust.core.beans.FragmentEntity;
import org.apache.sling.api.SlingHttpServletRequest;

import java.util.List;

public interface SearchFragmentService {

    /**
     *This is interface of service impl class.
     *
     * @param url
     * @param request
     * @return {@link List<FragmentEntity>}
     */
    List<FragmentEntity> getFragmentData(String url,
                                         SlingHttpServletRequest request);
}
