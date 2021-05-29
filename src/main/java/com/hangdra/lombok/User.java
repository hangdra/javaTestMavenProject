package com.hangdra.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String name;
    private Long id;
    private String password;
    private String email;
    private String phoneNumber;
    private Integer status;
    private String salt;
}
