package org.Beehive.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.Beehive.services.BeehiveDataService;
import org.Beehive.tables.BeehiveData;
import org.Beehive.tables.Payload;
import org.Beehive.tables.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/beehiveData")
@Api(tags = {"beehiveData"})
public class BeehiveDataController
{
    @Autowired
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

    @PostMapping(value = "")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Creates a beehive reading")
    public void createUser(@RequestBody BeehiveData beehiveData)
    {
        beehiveDataService.createBeehiveData(beehiveData);
    }

    @GetMapping(value = "/id={id}&format=json", produces = {"application/json"})
    @ResponseStatus(value = HttpStatus.OK)
    @ApiOperation(value = "Returns one reading based on ID in JSON format.")
    public BeehiveData getAmazonTitleJson(@ApiParam(value = "The id of the reading", required = true)
                                   @PathVariable("id") int id)
    {
        return beehiveDataService.getBeehiveData(id);
    }

    @GetMapping(value = "/format=json", produces = {"application/json"})
    @ResponseStatus(value = HttpStatus.OK)
    @ApiOperation(value = "Returns all beehives in JSON format.")
    public Iterable<BeehiveData> getAmazonTitleJson()
    {
        return beehiveDataService.getBeehiveData();
    }
}
