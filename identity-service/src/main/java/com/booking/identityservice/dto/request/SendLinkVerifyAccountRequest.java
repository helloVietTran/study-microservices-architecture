package com.booking.identityservice.dto.request;

import jakarta.validation.constraints.Email;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SendLinkVerifyAccountRequest {
    @Email(message = "EMAIL_NOT_VALID")
    String email;
}
