package com.engineer.yt.modules.video.commands.create;

import com.engineer.yt.dto.request.VideoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateVideoHttpController {
    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @PostMapping("/video/create")
    public void saveVideo(@RequestBody VideoRequest data) {
        CreateVideoCommand createVideoCommand = new CreateVideoCommand(data.getUserId(), data.getVideoId(), data.getMediaUrl(), data.getTitle(), data.getDescription());
        eventPublisher.publishEvent(createVideoCommand);
    }
}
