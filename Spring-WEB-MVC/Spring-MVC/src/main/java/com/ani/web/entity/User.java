package com.ani.web.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;
    private String mobile;
}
