package com.example.uetshare.response;

import com.example.uetshare.entity.Category;
import com.example.uetshare.response.dto.CategoryDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class CategoryResponse extends Response{

    private List<CategoryDto> categoryDtoList;

}
