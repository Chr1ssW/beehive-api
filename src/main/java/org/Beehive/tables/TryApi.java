package org.Beehive.tables;

import io.swagger.annotations.ApiOperation;
import org.Beehive.services.BeehiveDataService;
import org.Beehive.services.BeehiveService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TryApi {

    BeehiveDataService beehiveDataService;

    @RequestMapping(value = "/ttndata",
            method = RequestMethod.POST,
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create a reading resource using a post from the things network.")
    public void createReadingFromTheThingsNetwork(@RequestBody Payload payload,
                                                  HttpServletRequest request, HttpServletResponse response)
    {

        BeehiveData newReading = payload.getPayloadFields();
        newReading.setSensorId(payload.getDevId());
        this.beehiveDataService.createBeehiveData(newReading);
        /*
        this.payloadService.updateArduinoIfPayloadDownLinkIsDifferent(payload, newReading);

        response.setHeader("Location", request.getRequestURL().append("/").append(newReading.getId()).toString());


         */
    }
}
