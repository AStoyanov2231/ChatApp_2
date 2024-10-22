package group.ChatApp2.Controllers_Andy;

import org.springframework.http.ResponseEntity;

public interface MainService {
    ResponseEntity<ApiResponse> response(String message);
}