package com.ekosutrisno.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * The type Response info.
 *
 * @author Eko Sutrisno Tuesday, 12/01/2021 17:18
 */
public class ResponseInfo {
    @JsonProperty(index = 0)
    private Boolean status;
    @JsonProperty(index = 1)
    private String message;
    @JsonProperty(index = 2)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date timeRequest;

    /**
     * Instantiates a new Response info.
     *
     * @param status      the status
     * @param message     the message
     * @param timeRequest the time request
     */
    public ResponseInfo(Boolean status, String message, Date timeRequest) {
        this.status = status;
        this.message = message;
        this.timeRequest = timeRequest;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets time request.
     *
     * @return the time request
     */
    public Date getTimeRequest() {
        return timeRequest;
    }

    /**
     * Sets time request.
     *
     * @param timeRequest the time request
     */
    public void setTimeRequest(Date timeRequest) {
        this.timeRequest = timeRequest;
    }
}
