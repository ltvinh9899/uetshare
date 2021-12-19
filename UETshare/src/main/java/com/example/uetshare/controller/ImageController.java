package com.example.uetshare.controller;


import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@RequestMapping("/image")
public class ImageController {

    @Value("${file.upload-dir}")
    String FILE_DIRECTORY;

    @Value("${folder.account.avatar}")
    String AVATAR_DIRECTORY;


    @GetMapping(  "/${folder.account.avatar}/{username}/{file_name}")
    public ResponseEntity<byte[]> getAvatar(@PathVariable("username") String username,
                                            @PathVariable("file_name") String file_name) throws IOException{

        String file_path = AVATAR_DIRECTORY + "/" + username + "/"  + file_name;

        return getFile(file_path, file_name);
    }

    @GetMapping(  "/${file.upload-dir}account_{account_id}/question_{question_id}/{file_name}")
    public ResponseEntity<byte[]> getImageQuestion(@PathVariable("account_id") Long account_id,
                                                   @PathVariable("question_id") Long question_id, @PathVariable("file_name") String file_name) throws IOException{

        String file_path = FILE_DIRECTORY + "account_" + account_id + "/question_" + question_id + "/"  + file_name;


        return getFile(file_path, file_name);

    }

    @GetMapping("/${file.upload-dir}account_{account_id}/comment_{comment_id}/{file_name}")
    public ResponseEntity<byte[]> getImageComment(@PathVariable("account_id") Long account_id,
                                                  @PathVariable("comment_id") Long comment_id, @PathVariable("file_name") String file_name) throws IOException{

        String file_path = FILE_DIRECTORY + "account_" + account_id + "/comment_" + comment_id + "/"  + file_name;

        return getFile(file_path, file_name);
    }

    @GetMapping("/${file.upload-dir}account_{account_id}/sub_comment_{sub_comment_id}/{file_name}")
    public ResponseEntity<byte[]> getImageSubComment(@PathVariable("account_id") Long account_id,
                                                     @PathVariable("sub_comment_id") Long sub_comment_id, @PathVariable("file_name") String file_name) throws IOException{

        String file_path = FILE_DIRECTORY + "account_" + account_id + "/sub_comment_" + sub_comment_id + "/"  + file_name;

        return getFile(file_path, file_name);
    }

    @GetMapping("/${file.upload-dir}account_{account_id}/exam_document_{exam_document_id}/{file_name}")
    public ResponseEntity<byte[]> getFileExamDocument(@PathVariable("account_id") Long account_id,
                                                      @PathVariable("exam_document_id") Long exam_document_id, @PathVariable("file_name") String file_name) throws IOException{

        String file_path = FILE_DIRECTORY + "account_" + account_id + "/exam_document_" + exam_document_id + "/"  + file_name;

        return getFile(file_path, file_name);
    }

    private ResponseEntity<byte[]> getFile(String file_path, String file_name) throws IOException {
        File file = new File(file_path);

        FileInputStream fileInputStream = new FileInputStream(file);

        byte[] bytes = new byte[(int) file.length()];
        fileInputStream.read(bytes);
        fileInputStream.close();

        String[] file_name_string = file_name.split("\\.");
        String type_file = "";
        if (file_name_string.length > 1) {
            type_file = file_name_string[file_name_string.length - 1];
        }
        if(type_file.equals("pdf")){
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_PDF)
                    .body(bytes);
        } else {
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.IMAGE_JPEG)
                    .contentType(MediaType.IMAGE_PNG)
                    .body(bytes);
        }

    }
}
