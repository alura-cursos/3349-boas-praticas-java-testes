package br.com.alura.adopet.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SolicitacaoAdocaoDto(@NotNull Long idPet, @NotNull Long idTutor, @NotBlank String motivo) {
}
