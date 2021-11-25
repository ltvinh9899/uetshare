package com.example.uetshare.response;

import com.example.uetshare.response.dto.NotificationCommentDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class NotificationCommentResponse extends Response{

    private List<NotificationCommentDto> notificationCommentDtoList;

}
