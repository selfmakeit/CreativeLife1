package com.bs.create_life.controller.file;

import com.bs.create_life.base.BaseController;
import com.bs.create_life.po.FilePO;
import com.bs.create_life.service.FileService;
import com.bs.create_life.util.JsonValue;
import com.bs.create_life.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "fileUpload")
public class FileUploadingController extends BaseController {

    @Value("${spring.realPath}")
    String realPath;

    @Autowired
    FileService fileService;

    /**
     * 单文件上传
     *
     * @param file
     * @param request
     * @return
     */
    @RequestMapping("upload")
    @ResponseBody
    public JsonValue upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        if (!file.isEmpty()) {
            String type = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            String name = UUIDUtil.getUUID() + type;
            File saveFile = new File(realPath + name);
            if (!saveFile.getParentFile().exists()) {
                saveFile.getParentFile().mkdirs();
            }
            BufferedOutputStream out = null;
            try {
                out = new BufferedOutputStream(new FileOutputStream(saveFile));
                out.write(file.getBytes());
                out.flush();

                FilePO p = new FilePO();
                p.setRealPath(realPath + name);
                p.setType(type);
                fileService.insert(p);
                return JsonValue.ok();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return JsonValue.errMessage(("上传失败,"));
            } catch (IOException e) {
                e.printStackTrace();
                return JsonValue.errMessage(("上传失败," + e.getMessage()));
            } finally {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            return JsonValue.errMessage("上传失败，因为文件为空.");
        }
    }

    /**
     * 多文件上传
     *
     * @param request
     * @return
     */
    @RequestMapping("uploadFiles")
    @ResponseBody
    public JsonValue uploadFiles(HttpServletRequest request) throws IOException {
        File savePath = new File(realPath);
        if (!savePath.exists()) {
            savePath.mkdirs();
        }
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        for (int i = 0; i < files.size(); i++) {
            file = files.get(i);
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();

                    String originalFilename = file.getOriginalFilename();
                    String type = originalFilename.substring(originalFilename.lastIndexOf("."));
                    String name = UUIDUtil.getUUID() + type;

                    File saveFile = new File(realPath + name);
                    stream = new BufferedOutputStream(new FileOutputStream(saveFile));
                    FilePO p = new FilePO();
                    p.setType(type);
                    p.setRealPath(name);
                    fileService.insert(p);
                    stream.write(bytes);
                } catch (Exception e) {
                    return JsonValue.errMessage("第 " + i + " 个文件上传有错误" + e.getMessage());
                } finally {
                    stream.close();
                }
            } else {
                return JsonValue.errMessage("第 " + i + " 个文件为空");
            }
        }
        return JsonValue.okMessage("所有文件上传成功");
    }
}
