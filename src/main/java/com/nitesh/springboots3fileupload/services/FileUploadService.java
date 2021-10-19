package com.nitesh.springboots3fileupload.services;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
    String uploadFile(MultipartFile fileName);
}
