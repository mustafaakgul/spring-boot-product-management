package org.project.springbootproductmanagement.models;

public class ErrorResponse {

    private String message;
    private String statusCode;
    private Date time ;
    private List<String> details;

    public ErrorResponse(String message, String statusCode, List<String> details) {
        this.message = message;
        this.statusCode = statusCode;
        this.details = details;
        this.time = new Date();
    }

    public ErrorResponse() {

    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public List<String> getDetails() {
        return details;
    }
    public void setDetails(List<String> details) {
        this.details = details;
    }

}