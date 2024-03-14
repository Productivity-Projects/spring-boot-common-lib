package com.springbootcommonlib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springbootcommonlib.service.MinioService;

import io.minio.Result;
import io.minio.messages.Item;

@RestController
public class MinioController {

	@Autowired
	MinioService minioService;

	@PostMapping("/upload")
	public String uploadFile(@RequestParam("file") MultipartFile file) {
		return minioService.uploadFile(file);
	}

	@GetMapping("/filecount")
	public Integer countFilesInBucket() {
		return minioService.countFilesInBucket();
	}

	@GetMapping("/filesList")
	public List<String> listOfFilesInBucket() {
		return minioService.listOfFilesInBucket();
	}
	
	

}
