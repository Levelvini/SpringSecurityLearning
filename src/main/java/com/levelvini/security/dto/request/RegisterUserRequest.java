package com.levelvini.security.dto.request;

import jakarta.validation.constraints.NotEmpty;

public record RegisterUserRequest(@NotEmpty(message = "nome obrigatório") String name,@NotEmpty(message = "email obrigatório") String email,@NotEmpty(message = "senha obrigatória") String password) {
}
