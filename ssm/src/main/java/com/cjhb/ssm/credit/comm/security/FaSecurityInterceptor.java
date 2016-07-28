package com.cjhb.ssm.credit.comm.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

public class FaSecurityInterceptor extends AbstractSecurityInterceptor implements Filter {

	private FilterInvocationSecurityMetadataSource securityMetadataSource;
	private final Logger log = Logger.getLogger(getClass().getName());	

	// ~ Methods
	// ========================================================================================================

	/**
	 * Method that is actually called by the filter chain. Simply delegates to
	 * the {@link #invoke(FilterInvocation)} method.
	 * 
	 * @param request
	 *            the servlet request
	 * @param response
	 *            the servlet response
	 * @param chain
	 *            the filter chain
	 * 
	 * @throws IOException
	 *             if the filter chain fails
	 * @throws ServletException
	 *             if the filter chain fails
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		if (log.isDebugEnabled()) {
			log.debug("FaSecurityInterceptor-----------开始拦截器了....");
		}
        FilterInvocation fi = new FilterInvocation(request, response, chain);  
        InterceptorStatusToken token = super.beforeInvocation(fi);  
        try {  
            fi.getChain().doFilter(fi.getRequest(), fi.getResponse());  
        } catch (Exception e) {  
            e.printStackTrace();  
        }finally{  
            super.afterInvocation(token,null);  
        }  
        if (log.isDebugEnabled()) {
        	log.debug("FaSecurityInterceptor-----------拦截器该方法结束了....");  
        }
	}

	public FilterInvocationSecurityMetadataSource getSecurityMetadataSource() {
		return this.securityMetadataSource;
	}

	public Class<? extends Object> getSecureObjectClass() {
		return FilterInvocation.class;
	}

	public SecurityMetadataSource obtainSecurityMetadataSource() {
		return this.securityMetadataSource;
	}

	public void setSecurityMetadataSource(
			FilterInvocationSecurityMetadataSource newSource) {
		this.securityMetadataSource = newSource;
	}

	@Override
	public void destroy() {
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}
}