package com.rivis.feng.website.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.util.UrlPathHelper;

public class BaseController {

	/**
	 * 提交给页面提示的错误信息
	 */
	protected static final String ERR_MSG = "ERR_MSG";
	
	protected static final String POST_FORM_PAGE = "/deposit/postUrl";
	/**
	 * 页面上传日期，转换date格式
	 * @param request
	 * @param binder
	 * @throws Exception
	 */
    @InitBinder  
    protected void initBinder(HttpServletRequest request,  
    		ServletRequestDataBinder binder) throws Exception {  
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
            CustomDateEditor editor = new CustomDateEditor(df, false);  
            binder.registerCustomEditor(Date.class, editor);  
    }

	 /**
	  * 获取IP地址
	  * @param request
	  * @return
	  */
	public  String getIpAddr(HttpServletRequest request) {
		return RequestUtils.getIpAddr(request);
	}

	/**
	 * 获得第三个路径分隔符的位置
	 * 
	 * @param request
	 * @throws IllegalStateException
	 *             访问路径错误，没有三(四)个'/'
	 */
	protected static String getURI(HttpServletRequest request)
			throws IllegalStateException {
		UrlPathHelper helper = new UrlPathHelper();
		String uri = helper.getOriginatingRequestUri(request);
		String ctxPath = helper.getOriginatingContextPath(request);
		if (!StringUtils.isBlank(ctxPath)) {
			uri = uri.replaceFirst(ctxPath,"");
		}
		return uri;
	}
	/**
	 * 得到页面传递的参数封装成map
	 */

	public Map<String, String> getParameters(HttpServletRequest request) {
		if (request == null) {
			request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		}
		Map<String, String> p = new HashMap<String, String>();
		Map req = request.getParameterMap();
		if ((req != null) && (!req.isEmpty())) {
			
			Collection keys = req.keySet();
			for (Iterator i = keys.iterator(); i.hasNext();) {
				String key = (String)i.next();
				Object value = req.get(key);
				Object v = null;
				if ((value.getClass().isArray())
						&& (((Object[]) value).length > 0)) {
					v = ((Object[]) value)[0];
				} else {
					v = value;
				}
				if ((v != null) && ((v instanceof String))) {
					String s = (String) v;
					if (s.length() > 0) {
						p.put(key, s);
					}
				}
			}
			//读取cookie
			p.putAll(ReadCookieMap(request));
			return p;
		}
		return p;
	}
	public Map<String, Object> getParametersO(HttpServletRequest request) {
		if (request == null) {
			request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		}
		Map req = request.getParameterMap();
		if ((req != null) && (!req.isEmpty())) {
			Map<String, Object> p = new HashMap<String, Object>();
			Collection keys = req.keySet();
			for (Iterator i = keys.iterator(); i.hasNext();) {
				String key = (String)i.next();
				Object value = req.get(key);
				Object v = null;
				if ((value.getClass().isArray()) && (((Object[]) value).length > 0)) {
					if (((Object[]) value).length > 1) {
						v = ((Object[]) value);
					} else {
						v = ((Object[]) value)[0];
					}
				} else {
					v = value;
				}
				if ((v != null) && ((v instanceof String))) {
					String s = ((String) v).trim();
					if (s.length() > 0) {
						p.put(key, s);
					}
				}
			}
			//读取cookie
			p.putAll(ReadCookieMap(request));
			return p;
		}
		return null;
	}
	/**
	 * 封装map存入request中
	 * @param map
	 * @param request
	 */
	public void setParameters(Map map,HttpServletRequest request) {
		if (request == null) {
			request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		}
		if (map != null) {
			Iterator it = map.keySet().iterator();
			while (it.hasNext()) {
				String key = (String) it.next();
				Object value = map.get(key);
				request.setAttribute(key, value);
			}
		}
	}
	/**
	 * 将cookie封装到Map里面
	 * @param request
	 * @return
	 */
	private static Map<String,String> ReadCookieMap(HttpServletRequest request){ 
	    Map<String,String> cookieMap = new HashMap<String,String>();
	    Cookie[] cookies = request.getCookies();
	    if(null!=cookies){
	        for(Cookie cookie : cookies){
	            cookieMap.put(cookie.getName(), cookie.getValue());
	        }
	    }
	    return cookieMap;
	}
	
