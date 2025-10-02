package com.ExceptionHandling.ExceptionHandling.GlobalException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ExceptionController {

    //wrong user id
    // order Limit
    // from india only


//http://localhost:8080/user/UserIdentification/101
       @GetMapping("/UserIdentification/{id}")
        public ResponseEntity<String> findUser(@PathVariable int id){
            if(id == 101){
                return ResponseEntity.ok("User Accepted");
            }
           throw new UserNotFoundException("User with id " + id + " not found!");
        }

    //http://localhost:8080/user/UserLimit/5000
    @GetMapping("/UserLimit/{limit}")
    public ResponseEntity<String> checkUserLimit(@PathVariable int limit){
        if(limit >5000){
            return ResponseEntity.ok("User Have filled proper amount");
        }
        throw new OverLimitException("User with Amount " + limit + " not Allowed!");
    }

    //http://localhost:8081/user/UserLocation/india
    @GetMapping("/UserLocation/{location}")
    public ResponseEntity<String> checkUserLimit(@PathVariable String location){
        if(location.equalsIgnoreCase("india")){
            return ResponseEntity.ok("User are allowed with there region");
        }
        throw new UserInvalidLocation("The user from "+ location+" is not allowed!");
    }

    //http://localhost:8081/user/AmountWithraw/5000/1000
    @GetMapping("/AmountWithraw/{available}/{enteredBalance}")
    public ResponseEntity<String> AmountWithraw(@PathVariable int available,@PathVariable int enteredBalance ){

           int remainingBalance=available-enteredBalance;
        if(remainingBalance>0){
            return ResponseEntity.ok("Your entered amount "+ enteredBalance +"/- successfully debited and current balance is "+remainingBalance );
        }
        throw new InsufficientBalanceException("You dont have sufficient balance you have required "+ remainingBalance );
    }









    }


