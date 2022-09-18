package com.programming.techie.youtubeclone.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDTO {
    private String id;
    @JsonProperty("sub")
    private String sub;
    @JsonProperty("given_name")
    private String givenName;
    @JsonProperty("family_name")
    private String familyName;
    private String nickname;
    @JsonProperty("name")
    private String name;
    @JsonProperty("picture")
    private String picture;
    private String locale;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("email_verified")
    private String emailVerified;
    private String email;
}
