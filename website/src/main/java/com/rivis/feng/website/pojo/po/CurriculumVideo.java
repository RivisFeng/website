package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class CurriculumVideo {
    private Long videoId;

    private Long videoCurriculumId;

    private String videoName;

    private String videoUrl;

    private String videoSort;

    private String videoState;

    private Date videoCreateTime;

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public Long getVideoCurriculumId() {
        return videoCurriculumId;
    }

    public void setVideoCurriculumId(Long videoCurriculumId) {
        this.videoCurriculumId = videoCurriculumId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public String getVideoSort() {
        return videoSort;
    }

    public void setVideoSort(String videoSort) {
        this.videoSort = videoSort == null ? null : videoSort.trim();
    }

    public String getVideoState() {
        return videoState;
    }

    public void setVideoState(String videoState) {
        this.videoState = videoState == null ? null : videoState.trim();
    }

    public Date getVideoCreateTime() {
        return videoCreateTime;
    }

    public void setVideoCreateTime(Date videoCreateTime) {
        this.videoCreateTime = videoCreateTime;
    }
}