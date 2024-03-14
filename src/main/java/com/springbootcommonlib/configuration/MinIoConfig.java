package com.springbootcommonlib.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.minio.MinioClient;

@Configuration
public class MinIoConfig {


	@Value("${minio.endpoint:http://localhost:9000}")
	private String endpoint;
	@Value("${minio.accessKey:minioadmin}")
	private String accessKey;
	@Value("${minio.secretKey:minioadmin}")
	private String secretKey;
	
	@Value("${minio.bucket-name}")
	private String bucketName;
	
	 @Bean
	    public MinioClient minioClient() {
	        return MinioClient.builder()
	                .endpoint(endpoint)
	                .credentials(accessKey, secretKey)
	                .build();
	    }
}
