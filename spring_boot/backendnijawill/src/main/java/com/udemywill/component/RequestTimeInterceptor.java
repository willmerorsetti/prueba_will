package com.udemywill.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter {
	private static final Log LOG=LogFactory.getLog(RequestTimeInterceptor.class);
	
	//este se ejecutara primero
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		LOG.info("Hello requestTimeInterceptor..paso .preHandle");
		request.setAttribute("startTime", System.currentTimeMillis());
		//return super.preHandle(request, response, handler);
		return true;
	}
	//este se ejecutara despues
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		long startTime= (long) request.getAttribute("startTime");
		LOG.info("Hello requestTimeInterceptor...afterCompletion");
		LOG.info("REQUEST URL :'"+request.getRequestURI().toString()+"'"+" TOTAL TIME:"+ (System.currentTimeMillis()-startTime)+" ms.");
		//super.afterCompletion(request, response, handler, ex);
	}

}
