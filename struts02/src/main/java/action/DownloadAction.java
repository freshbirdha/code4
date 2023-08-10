package action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLEncoder;

public class DownloadAction extends ActionSupport {
    //输入流,读取文件信息
    private InputStream inputStream;

    //文件名称
    private String fileName;  //与download.jsp中<a href="download.action?fileName=hello.jpg">参数名一致

    public String download(){
        try{
            //1. 指定下载的文件(该文件必须在服务器中存在)
            String path = "C:/upload/" + fileName;
            //指定编码格式
            fileName = URLEncoder.encode(fileName,"UTF-8");
            //2.通过缓冲流下载
            inputStream = new BufferedInputStream(new FileInputStream(path));

        }catch (Exception e){
            e.printStackTrace();
        }

        return SUCCESS;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
}
