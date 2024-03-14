package com.springbootcommonlib.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface MinioService {

	String uploadFile(MultipartFile file);

	Integer countFilesInBucket();

	List<String> listOfFilesInBucket();

}
