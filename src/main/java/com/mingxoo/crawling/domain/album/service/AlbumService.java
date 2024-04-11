package com.mingxoo.crawling.domain.album.service;

import com.mingxoo.crawling.domain.album.repository.AlbumRepository;

import java.util.List;

import lombok.RequiredArgsConstructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AlbumService {

    private final AlbumRepository albumRepository;

    @SuppressWarnings("checkstyle:LineLength")
	public void crawlingAlbum(Long start, Long end) {
        // 크롬 드라이버 설정
        System.setProperty("webdriver.chrome.driver", "./chromedriver");

        // 크롬 옵션 설정
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        // 사이트 접속
        for (long i = start; i <= end; i++) {
            driver.get(String.format("https://www.melon.com/album/detail.htm?albumId=%d", i));

            List<WebElement> elements = driver.findElements(By.cssSelector("#conts > div.section_info > div > div.entry"));

            for (WebElement element : elements) {
                System.out.println(element.getText());

            }
        }
    }
}
