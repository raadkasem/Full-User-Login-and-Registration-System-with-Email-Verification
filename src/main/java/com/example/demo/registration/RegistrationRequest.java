package com.example.demo.registration;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
// هذا الكلاس تم عمله للسبب التالي
// عندما يمرر البزون طلب request فأننا نحتاج لالتقاط بعض المعلومات

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;

}
