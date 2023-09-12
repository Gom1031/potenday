package project.Project1.DTO;

import java.time.LocalDateTime;

import lombok.Data;
import project.Project1.Entity.Role;

@Data
public class userDTO {
    private Long userid;
    private String username;
    private String password;
    private String email;
    private String phone_number;
    private LocalDateTime regiester_date;
    private LocalDateTime last_edit_date;
    private Role role;
    
}
