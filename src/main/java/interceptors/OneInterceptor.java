package interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * ������
 * {@link HandlerInterceptor}
 * @author YinTao
 */
public class OneInterceptor implements HandlerInterceptor
{
	/**
	 * DispatherServlet�յ���������ȵ��� preHandler,����true������������������
	 */
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception
	{
		System.out.println("preHandle��������");
//		HttpSession session = request.getSession();
//		Object user = session.getAttribute("admin");
//		if (user != null)
//		{
//			return true;
//		}
//		System.out.println("�ض���");
//		response.sendRedirect("");// �ض���ָ��ҳ��
//		return false;
		return true;
	}

	/**
	 * controller����󷵻�modelAndView��ǰ�˿�����ʱ���������ܹ����ؽ��
	 */
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception
	{
		System.out.println("postHandle�����޸ķ��ؽ��");
	}

	/**
	 * �������ش������ִ��
	 */
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception
	{
		System.out.println("afterCompletion");
	}

}
