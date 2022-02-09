package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.CCUser;
import java.util.List;

public class AgentSubUnSubDTO {

    private CCUser ccUser;
    private List<ChannelSessionDTO> channelSessionDTOList;

    public CCUser getCcUser() {
        return ccUser;
    }

    public void setCcUser(CCUser ccUser) {
        this.ccUser = ccUser;
    }

    public List<ChannelSessionDTO> getChannelSessionDTOList() {
        return channelSessionDTOList;
    }

    public void setChannelSessionDTOList(List<ChannelSessionDTO> channelSessionDTOList) {
        this.channelSessionDTOList = channelSessionDTOList;
    }
}
