package org.Beehive.controllers;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.Beehive.services.BeehiveService;
import org.Beehive.tables.Beehive;
import org.Beehive.tables.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/beehives")
@Api(tags = {"beehives"})
public class BeehiveController
{
    @Autowired
    BeehiveService beehiveService;

    @PostMapping(value = "")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Creates a beehive")
    public void createUser(@RequestBody Beehive beehive)
    {
        beehiveService.createBeehive(beehive);
    }

    @GetMapping(value = "/id={id}&format=json", produces = {"application/json"})
    @ResponseStatus(value = HttpStatus.OK)
    @ApiOperation(value = "Returns one beehive based on sensorID in JSON format.")
    public Beehive getAmazonTitleJson(@ApiParam(value = "The id of the sensor", required = true)
                                   @PathVariable("id") String id)
    {
        return beehiveService.getBeehive(id);
    }

    @GetMapping(value = "/format=json", produces = {"application/json"})
    @ResponseStatus(value = HttpStatus.OK)
    @ApiOperation(value = "Returns all beehives in JSON format.")
    public Iterable<Beehive> getAmazonTitleJson()
    {
        return beehiveService.getBeehives();
    }
}
