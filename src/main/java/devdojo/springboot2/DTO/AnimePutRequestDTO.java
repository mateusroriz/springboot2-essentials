package devdojo.springboot2.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnimePutRequestDTO {
    private Long id;
    private String name;
}
