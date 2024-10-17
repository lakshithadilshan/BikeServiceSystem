package com.example.demo.Admin.Bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@NoArgsConstructor
public class Requestbean {
    private String adminNameadminName;
    private String password;
    private Object requestBody;

}
