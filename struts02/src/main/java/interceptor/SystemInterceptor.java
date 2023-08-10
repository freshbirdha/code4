package interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

public class SystemInterceptor extends MethodFilterInterceptor {
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        //获取session
        HttpSession session = ServletActionContext.getRequest().getSession();
        //判断session是否为空，如果为空表示没有登录
        if(session.getAttribute("loginUser")==null){
                return Action.LOGIN;
        }
        return actionInvocation.invoke();
    }
}
