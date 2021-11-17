package com.example.uetshare.controller;

import com.example.uetshare.entity.ReactIconQuestion;
import com.example.uetshare.response.ReactIconResponse;
import com.example.uetshare.response.dto.ReactIconDto;
import com.example.uetshare.response.mapper.ReactIconMapper;
import com.example.uetshare.service.ReactIconQuestionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/react-icon-question")
public class ReactIconQuestionController {

    @Autowired
    private ReactIconQuestionServiceInterface reactIconQuestionServiceInterface;

    private final Integer limit = 10;

    @PostMapping("/create")
    public ResponseEntity<?> createReactIconInQuestion(@RequestBody ReactIconQuestion reactIcon, ReactIconResponse reactIconResponse) {

        try {

            reactIconQuestionServiceInterface.createReactIcon(reactIcon);

            reactIconResponse.setSuccess(true);
            reactIconResponse.setMessage("create success");

            List<ReactIconDto> reactIconDtoList = new ArrayList<>();
            reactIconDtoList.add(ReactIconMapper.toReactIconDto(reactIcon));
            reactIconResponse.setReactIconDtoList(reactIconDtoList);

            return ResponseEntity.ok(reactIconResponse);

        } catch (Exception e){

            reactIconResponse.setSuccess(false);
            reactIconResponse.setMessage(e.toString());


            return new ResponseEntity<>(reactIconResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

//    @PostMapping("/comment/{id}")
//    public ResponseEntity<?> createReactInComment(@RequestBody ReactIcon reactIcon, @PathVariable Long id) {
//
//        return null;
//
//    }

    @GetMapping("/question/{id}")
    public ResponseEntity<?> getReactIconByQuestionId(@PathVariable Long id, @Param("index") Integer index, ReactIconResponse reactIconResponse) {

        try {
            Integer indexToQuery = index*limit;
            List<ReactIconQuestion> reactIconList = reactIconQuestionServiceInterface.getReactIconByQuestionId(id, index);
            List<ReactIconDto> reactIconDtoList = new ArrayList<>();

            for(ReactIconQuestion reactIcon : reactIconList){
                reactIconDtoList.add(ReactIconMapper.toReactIconDto(reactIcon));
            }

            reactIconResponse.setSuccess(true);
            reactIconResponse.setMessage("success to get");
            reactIconResponse.setResult_quantity(reactIconDtoList.size());
            reactIconResponse.setReactIconDtoList(reactIconDtoList);


            return ResponseEntity.ok(reactIconResponse);


        } catch (Exception e){

            reactIconResponse.setSuccess(false);
            reactIconResponse.setMessage(e.toString());

            return new ResponseEntity<>(reactIconResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



//    @GetMapping("/comment/{id}")
//    public ResponseEntity<?> getReactByCommentId(@PathVariable Long id, @Param("index") Integer index, ReactIconResponse reactIconResponse) {
//
//        try {
//            Integer indexToQuery = index*limit;
//            List<ReactIconQuestion> reactIconList = reactIconServiceInterface.getReactIconByCommentId(id, index);
//            List<ReactIconDto> reactIconDtoList = new ArrayList<>();
//
//            for(ReactIconQuestion reactIcon : reactIconList){
//                reactIconDtoList.add(ReactIconMapper.toReactIconDto(reactIcon));
//            }
//
//            reactIconResponse.setSuccess(true);
//            reactIconResponse.setMessage("success to get");
//            reactIconResponse.setResult_quantity(reactIconDtoList.size());
//            reactIconResponse.setReactIconDtoList(reactIconDtoList);
//
//
//            return ResponseEntity.ok(reactIconResponse);
//
//
//        } catch (Exception e){
//
//            reactIconResponse.setSuccess(false);
//            reactIconResponse.setMessage(e.toString());
//
//            return new ResponseEntity<>(reactIconResponse, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//
//    }

}
