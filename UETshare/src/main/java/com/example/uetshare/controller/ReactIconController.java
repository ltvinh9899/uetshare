package com.example.uetshare.controller;

import com.example.uetshare.entity.Question;
import com.example.uetshare.entity.ReactIcon;
import com.example.uetshare.response.ReactIconResponse;
import com.example.uetshare.response.dto.ReactIconDto;
import com.example.uetshare.response.mapper.QuestionMapper;
import com.example.uetshare.response.mapper.ReactIconMapper;
import com.example.uetshare.service.ReactIconServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/react-icon")
public class ReactIconController {

    @Autowired
    private ReactIconServiceInterface reactIconServiceInterface;

    private final Integer limit = 10;

    @PostMapping("/create")
    public ResponseEntity<?> createReactInQuestion(@RequestBody ReactIcon reactIcon, ReactIconResponse reactIconResponse) {

        try {

            reactIconServiceInterface.createReactIcon(reactIcon);

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
    public ResponseEntity<?> getReactByQuestionId(@PathVariable Long id, @Param("index") Integer index, ReactIconResponse reactIconResponse) {

        try {
            Integer indexToQuery = index*limit;
            List<ReactIcon> reactIconList = reactIconServiceInterface.getReactIconByQuestionId(id, index);
            List<ReactIconDto> reactIconDtoList = new ArrayList<>();

            for(ReactIcon reactIcon : reactIconList){
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



    @GetMapping("/comment/{id}")
    public ResponseEntity<?> getReactByCommentId(@PathVariable Long id, @Param("index") Integer index, ReactIconResponse reactIconResponse) {

        try {
            Integer indexToQuery = index*limit;
            List<ReactIcon> reactIconList = reactIconServiceInterface.getReactIconByCommentId(id, index);
            List<ReactIconDto> reactIconDtoList = new ArrayList<>();

            for(ReactIcon reactIcon : reactIconList){
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

}
