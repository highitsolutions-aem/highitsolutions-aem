package com.highit.aem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import static org.apache.sling.api.resource.ResourceResolver.PROPERTY_RESOURCE_TYPE;

@Model(adaptables = Resource.class)
public class HeroSlingModel {

    @ValueMapValue(name="headline")
    private String head;

    @ValueMapValue(name="subHeadline")
    private String subHeadline;

    @ValueMapValue(name="ctaText")
    private String ctaText;

    @ValueMapValue(name="ctaLink")
    private String ctaLink;

    @ValueMapValue(name="fileReference")
    private String image;


    public String getHead() {
        return head;
    }

    public String getImage() {
        return image;
    }

    public String getSubHeadline() {
        return subHeadline;
    }

    public String getCtaText() {
        return ctaText;
    }

    public String getCtaLink() {
        return ctaLink;
    }
}

