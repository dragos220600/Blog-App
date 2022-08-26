package com.example.demo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private Long id;

    @NotEmpty(message = "Name should not be null")
    private String name;

    @NotEmpty(message = "Email should not be null")
    @Email
    private String email;

    @NotEmpty(message = "Body should not be null")
    @Size(min = 10, message = "Body should have at least 10 characters")
    private String body;
}
