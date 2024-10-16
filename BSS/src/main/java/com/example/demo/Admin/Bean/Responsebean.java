package com.example.demo.Admin.Bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Responsebean {
    String responseCode;
    String responseMsg;
}
