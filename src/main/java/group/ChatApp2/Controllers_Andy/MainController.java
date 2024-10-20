package group.ChatApp2.Controllers_Andy;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MainController implements MainService {

    @Override
    public ResponseEntity<ApiResponse> response(String message) {
        ApiResponse apiResponse = new ApiResponse(message, HttpStatus.OK.value());
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
