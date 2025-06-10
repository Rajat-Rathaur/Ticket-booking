package ticket.booking.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;

import java.io.File;

public class UserBookingServices {
    private User user;
    private ObjectMapper objectMapper = new ObjectMapper();
    private static final String USER_FILE_PATH = "../localDb/users.json";
    public UserBookingServices(User user1) {
        this.user = user1;
        File users = new File(USER_FILE_PATH);
    }
}
