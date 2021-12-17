package com.example.uetshare.service;

import com.example.uetshare.entity.FirebaseToken;
import com.example.uetshare.repository.FirebaseTokenRepository;
import com.example.uetshare.response.Response;
import com.example.uetshare.response.dto.BodyFirebaseToken;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Log4j2
@Service
public class FirebaseService {
    @Autowired
    private FirebaseTokenRepository firebaseTokenRepository;

    public Response registerFirebaseToken(BodyFirebaseToken bodyFirebaseToken) {
        List<FirebaseToken> listToken = firebaseTokenRepository.getTokensByUser(bodyFirebaseToken.getUsername());

        for(FirebaseToken token : listToken) {
            if(Objects.equals(token.getToken(), bodyFirebaseToken.getFirebase_token())) {
                return new Response(false, "Đã tồn tại!", 0, 0);
            }
        }

        FirebaseToken firebaseToken = new FirebaseToken(bodyFirebaseToken.getFirebase_token(), bodyFirebaseToken.getUsername());
        firebaseTokenRepository.save(firebaseToken);
        return new Response(true, "Thành công!", 0, 0);
    }
}
