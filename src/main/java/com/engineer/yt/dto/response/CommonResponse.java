package com.engineer.yt.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class CommonResponse {
    private String Code;
    private String message;
    private Object data;

}
