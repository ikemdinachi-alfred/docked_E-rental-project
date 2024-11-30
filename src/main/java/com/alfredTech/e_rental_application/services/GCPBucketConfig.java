package com.alfredTech.e_rental_application.services;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class GCPBucketConfig {

    @Value("${gcp.bucket.name}")
    private String bucketName;

    public String getBucketName() {
        return bucketName;
    }
}

