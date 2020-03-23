package com.comviva.vms.service;

import com.comviva.vms.common.config.ValidationException;
import com.comviva.vms.common.enums.Constants;
import com.comviva.vms.common.enums.MessageCodes;
import com.comviva.vms.common.utils.CommonUtils;
import com.comviva.vms.model.*;
import com.comviva.vms.repository.ChannelTransferRepository;
import com.comviva.vms.repository.IdGeneratorRepository;
import com.comviva.vms.repository.ProfileSetVersionGeneratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChannelTransferService extends CommonService{

    private String transfer_sub_type;
    private ChannelTransferResponse response;
    @Autowired
    private ChannelTransferRepository channelTransferRepository;

    public ChannelTransferResponse execute(String transfer_sub_type) {
        List<String> params = new ArrayList<>();
//        if (LOGGER.isDebugEnabled()) {
//            LOGGER.debug("Processing the get service type by request..");
//        }
        ArrayList<ChannelTransferVO> listChannelTransferVO=channelTransferRepository.getChannelTransfer(transfer_sub_type);
        this.transfer_sub_type = transfer_sub_type;
        String regex = "[V]+";
        response=new ChannelTransferResponse();
        response.setListChannelTransferVO(listChannelTransferVO);
        if(transfer_sub_type.equals("null"))
        {   response.setListChannelTransferVO(null);
            responseMessageCode = MessageCodes.MSISDN_ALREDY_BLACKLISTED.getStrValue();
            response.setMessageCode(responseMessageCode);
            responseMessage = "Transfer Sub Type IS NULL";
            response.setMessage(responseMessage);
            response.setReferenceId(referenceId);
            responseStatus = Constants.BAD_REQUEST.getStrValue();
            response.setStatus(responseStatus);
        }
        else {
            if (!transfer_sub_type.matches(regex) || CommonUtils.isNullorEmpty(response.getListChannelTransferVO())) {
                response.setListChannelTransferVO(null);
                responseMessageCode = MessageCodes.MSISDN_ALREDY_BLACKLISTED.getStrValue();
                response.setMessageCode(responseMessageCode);
                responseMessage = "Transfer Sub Type IS NOT VALID";
                response.setMessage(responseMessage);
                response.setReferenceId(referenceId);
                responseStatus = Constants.BAD_REQUEST.getStrValue();
                response.setStatus(responseStatus);

            } else {
                response.setListChannelTransferVO(listChannelTransferVO);
                responseStatus = Constants.SUCCESS_RESPONSE.getStrValue();
                response.setStatus(responseStatus);
                responseMessageCode = MessageCodes.SUCCESS.getStrValue();
                response.setMessageCode(responseMessageCode);
                responseMessage = "SUCCESS";
                response.setMessage(responseMessage);

            }

        }
        return response;
    }

    @Override
    public ChannelTransferResponse createResponse() {
        response.setStatus(responseStatus);
        response.setMessage(responseMessage);
        response.setMessageCode(responseMessageCode);
//        response.setServiceType(list);
        return response;
    }

    @Override
    public void validateInputs() {
        if (CommonUtils.isNullorEmpty(transfer_sub_type)) {
//            LOGGER.error("Voucher Type field invalid");
            throw new ValidationException(Constants.VOUCHERTYPE.toString(),
                    MessageCodes.FIELD_MANDATORY.toString());
        }
    }
}
