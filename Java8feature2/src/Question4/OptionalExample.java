package Question4;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<User> optionalUser = UserService.getUserById(1);//can change to 2 to simulate no user
        //Optional<User> optionalUser1 = UserService.getUserByMail("abc@gmail.com");//for accessing via email

        String email  = optionalUser.map(User::getEmail).orElse("No email");
        System.out.println(email);
    }
}
