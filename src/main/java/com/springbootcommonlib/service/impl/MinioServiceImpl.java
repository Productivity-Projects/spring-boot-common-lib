package com.springbootcommonlib.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.springbootcommonlib.service.MinioService;
import com.springbootcommonlib.utils.MinioClinetUtils;

import io.minio.ListObjectsArgs;
import io.minio.MinioClient;
import io.minio.Result;
import io.minio.messages.Item;

@Component
public class MinioServiceImpl implements MinioService {

	@Autowired
	MinioClinetUtils minioClinetUtils;
	@Autowired
	MinioClient minioClient;

	@Value("${minio.bucket-name}")
	private String bucketName;

	@Override
	public String uploadFile(MultipartFile file) {

		if (minioClinetUtils.uploadFile(bucketName, file)) {
			// "redirect:/"
			return "pass";
		}
		return "failed";
	}

	@Override
	public Integer countFilesInBucket() {
		try {
			Iterable<Result<Item>> results = minioClient
					.listObjects(ListObjectsArgs.builder().bucket(bucketName).build());
			int count = 0;
			for (Result<Item> result : results) {
				count++;
			}
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1; // Return -1 to indicate an error
		}
	}

	@Override
	public List<String> listOfFilesInBucket() {

		try {
			Iterable<Result<Item>> results = minioClient
					.listObjects(ListObjectsArgs.builder().bucket(bucketName).build());
			List<String> fileList = new ArrayList<>();
			for (Result<Item> result : results) {
				Item item = result.get();
				fileList.add(item.objectName());
			}
			return fileList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
