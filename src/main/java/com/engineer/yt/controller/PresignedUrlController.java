package com.engineer.yt.controller;

import com.amazonaws.HttpMethod;
import com.engineer.yt.service.PresignedUrlImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController

public class PresignedUrlController {
    @Autowired
    PresignedUrlImpl awsS3Service;
    @Value("${aws.s3.bucket}")
    private String bucketName;

    @GetMapping("/generate-presigned-url")
    public ResponseEntity<Map<String, String>> generatePresignedUrl(@RequestParam String extension) {
        String videoID = UUID.randomUUID().toString();
        String presignedURL = awsS3Service.generatePreSignedUrl(videoID + "." + extension, bucketName, HttpMethod.PUT);

        Map<String, String> response = new HashMap<>();
        response.put("videoID", videoID);
        response.put("presignedURL", presignedURL);
        response.put("extension", extension);
        return ResponseEntity.ok(response);
    }
}
