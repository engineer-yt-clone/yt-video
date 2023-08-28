package com.engineer.yt.modules.video.commands.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.sql.Timestamp;

@Getter
public class CreateVideoCommand extends ApplicationEvent {
    private final String userId;
    private final String videoId;
    private final String mediaUrl;
    private final String title;
    private final String description;

    CreateVideoCommand(String userId, String videoId, String mediaUrl, String title, String description) {
        super(CreateVideoCommand.class.getName());
        this.userId = userId;
        this.videoId = videoId;
        this.mediaUrl = mediaUrl;
        this.title = title;
        this.description = description;
    }
}
