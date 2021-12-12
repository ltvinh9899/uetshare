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

@RestController
@RequestMapping("/image")
public class ImageController {

    @Value("${file.upload-dir}")
    String FILE_DIRECTORY;


    @GetMapping(  "/${file.upload-dir}account_{account_id}/question_{question_id}/{file_name}")
    public ResponseEntity<byte[]> getImageQuestion(@PathVariable("account_id") Long account_id,
                                                   @PathVariable("question_id") Long question_id, @PathVariable("file_name") String file_name) throws IOException{

        String file_path = FILE_DIRECTORY + "account_" + account_id + "/question_" + question_id + "/"  + file_name;

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .contentType(MediaType.IMAGE_JPEG)
                .body(getFile(file_path));
    }

    @GetMapping("/${file.upload-dir}account_{account_id}/comment_{comment_id}/{file_name}")
    public ResponseEntity<byte[]> getImageComment(@PathVariable("account_id") Long account_id,
                                                  @PathVariable("comment_id") Long comment_id, @PathVariable("file_name") String file_name) throws IOException{

        String file_path = FILE_DIRECTORY + "account_" + account_id + "/comment_" + comment_id + "/"  + file_name;

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .contentType(MediaType.IMAGE_JPEG)
                .body(getFile(file_path));
    }

    @GetMapping("/${file.upload-dir}account_{account_id}/sub_comment_{sub_comment_id}/{file_name}")
    public ResponseEntity<byte[]> getImageSubComment(@PathVariable("account_id") Long account_id,
                                                     @PathVariable("sub_comment_id") Long sub_comment_id, @PathVariable("file_name") String file_name) throws IOException{

        String file_path = FILE_DIRECTORY + "account_" + account_id + "/sub_comment_" + sub_comment_id + "/"  + file_name;

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .contentType(MediaType.IMAGE_JPEG)
                .body(getFile(file_path));
    }

    @GetMapping("/${file.upload-dir}account_{account_id}/exam_document_{exam_document_id}/{file_name}")
    public ResponseEntity<byte[]> getFileExamDocument(@PathVariable("account_id") Long account_id,
                                                      @PathVariable("exam_document_id") Long exam_document_id, @PathVariable("file_name") String file_name) throws IOException{

        String file_path = FILE_DIRECTORY + "account_" + account_id + "/exam_document_" + exam_document_id + "/"  + file_name;

        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_PDF)
                .body(getFile(file_path));
    }

    private byte[] getFile(String file_path) throws IOException {
        File file = new File(file_path);

        FileInputStream fileInputStream = new FileInputStream(file);

        byte[] bytes = new byte[(int) file.length()];
        fileInputStream.read(bytes);
        fileInputStream.close();

        return bytes;
    }
}
