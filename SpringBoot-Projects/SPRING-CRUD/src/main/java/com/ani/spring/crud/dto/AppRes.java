package com.ani.spring.crud.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class AppRes {
    private String res;
    private String msg;
}
