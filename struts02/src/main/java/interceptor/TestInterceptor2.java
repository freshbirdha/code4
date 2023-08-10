package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TestInterceptor2 extends AbstractInterceptor {

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("=== enter 2===");
        //放行
        String result = actionInvocation.invoke();
        System.out.println("=== exit 2===");
        //返回结果
        return result;
    }
}
