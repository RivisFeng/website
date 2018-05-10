package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class CurriculumFeature {
    private Long featureId;

    private String featureName;

    private String featureState;

    private Date featureCreateTime;

    public Long getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Long featureId) {
        this.featureId = featureId;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName == null ? null : featureName.trim();
    }

    public String getFeatureState() {
        return featureState;
    }

    public void setFeatureState(String featureState) {
        this.featureState = featureState == null ? null : featureState.trim();
    }

    public Date getFeatureCreateTime() {
        return featureCreateTime;
    }

    public void setFeatureCreateTime(Date featureCreateTime) {
        this.featureCreateTime = featureCreateTime;
    }
}