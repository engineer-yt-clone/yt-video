package com.engineer.yt.controller;

import com.engineer.yt.dto.request.VideoRequest;
import com.engineer.yt.service.VideoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {
    @Autowired
    VideoServiceImpl videoService;

    @PostMapping("/save-video")
    public String saveVideo(@RequestBody VideoRequest data) {
        return videoService.saveVideo(data);
    }
}
