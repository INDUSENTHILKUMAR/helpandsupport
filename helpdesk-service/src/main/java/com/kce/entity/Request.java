package com.kce.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="help_requests")
public class Request {

    @Id
    private String id;
    private String name;
    private String registerNumber;
    private String department;
    private String subject;
    private String issueType;
    private String location;
    private String priority;
    private String description;
    private String status = "Pending";
    private String responseMessage; // null by default


    public void setStatus(String status) {
        this.status=status;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage=responseMessage;
    }
}
