package com.engineer.yt.controller;

import com.engineer.yt.dto.request.VideoRequest;
import com.engineer.yt.service.VideoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
public class VideoController {
    @Autowired
    VideoServiceImpl videoService;

    @PostMapping("/save-video")
    public String saveVideo(@RequestBody VideoRequest data) {
        return videoService.addVideo(data);
    }

    @PutMapping(value = "/edit-video", consumes = {"application/json"})
    public String editVideo(@RequestParam BigInteger id, @RequestBody VideoRequest data) {
        return videoService.editVideoById(id, data);
    }

    @DeleteMapping("/delete-video")
    public String deleteVideo(@RequestParam BigInteger id) {
        return videoService.deleteVideoById(id);
    }
}
