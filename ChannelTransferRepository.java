package com.comviva.vms.repository;

import com.comviva.vms.model.ChannelTransferVO;
import com.comviva.vms.model.ProfileVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ChannelTransferRepository {
    ArrayList<ChannelTransferVO> getChannelTransfer(String status);
}
