package GDG.backend.domain.businesscard.presentation.dto.response;

import GDG.backend.domain.businesscard.domain.WorkType;
import GDG.backend.domain.businesscard.domain.vo.BusinessCardInfoVO;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDate;

public record CreateBusinessCardResponse(
        @Schema(description = "명함 Id")
        Long id,
        String name,
        String email,
        WorkType workType,
        String job,
        String position,
        String companyName,
        String companyAddress,
        LocalDate birth,
        String templateURL,
        @Schema(description = "대표 명함 확인")
        Boolean isRepresentative
) {
    public CreateBusinessCardResponse (BusinessCardInfoVO businessCardInfoVO) {
        this(businessCardInfoVO.id(), businessCardInfoVO.name(), businessCardInfoVO.email(), businessCardInfoVO.workType(),
                businessCardInfoVO.job(), businessCardInfoVO.position(), businessCardInfoVO.companyName(),
                businessCardInfoVO.companyAddress(), businessCardInfoVO.birth(), businessCardInfoVO.templateURL(),
                businessCardInfoVO.isRepresentative());
    }
}
