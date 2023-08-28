package com.engineer.yt.modules.video.commands.create;

import com.engineer.yt.modules.video.database.VideoRepository;
import com.engineer.yt.modules.video.domain.VideoEntity;
import com.engineer.yt.modules.video.domain.objects.Description;
import com.engineer.yt.modules.video.domain.objects.Title;
import com.engineer.yt.modules.video.domain.types.VideoMapper;
import com.engineer.yt.modules.video.domain.types.VideoProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class CreateVideoService {

    @Autowired
    private VideoRepository videoRepository;

    @EventListener
    public void handleEventCreateVideo(CreateVideoCommand createVideoCommand) {

        Title title = new Title(createVideoCommand.getTitle());
        Description description = new Description(createVideoCommand.getDescription());
        String mediaUrl = createVideoCommand.getMediaUrl();
        String userId = createVideoCommand.getUserId();
        String videoId = createVideoCommand.getVideoId();

        VideoProps videoProps = new VideoProps(title, description, mediaUrl);
        VideoMapper videoMapper = new VideoMapper();
        VideoEntity videoEntity = videoMapper.parseToEntity(userId, videoId, videoProps);

        videoRepository.save(videoEntity);
    }
}
