package com.engineer.yt.dto.request;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class VideoRequest {

    String userId;
    String videoId;
    String mediaUrl;
    String title;
    String description;
    String createdAt;
    String updatedAt;

    public void validate() {

    }
}
