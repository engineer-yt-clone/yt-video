package com.engineer.yt.modules.video.domain.types;

import com.engineer.yt.modules.video.domain.VideoEntity;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class VideoMapper {
    private Long id;
    private String userId;
    private String videoId;
    private String title;
    private String description;
    private String mediaUrl;

    private Timestamp createdAt;
    private Timestamp updatedAt;


    public VideoEntity parseToEntity(String userId, String videoId, VideoProps videoProps) {
        VideoEntity videoEntity = new VideoEntity();
        Timestamp createdAt = new Timestamp(System.currentTimeMillis());
        Timestamp updatedAt = new Timestamp(System.currentTimeMillis());
        videoEntity.setUserId(userId);
        videoEntity.setVideoId(videoId);
        videoEntity.setTitle(videoProps.getTitle().getValue());
        videoEntity.setDescription(videoProps.getDescription().getValue());
        videoEntity.setMediaUrl(videoProps.getMediaUrl());
        videoEntity.setCreatedAt(createdAt);
        videoEntity.setUpdatedAt(updatedAt);

        return videoEntity;
    }

}
