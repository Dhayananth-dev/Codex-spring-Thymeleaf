package terra.form.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public String handleStudentNotFound(StudentNotFoundException exception, Model model) {
        model.addAttribute("status", "404");
        model.addAttribute("title", "Student not found");
        model.addAttribute("message", exception.getMessage());
        return "error/custom-error";
    }

    @ExceptionHandler(Exception.class)
    public String handleGeneralError(Exception exception, Model model) {
        model.addAttribute("status", "500");
        model.addAttribute("title", "Something went wrong");
        model.addAttribute("message", "Please try again. If the problem continues, check the application logs.");
        return "error/custom-error";
    }
}
