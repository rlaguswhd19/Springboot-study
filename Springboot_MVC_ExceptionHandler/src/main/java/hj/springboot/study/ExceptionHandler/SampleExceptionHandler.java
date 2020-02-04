package hj.springboot.study.ExceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import hj.springboot.study.dao.AppError;

@ControllerAdvice
public class SampleExceptionHandler {

	@ExceptionHandler(SampleException.class)
	public @ResponseBody AppError SampleError(SampleException e) {
		AppError appError = new AppError();
		appError.setMassage(e.getMessage());
		appError.setReason("reason");
		return appError;
	}
}
