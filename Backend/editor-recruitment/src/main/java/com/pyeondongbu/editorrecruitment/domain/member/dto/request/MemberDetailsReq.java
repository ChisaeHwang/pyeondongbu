package com.pyeondongbu.editorrecruitment.domain.member.dto.request;

import com.pyeondongbu.editorrecruitment.domain.common.dto.request.DetailsReq;
import com.pyeondongbu.editorrecruitment.domain.member.domain.details.MemberDetails;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberDetailsReq extends DetailsReq {

    @NotNull(message = "편집된 채널 리스트는 필수입니다.")
    private List<String> editedChannels = new ArrayList<>();

    @NotNull(message = "현재 채널 리스트는 필수입니다.")
    private List<String> currentChannels = new ArrayList<>();

    private String portfolio = "";

    @Builder
    public MemberDetailsReq(
            final int maxSubs,
            final List<String> videoTypes,
            final List<String> skills,
            final String remarks,
            final List<String> editedChannels,
            final List<String> currentChannels,
            final String portfolio
    ) {
        super(maxSubs, videoTypes, skills, remarks);
        this.editedChannels = editedChannels;
        this.currentChannels = currentChannels;
        this.portfolio = portfolio;
    }

    public static MemberDetailsReq of(final MemberDetails memberDetails) {
        return MemberDetailsReq.builder()
                .maxSubs(memberDetails.getMaxSubs())
                .videoTypes(memberDetails.getVideoTypes())
                .editedChannels(memberDetails.getEditedChannels())
                .currentChannels(memberDetails.getCurrentChannels())
                .portfolio(memberDetails.getPortfolio())
                .skills(memberDetails.getSkills())
                .remarks(memberDetails.getRemarks())
                .build();
    }



}