	/**
	 * 得到session中的user对象
	 *//*
	public AccountsUsers loginUser(HttpServletRequest request,String name) {
		if (request == null) {
			request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		}
		AccountsUsers accountsUsers = (AccountsUsers) request.getSession()
				.getAttribute(name);
		return accountsUsers;
	}
	
	*//**
	 * 得到session中的代理商或员工账号对象
	 * @param request
	 * @param name
	 * @return
	 *//*
	public Agent loginAgentUser(HttpServletRequest request,String name){
		if (request == null) {
			request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		}
		Agent agent = (Agent) request.getSession().getAttribute(name);
		return agent;
	}
	
	*//**
	 * 得到session中的emp user对象
	 *//*
	public Agent loginAgentUser(HttpServletRequest request) {
		return loginAgentUser(request,Constants.EMP_USER_SESSION);
	}
	
	*//**
	 * 得到session中的bankUpInfo对象
	 *//*
	public BaseBankCard upBank(HttpServletRequest request,String name) {
		if (request == null) {
			request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		}
		BaseBankCard upBank = (BaseBankCard) request.getSession().getAttribute(name);
		return upBank;
	}
	*//**
	 * 得到session中的adminuser对象
	 *//*
	public AccountsAdmins adminUser(HttpServletRequest request,String name) {
		if (request == null) {
			request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		}
		AccountsAdmins accountsAdmins = (AccountsAdmins) request.getSession()
				.getAttribute(name);
		return accountsAdmins;
	}
   
	*//**
	 * 得到session中的admin user对象
	 *//*
	public AccountsAdmins loginAdminUser(HttpServletRequest request) {
		
		return adminUser(request,Constants.ADMIN_USER_SESSION);
	}
	*//**
	 * 得到session中的front user对象
	 *//*
	public AccountsUsers loginFrontUser(HttpServletRequest request) {
		return loginUser(request,Constants.FRONT_USER_SESSION);
	}
	*//**
	 * 得到session中的front user对象
	 *//*
	public AccountsUsers loginH5User(HttpServletRequest request) {
		return loginUser(request,Constants.H5_USER_SESSION);
	}
	
	*//**
	 * 得到session中的Bank user更改的对象
	 *//*
	public BaseBankCard userUpBankCard(HttpServletRequest request){
		return upBank(request,Constants.BANK_SESSION);
	}
	
	*//**
	 * 得到session中的app user对象
	 * @param request
	 * @return
	 *//*
	public AccountsUsers loginAPPUser(HttpServletRequest request) {
		return loginUser(request,Constants.APP_USER_SESSION);
	}
	
	*//**
	 * 验证码
	 * 
	 * @param request
	 * @param response
	 * @return
	 *//*
	public boolean validateCaptcha(HttpServletRequest request) {
		try {
		return captchaService.validateResponseForID(request.getSession(false)
				.getId(), request.getParameter("captcha").toLowerCase());
		}catch(Exception e){
			return false;
		}
	}*/
	
	/**
	 * 请求参数转换为map，不包含cookie
	 * @param request
	 * @return
	 */
	public Map<String, String> getParameterNoCk(HttpServletRequest request) {
		if (request == null) {
			request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		}
		Map req = request.getParameterMap();
		Map<String, String> p = new HashMap<String, String>();
		if ((req != null) && (!req.isEmpty())) {
			Collection keys = req.keySet();
			for (Iterator i = keys.iterator(); i.hasNext();) {
				String key = (String)i.next();
				Object value = req.get(key);
				Object v = null;
				if ((value.getClass().isArray())
						&& (((Object[]) value).length > 0)) {
					v = ((Object[]) value)[0];
				} else {
					v = value;
				}
				if ((v != null) && ((v instanceof String))) {
					String s = (String) v;
					if (s.length() > 0) {
						p.put(key, s);
					}
				}
			}
			return p;
		}
		return p;
	}
}
