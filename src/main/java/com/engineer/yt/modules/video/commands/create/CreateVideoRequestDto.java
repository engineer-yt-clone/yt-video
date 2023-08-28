package com.engineer.yt.modules.video.commands.create;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CreateVideoRequestDto {

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