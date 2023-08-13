package com.engineer.yt.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "videos")
@Data
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private BigInteger id;

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
}
