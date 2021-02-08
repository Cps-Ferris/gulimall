package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GulimallThirdPartyApplicationTests {
    
    @Autowired
    private OSSClient ossClient;
    
    @Test
    void contextLoads() {
    }


//    @Test
//    void testOSS() throws FileNotFoundException {
//        // Endpoint以杭州为例，其它Region请按实际情况填写。
//        String endpoint = "https://oss-cn-shanghai.aliyuncs.com";
//        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
//        String accessKeyId = "";
//        String accessKeySecret = "";
//
//        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        // 获取文件流
//        InputStream inputStream = new FileInputStream("C:\\Users\\peish\\Pictures\\Camera Roll\\头像3.JPG");
//
//        // bucket、fileName、fileStream
//        ossClient.putObject("gulimall-ferris", "头像.jpg", inputStream);
//
//        // 关闭OSSClient。
//        ossClient.shutdown();
//
//        System.out.println("上传成功...");
//    }
    
    @Test
    void testSpringCloudAlibabaOSS() throws FileNotFoundException {
        // 获取文件流
        InputStream inputStream = new FileInputStream("C:\\Users\\peish\\Pictures\\Camera Roll\\头像3.JPG");
        
        // bucket、fileName、fileStream
        ossClient.putObject("gulimall-ferris", "头像4.jpg", inputStream);
        
        // 关闭OSSClient。
        ossClient.shutdown();
        
        System.out.println("上传成功...");
    }
    
    
}
