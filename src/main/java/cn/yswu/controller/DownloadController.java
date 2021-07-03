package cn.yswu.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

/**
 * @author yswu
 * @date 2021-07-03 15:51
 */

@Controller
public class DownloadController {
    /**
     * 基于servlet api的下载
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/download")
    public String download(HttpServletRequest request, HttpServletResponse response) throws Exception{

        String realPath =request.getServletContext().getRealPath("/file/20181129204254948.png");
        // 根据文件路径封装成了File对象
        File tmpFile=new File(realPath);
        // 可以直接根据File对象获得文件名
        String fileName = tmpFile.getName();
        // 设置响应头 content-disposition： 就是设置文件下载的打开方式，默认会在网页上打开，
        // 设置attachment;filename= 就是为了以下载方式来打开文件
        // "UTF-8"设置如果文件名有中文就不会乱码
        response.setHeader("content-disposition", "attachment;filename="+ URLEncoder.encode(fileName, "UTF-8"));
        // 根据文件路径 封装成文件输入流
        InputStream in = new FileInputStream(realPath);
        int len = 0;
        // 声明了一个1KB的字节 的缓冲区
        byte[] buffer = new byte[1024];
        // 获取输出流
        OutputStream out = response.getOutputStream();
        // 循环读取文件，每次读1KB，避免内存溢出
        while ((len = in.read(buffer)) > 0) {
            // 往客户端写入
            out.write(buffer,0,len);//将缓冲区的数据输出到客户端浏览器
        }
        in.close();

        return null;

    }

    @RequestMapping("/upload")
    public String upload(String desc, MultipartFile myfile){
        System.out.println(desc);
        System.out.println(myfile.getOriginalFilename());
        return "success";

    }
}
