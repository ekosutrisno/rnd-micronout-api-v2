package com.ekosutrisno.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class ResponseInfo {
    @JsonProperty(index = 0)
    private Boolean status;
    @JsonProperty(index = 1)
    private String message;
    @JsonProperty(index = 2)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date timeRequest;

    public ResponseInfo(Boolean status, String message, Date timeRequest) {
        this.status = status;
        this.message = message;
        this.timeRequest = timeRequest;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimeRequest() {
        return timeRequest;
    }

    public void setTimeRequest(Date timeRequest) {
        this.timeRequest = timeRequest;
    }
}
