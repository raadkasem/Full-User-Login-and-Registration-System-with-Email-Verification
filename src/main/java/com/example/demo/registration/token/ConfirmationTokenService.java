package com.example.demo.registration.token;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

    private final ConfirmationTokenRepository confirmationTokenRepository;
    public void saveConfirmationToken(ConfirmationToken token){
        confirmationTokenRepository.save(token);

    }

    public Optional getToken(String token) {
        return null;
    }

    public String setConfirmedAt(String token) {
        return token;
    }
}
