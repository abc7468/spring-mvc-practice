package hello.springmvc.basic.Requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {
    @GetMapping
    public String user(){
        return "get users";
    }

    @PostMapping("/{userId}")
    public String addUser(){
        return "post users";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId){
        return "find users" + userId;
    }

    @PatchMapping("/{userId}")
    public String patchUser(@PathVariable String userId){
        return "patch users" + userId;
    }

    @DeleteMapping("/{userId}")
    public String DeleteUser(@PathVariable String userId){
        return "delete users" + userId;
    }
}
