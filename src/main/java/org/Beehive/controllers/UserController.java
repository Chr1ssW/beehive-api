package org.Beehive.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.Beehive.services.UserService;
import org.Beehive.tables.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
@Api(tags = {"users"})
public class UserController
{
    @Autowired
    UserService userService;

    @PostMapping(value = "")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Creates a user")
    public void createUser(@RequestBody User user)
    {
        userService.createUser(user);
    }

    @GetMapping(value = "/id={id}&format=json", produces = {"application/json"})
    @ResponseStatus(value = HttpStatus.OK)
    @ApiOperation(value = "Returns one user based on ID in JSON format.")
    public User getAmazonTitleJson(@ApiParam(value = "The id of the user", required = true)
                                           @PathVariable("id") int id)
    {
        return this.userService.getUser(id);
    }

    @GetMapping(value = "/format=json", produces = {"application/json"})
    @ResponseStatus(value = HttpStatus.OK)
    @ApiOperation(value = "Returns all users in JSON format.")
    public Iterable<User> getAmazonTitleJson()
    {
        return this.userService.getUsers();
    }
}
