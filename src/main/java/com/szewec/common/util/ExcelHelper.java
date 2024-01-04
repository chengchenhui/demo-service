package com.szewec.common.util;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Excel数据导入的帮助类
 *@title ExcelHelper
 *@author shanweitai
 *@date 2017年4月21日
 */
public class ExcelHelper {

	public ExcelHelper() {
    }

    public static String transferTo(MultipartFile fileField, String path, String fileName) throws Exception {
        File targetFile = new File(path, fileName);
        if(!targetFile.getParentFile().exists()){
        	targetFile.getParentFile().mkdirs();
        }
        targetFile.deleteOnExit();
        targetFile.createNewFile();
        try {
            fileField.transferTo(targetFile);
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        return targetFile.getPath();
    }
    
    /**
     * 导入导出时的公用流操作
     *@author shanweitai
     *@date 2017年5月2日
     */
    public static void commonStreamOperation(HttpServletRequest request,
			HttpServletResponse response,File file){
    	try {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			OutputStream os = response.getOutputStream();
			BufferedOutputStream bos = new BufferedOutputStream(os);
//			response.reset();
//			response.setHeader("Content-Type", "application/force-download");
//			response.setHeader("Content-Type", "application/vnd.ms-excel");
			response.setHeader("Content-disposition", "attachment;filename="+new String(file.getName().getBytes("gb2312"),"ISO8859-1"));
			int bytesRead=0;
			byte[] buffer = new byte[1024];
			while((bytesRead = bis.read(buffer))!=-1){
				bos.write(buffer,0,bytesRead);
			}
//			bos.flush();
			bos.close();
			bis.close();
			os.flush();
			os.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    /**
     * 导入导出时的公用流操作
     *@author shanweitai
     *@date 2017年5月2日
     */
    public static void commonStreamOperation(HttpServletRequest request,
			HttpServletResponse response,InputStream fis,String fileName){
    	try {
			BufferedInputStream bis = new BufferedInputStream(fis);
			OutputStream os = response.getOutputStream();
			BufferedOutputStream bos = new BufferedOutputStream(os);
			response.setHeader("Content-disposition", "attachment;filename="+new String(fileName.getBytes("gb2312"),"ISO8859-1"));
			int bytesRead=0;
			byte[] buffer = new byte[1024];
			while((bytesRead = bis.read(buffer))!=-1){
				bos.write(buffer,0,bytesRead);
			}
//			bos.flush();
			bos.close();
			bis.close();
			os.flush();
			os.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

}
