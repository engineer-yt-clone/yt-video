package com.engineer.yt.modules.video.database;

import com.engineer.yt.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface VideoRepository extends JpaRepository<Video, BigInteger> {

}

