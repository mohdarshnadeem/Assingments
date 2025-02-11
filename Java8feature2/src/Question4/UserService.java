package Question4;

import java.util.Optional;

public class UserService {
// simulating method that fetches user by id
    public static Optional<User> getUserById(int userId){
        //simulating database lookup
        if(userId == 1){
            return Optional.of(new User(1,"Arsh", "mohdarshnadeem@gmail.com"));
        }else{
           return Optional.empty();
        }
    }

    public static Optional<User> getUserByMail(String userMail){
        if(userMail == "abc@gmail.com"){
            return Optional.of(new User(2, "Vivin", "abc@gmail.com"));
        }
        return Optional.empty();
    }
}
