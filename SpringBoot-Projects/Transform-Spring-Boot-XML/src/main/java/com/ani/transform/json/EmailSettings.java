package com.ani.transform.json;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class EmailSettings {

    @SerializedName("smtp_server")
    private String smtpServer;

    @SerializedName("smtp_port")
    private String smtpPort;   
}
