package com.engineer.yt.dto.response;

import org.springframework.stereotype.Component;

@Component
public class VideoResponse {
    CommonResponse response;

    public CommonResponse responseWeb(String code, String message) {
        response.setCode(code);
        response.setData(message);
        return response;
    }
}
