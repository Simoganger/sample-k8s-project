package com.simontech.thymeleaf.model;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileMetaData {

    private String name;
    private String url;
}
