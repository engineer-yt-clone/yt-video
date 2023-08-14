
package com.engineer.yt.service;

import com.engineer.yt.dto.request.VideoRequest;
import com.engineer.yt.entity.Video;
import com.engineer.yt.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

@Service
public class VideoServiceImpl {
    @Autowired
    VideoRepository videoRepository;

    public String addVideo(VideoRequest data) {
        Video metaData = new Video();
        Timestamp date = new Timestamp(new Date().getTime());
        String response = "Video save success!";
        try {
            metaData.setUserId(data.getUserId()); //????
            metaData.setTitle(data.getTitle());
            metaData.setVideoId(data.getVideoId());
            metaData.setDescription(data.getDescription());
            metaData.setMediaUrl(data.getMediaUrl());
            metaData.setCreatedAt(date);
            metaData.setUpdatedAt(date);

            videoRepository.save(metaData);
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String editVideoById(BigInteger id, VideoRequest data) {
        Video metaData = videoRepository.getReferenceById(id);
        Timestamp date = new Timestamp(new Date().getTime());
        String response = "Video save success!";
        try {
            metaData.setTitle(data.getTitle());
            metaData.setDescription(data.getDescription());
            metaData.setMediaUrl(data.getMediaUrl());
            metaData.setUpdatedAt(date);

            videoRepository.save(metaData);
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String deleteVideoById(BigInteger id) {
        String response = "Delete video success!";
        try {
            videoRepository.deleteById(id);
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
