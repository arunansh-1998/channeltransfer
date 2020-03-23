package com.comviva.vms.controller;


import com.comviva.vms.model.ChannelTransferResponse;
import com.comviva.vms.model.GetProfileSetVersionResponse;
import com.comviva.vms.service.ChannelTransferService;
import com.comviva.vms.service.GetProfileSetVersionService;
import io.micrometer.core.annotation.Timed;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Nullable;

@RestController
@RequestMapping("/")
@Api(value = "Get Channel Transfer Details", tags = {
        "Get Channel Transfer Details"
})

public class ChannelTransferController {

    @Autowired
    private ChannelTransferService getChannelTransferService;

    @GetMapping(value = "v1/getChannelTransfer/{transfer_sub_type}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "OG5-3064 :Returns details of Channeltransfer ", response = ChannelTransferResponse.class)
    @Timed(value = "getChannelTransfer.request", extraTags = {
            "version", "v1"
    }, percentiles = {
            0.95, 0.99
    }, histogram = true)
    public ChannelTransferResponse getChannelTransferByTransferSubType(@RequestParam(defaultValue="") String transfer_sub_type) {
//         LOGGER.info("Login getLocaleList request");
            ChannelTransferResponse channelTransferResponse;
            if(!transfer_sub_type.isEmpty())
                channelTransferResponse = getChannelTransferService.execute(transfer_sub_type);
                //LOGGER.info("Login getLocalelist Response:  {}", localeResponse);
            else
            {
                channelTransferResponse = getChannelTransferService.execute("null");
            }
        return channelTransferResponse;
    }

}
