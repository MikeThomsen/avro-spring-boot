package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.test.MessageRecord;

@JsonIgnoreProperties(value = {"$SCHEMA", "schema" })
public class MessageResponse extends MessageRecord {

}
