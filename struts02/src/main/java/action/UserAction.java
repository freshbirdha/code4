package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

public class UserAction extends ActionSupport {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //登录方法 该方法不允许拦截
    public String login(){
        if(userName.equals("admin") && password.equals("admin")){
            //保存session
            ServletActionContext.getRequest().getSession().setAttribute("loginUser",userName);
            return SUCCESS;//成功
        }
        return LOGIN; //失败
    }

    public String find(){
        return SUCCESS;
    }
    public String add(){
        return SUCCESS;
    }
    public String update(){
        return SUCCESS;
    }
    public String delete(){
        return SUCCESS;
    }
}
