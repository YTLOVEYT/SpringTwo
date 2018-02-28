package interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器
 * {@link HandlerInterceptor}
 * @author YinTao
 */
public class OneInterceptor implements HandlerInterceptor
{
	/**
	 * DispatherServlet收到请求后首先调用 preHandler,返回true则拦截则向后继续调用
	 */
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception
	{
		System.out.println("preHandle拦截请求");
//		HttpSession session = request.getSession();
//		Object user = session.getAttribute("admin");
//		if (user != null)
//		{
//			return true;
//		}
//		System.out.println("重定向到");
//		response.sendRedirect("");// 重定向到指定页面
//		return false;
		return true;
	}

	/**
	 * controller处理后返回modelAndView到前端控制器时，拦截器能够拦截结果
	 */
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception
	{
		System.out.println("postHandle可以修改返回结果");
	}

	/**
	 * 整个拦截处理完毕执行
	 */
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception
	{
		System.out.println("afterCompletion");
	}

}
