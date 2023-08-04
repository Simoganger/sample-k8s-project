package com.simontech.thymeleaf.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface FileStorageService {

    void initStorage();
    void store(MultipartFile file);
    Resource load(String fileName);
    Stream<Path> loadAll();

}
