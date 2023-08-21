package com.engineer.yt.modules.video.commands.create;

import com.engineer.yt.entity.Video;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;


@Component
public class CreateVideoService {


    @EventListener
    public void handleEvent(CreateVideoCommand createVideoCommand) {

        Video metaData = new Video();
        Timestamp date = new Timestamp(new Date().getTime());
        metaData.setUserId(createVideoCommand.getUserId());
        metaData.setTitle(createVideoCommand.getTitle());
        metaData.setVideoId(createVideoCommand.getVideoId());
        metaData.setDescription(createVideoCommand.getDescription());
        metaData.setMediaUrl(createVideoCommand.getMediaUrl());
        metaData.setCreatedAt(date);
        metaData.setUpdatedAt(date);
        //Đưa phần nào vào trong VideoRepository. Chỗ này chỉ call method saveVideo từ videoRepository
//        try {
//
//
//            videoRepository.save(metaData);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }

}
