package com.engineer.yt.modules.video.domain.types;

import com.engineer.yt.modules.video.domain.objects.Description;
import com.engineer.yt.modules.video.domain.objects.Title;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class VideoProps {
    private Title title;
    private Description description;
    private String mediaUrl;
}
