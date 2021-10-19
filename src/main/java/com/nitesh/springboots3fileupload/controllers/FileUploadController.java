package com.nitesh.springboots3fileupload.controllers;

import com.nitesh.springboots3fileupload.services.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/v1/")
public class FileUploadController {

    @Autowired
    private FileUploadService service;

    @PostMapping("upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        return service.uploadFile(file);
    }

}
