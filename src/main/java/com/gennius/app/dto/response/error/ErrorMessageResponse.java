package com.gennius.app.dto.response.error;

public class ErrorMessageResponse {
    private String message;
    private Long status;

    public ErrorMessageResponse(String message, Long status) {
        super();
        this.message = message;
        this.status = status;
    }

    public ErrorMessageResponse() {
        super();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}
