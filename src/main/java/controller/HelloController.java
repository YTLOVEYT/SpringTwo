package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// Controller
public class HelloController
{
	// ���ʵ�ַ
	@RequestMapping("/hello.do")
	public String hello()
	{
		return "hello"; // jsp
	}

	// ���ʵ�ַ
	@RequestMapping("/helloEx1.do")
	public String helloException1()
	{
		System.out.println("�˴����쳣");
		int ex = Integer.parseInt("100A");
		return "hello"; // jsp
	}
	// ���ʵ�ַ
	@RequestMapping("/helloEx2.do")
	public String helloException2()
	{
		System.out.println("�˴����쳣");
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
			request.setAttribute("error", "����ת���쳣");
			return "exception";
		}
		else if (ex instanceof ArrayIndexOutOfBoundsException)
		{
			request.setAttribute("error", "�����±�Խ��");
			return "exception";
		}
		request.setAttribute("error", "ϵͳ�쳣");
		return "exception";
	}

}
