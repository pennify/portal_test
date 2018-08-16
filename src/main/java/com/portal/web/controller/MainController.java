package com.portal.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.portal.back.model.User;
import com.portal.base.BaseController;
import com.portal.base.Result;
import com.portal.web.model.ImageBean;
import com.portal.web.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.UUID;

/**
 * Created by peng
 * on 2018/5/17 0017.
 */
@Controller
public class MainController extends BaseController{

    @Autowired
    private MainService mainService;

    /**
     * 首页
     */
    @RequestMapping("/portal/index")
    public String main(){
        return "frame";
//        return "index";
    }

    @RequestMapping("/portal/sliderView")
    public String page1(){
        return "sliderView";
    }

    @RequestMapping("/portal/listView")
    public String listView(){
        return "listview/listView";
    }

    @RequestMapping("/portal/getDataPage")
    @ResponseBody
    public JSONObject getDataPage(@RequestParam(value = "pageIndex",required = false) Integer pageIndex,
                                  @RequestParam(value = "pageSize",required = false) Integer pageSize){
        JSONObject jsonObject = new JSONObject();
        List<User> users = mainService.getUserPage(pageIndex,pageSize);
        Integer total = mainService.getUserTotal();
        jsonObject.put("rows",users);
        jsonObject.put("total",total);
        return jsonObject;
    }

    @RequestMapping("/portal/uploadPhoto")
    @ResponseBody
    public Result uploadPhoto(@RequestParam("uploadFile") MultipartFile file, HttpServletRequest request){
        if (!file.isEmpty()) {
            String saveFileName = file.getOriginalFilename();

            String path = request.getSession().getServletContext().getRealPath("/upload/");
            String imgName = UUID.randomUUID().toString().replace("-", "");
            String suffix = saveFileName.substring(saveFileName.lastIndexOf(".") + 1);
            //http://localhost:8080/upload/effect.gif
//            File saveFile = new File(path.replaceAll("webapp","resources") + saveFileName);
            String ppp = request.getRequestURL().toString();
            File saveFile = new File(path.replaceAll("webapp","resources") + imgName+"."+suffix);
            if (!saveFile.getParentFile().exists()) {
                saveFile.getParentFile().mkdirs();
            }
            try {
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(saveFile));
                out.write(file.getBytes());
                out.flush();
                out.close();
                return new Result(200,"success");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return new Result(1,"failure");
            } catch (IOException e) {
                e.printStackTrace();
                return new Result(1,"failure");
            }
        } else {
            return new Result(1,"failure");
        }
    }

    @RequestMapping("/portal/getImg")
    public String getImg(@RequestParam("fileName")  String fileName,HttpServletResponse response){
        ServletOutputStream out = null;
        FileInputStream ips = null;
        try {
            //获取图片存放路径
            String imgPath = request.getSession().getServletContext().getRealPath("/upload/").
                    replaceAll("webapp","resources");
            ips = new FileInputStream(new File(imgPath+fileName));
            response.setContentType("multipart/form-data");
            out = response.getOutputStream();
            //读取文件流
            int len = 0;
            byte[] buffer = new byte[1024 * 10];
            while ((len = ips.read(buffer)) != -1){
                out.write(buffer,0,len);
            }
            out.flush();
            out.close();
            ips.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 获取图片资源
     */
    public List imgList(HttpServletRequest request){
        List<ImageBean> imgs = mainService.getImgList();
        return imgs;
    }
}
