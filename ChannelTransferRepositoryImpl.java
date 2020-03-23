package com.comviva.vms.repository.repositoryimpl;

import com.comviva.vms.model.ChannelTransferVO;
import com.comviva.vms.model.ProfileVO;
import com.comviva.vms.repository.ChannelTransferRepository;
import com.comviva.vms.repository.ProfileSetVersionGeneratorRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Component
public class ChannelTransferRepositoryImpl  implements ChannelTransferRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public ArrayList<ChannelTransferVO> getChannelTransfer(String transfer_sub_type)
    {
        ArrayList<ChannelTransferVO> channelTransferVO = new ArrayList<>();
        Query query;
        StringBuilder strBuff = new StringBuilder();
        strBuff.append(
                "select CT.transferId,CT.status,CT.transferDate,CT.referenceNo,CT.extTxnNo,CT.extTxnDate,CT.transferInitiatedBy,CT.transferSubType,CT.msisdn from ChannelTransfers CT where CT.transferSubType=:transfer_sub_type");
        query = entityManager.createQuery(strBuff.toString());

        query.setParameter("transfer_sub_type", transfer_sub_type);
        List<Object[]> listCredentialObj = query.getResultList();
        if (listCredentialObj!=null) {
            for (Object[] obj : listCredentialObj) {
                channelTransferVO.add(constructProfileTypeVO(obj));
            }
        }
        return channelTransferVO;
    }

    private static ChannelTransferVO constructProfileTypeVO(Object[] obj) {
        ChannelTransferVO channelTransferVO = new ChannelTransferVO();
        channelTransferVO.setTransferId(obj[0] != null ? obj[0].toString() : "");
        channelTransferVO.setStatus(obj[1] != null ? obj[1].toString() : "");
        channelTransferVO.setTransferDate(obj[2] != null ? obj[2].toString() : "");
        channelTransferVO.setReferenceNo(obj[3] != null ? obj[3].toString() : "");
        channelTransferVO.setExtTxnNo(obj[4] != null ? obj[4].toString() : "");
        channelTransferVO.setExtTxnDate(obj[5] != null ? obj[5].toString() : "");
        channelTransferVO.setInitiatedBy(obj[6] != null ? obj[6].toString() : "");
        channelTransferVO.setDistributionType(obj[7] != null ? obj[7].toString() : "");
        channelTransferVO.setMsisdn(obj[8] != null ? obj[8].toString() : "");
        return channelTransferVO;
    }

//    private GetProfileSetVersionResponse createResponse()
//    {
//        GetProfileSetVersionResponse response = new GetProfileSetVersionResponse();
//
//            response.setListProfileVO(profileVO);
//
//        // getProductTypeListResponse.setProductTypeList(productTypeVO);
//        return  response;
//    }

}

