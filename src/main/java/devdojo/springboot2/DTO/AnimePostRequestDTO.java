package devdojo.springboot2.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnimePostRequestDTO {
    @NotEmpty(message = "the name cannot be empty")
    @Schema(description = "this is the Anime's name", example = "Vinland Saga", required = true)
    private String name;
}
