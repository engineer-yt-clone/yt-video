package com.engineer.yt.modules.video.domain;

import com.engineer.yt.modules.video.domain.types.VideoProps;
import jakarta.persistence.*;

import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "videos")
public class VideoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "video_id")
    private String videoId;

    @Column(name = "media_url")
    private String mediaUrl;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Transient
    private VideoProps videoProps;

    public VideoEntity(String userId, String videoId, VideoProps videoProps) {
        Timestamp createdAt = new Timestamp(System.currentTimeMillis());
        Timestamp updatedAt = new Timestamp(System.currentTimeMillis());
        this.title = videoProps.getTitle().getValue();
        this.description = videoProps.getDescription().getValue();
        this.mediaUrl = videoProps.getMediaUrl();
        this.userId = userId;
        this.videoId = videoId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;

    }

    public VideoEntity() {

    }
}
