package com.demo.contentcalendar.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public record Content(

        @Id
        Integer id,

        @NotBlank(message = "You must enter a title")
        String title,
        String desc,

        @NotNull(message = "You must choose a status")
        Status status,

        @NotNull(message = "You must choose a content type")
        Type contentType,

        @JsonFormat(pattern="dd-MM-yyyy'T'HH:mm", shape=JsonFormat.Shape.STRING)
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
