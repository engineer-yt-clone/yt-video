package com.engineer.yt.modules.video.commands.create;

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
    public void saveVideo(@RequestBody CreateVideoRequestDto videoRequestDto) {
        CreateVideoCommand createVideoCommand = new CreateVideoCommand(videoRequestDto.getUserId(), videoRequestDto.getVideoId(), videoRequestDto.getMediaUrl(), videoRequestDto.getTitle(), videoRequestDto.getDescription());
        eventPublisher.publishEvent(createVideoCommand);
    }
}
