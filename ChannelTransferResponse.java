package com.comviva.vms.model;

import java.util.ArrayList;

public class ChannelTransferResponse extends BaseResponse{

    ArrayList<ChannelTransferVO> listChannelTransferVO;

    public ArrayList<ChannelTransferVO> getListChannelTransferVO() {
        return listChannelTransferVO;
    }

    public void setListChannelTransferVO(ArrayList<ChannelTransferVO> listChannelTransferVO) {
        this.listChannelTransferVO = listChannelTransferVO;
    }
}
