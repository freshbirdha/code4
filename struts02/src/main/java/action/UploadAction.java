package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.UUID;

public class UploadAction extends ActionSupport {
    //文件
    private File upload; //属性名称必须与input标签的name属性值一致
    //文件类型
    private String uploadContentType; // name + ContentType(后缀)

    //文件名称
    private String uploadFileName; //name + FileName(后缀)

    /**
     * 根据IO流进行文件上传
     * @return
     */
    public String uploadByIO()  {
        //文件上传到 服务器(AMAZON....)

        //文件上传的目标地址
        String path = "C:/upload";  // F6断点调试 F8跳过保存
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //通过输入流读取文件 (private File upload;)
             fis = new FileInputStream(upload);

            //获取源文件的后缀名 (private String uploadFileName;)
            String extension = FilenameUtils.getExtension(uploadFileName);

            //重命名文件名称(即通过随机的UUID(默认有-,所以如果不要可以去掉)加上文件的后缀名)
            String newFileName = UUID.randomUUID().toString().replace("-","")+"." + extension;

            //通过输出流写出文件(path + "/" 只适用于Windows 或者 File.separator 这个分隔符常量 可以自动识别系统)
             fos = new FileOutputStream(path + File.separator  + newFileName); //path格式 C:/upload/log.jpg

            //通过工具类保存文件
            IOUtils.copy(fis,fos);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            //关闭资源
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        return SUCCESS;
    }

    /**
     * 第二种文件上传方式
     * @return
     */
    public String uploadBySimple(){
        //文件上传的目标地址
        String path = "C:/upload";

        //获取源文件后缀名称
        String extension = FilenameUtils.getExtension(uploadFileName);

        //重命名
        String newFIleName = UUID.randomUUID().toString().replace("-","") +"." +extension;

        //构建真实路径
        String realPath = path + File.separator + newFIleName;

        //通过工具类上传
        try {
            FileUtils.copyFile(upload,new File(realPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return SUCCESS;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }
}
