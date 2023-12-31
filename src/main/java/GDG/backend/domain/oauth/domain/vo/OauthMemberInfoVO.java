package GDG.backend.domain.oauth.domain.vo;

import GDG.backend.domain.oauth.domain.OauthServerType;

public record OauthMemberInfoVO(
        String email,
        String name,
        OauthServerType oauthServerType
) {
}
