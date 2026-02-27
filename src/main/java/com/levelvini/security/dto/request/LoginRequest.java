package com.levelvini.security.dto.request;

import jakarta.validation.constraints.NotEmpty;

public record LoginRequest(@NotEmpty(message = "email obrigatório") String email,@NotEmpty(message = "senha obrigatória") String password) {
}
