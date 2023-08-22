package com.engineer.yt.modules.video.domain.types;

import com.engineer.yt.modules.video.domain.objects.Description;
import com.engineer.yt.modules.video.domain.objects.Title;
import lombok.AllArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
public class CreateVideoProps {
    private String userId;
    private String videoId;
    private Title title;
    private Description description;
    private String mediaUrl;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
