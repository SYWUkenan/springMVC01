package cn.yswu.interceptor;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yswu
 * @date 2021-07-04 23:41
 *
 * 1.配置拦截器
 * 2.springmvc.xml中添加配置的拦截器
 * <mvc:interceptors>
 *         <bean class="cn.yswu.interceptor.MyInterceptor"></bean>
 * </mvc:interceptors>
 *
 */
public class MyInterceptor implements HandlerInterceptor {
    /**
     * 方法前执行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        System.out.println("--类"+handlerMethod.getBean().getClass().getName()+";"+"--方法名"+handlerMethod.getMethod().getName()
        +";"+"--参数："+handlerMethod.getMethodParameters()+"------preHandle");
        System.out.println("方法前执行---------");
        return true;
    }

    /**
     * 方法后，渲染前执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("方法后，渲染前执行---------");
    }

    /**
     * 方法后、渲染后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("方法后，渲染后执行---------");
    }
}
