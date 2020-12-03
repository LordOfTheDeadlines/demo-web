package com.example.demoweb;

import com.example.demoweb.model.Post;
import com.example.demoweb.service.LikesService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource("/application-test.properties")
public class LikeControllerTest {
    @Autowired
    LikesService likesService;
    @Test
    public void likeSetTest() throws Exception {
        Post post = new Post(1L, "Test post",new Date());
        post.setLikes(2);
        post.setLikes(likesService.like(post));
        Assert.assertEquals(java.util.Optional.ofNullable(post.getLikes()), java.util.Optional.ofNullable(3));
    }
    @Test
    public void likeButton() throws Exception {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\odint\\Desktop\\My web app-browser\\My web app\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/");
        int oldCount = Integer.parseInt(driver.findElement(By.xpath(".//div[@class='col-md-1']/button[@class='btn btn-sm btn-secondary like']")).getText().replace(" ❤",""));
        driver.findElement(By.xpath(".//div[@class='col-md-1']/button[@class='btn btn-sm btn-secondary like']")).click();
        int newCount = Integer.parseInt(driver.findElement(By.xpath(".//div[@class='col-md-1']/button[@class='btn btn-sm btn-secondary like']")).getText().replace(" ❤",""));
        Assert.assertEquals(oldCount+1, newCount);
    }
}
