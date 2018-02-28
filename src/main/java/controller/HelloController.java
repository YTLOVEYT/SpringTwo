package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// Controller
public class HelloController
{
	// 访问地址
	@RequestMapping("/hello.do")
	public String hello()
	{
		return "hello"; // jsp
	}

	// 访问地址
	@RequestMapping("/helloEx1.do")
	public String helloException1()
	{
		System.out.println("此处有异常");
		int ex = Integer.parseInt("100A");
		return "hello"; // jsp
	}
	// 访问地址
	@RequestMapping("/helloEx2.do")
	public String helloException2()
	{
		System.out.println("此处有异常");
		String a="hello";
		char c = a.charAt(10);
		return "hello"; // jsp
	}

	@ExceptionHandler
	public String exceptionHandler(Exception ex, HttpServletRequest request)
	{
		System.out.println("exceptionHandler");
		if (ex instanceof NumberFormatException)
		{
			request.setAttribute("error", "数字转换异常");
			return "exception";
		}
		else if (ex instanceof ArrayIndexOutOfBoundsException)
		{
			request.setAttribute("error", "数组下标越界");
			return "exception";
		}
		request.setAttribute("error", "系统异常");
		return "exception";
	}

}
