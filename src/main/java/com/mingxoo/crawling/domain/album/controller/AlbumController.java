package com.mingxoo.crawling.domain.album.controller;

import com.mingxoo.crawling.domain.album.service.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AlbumController {

    private final AlbumService albumService;

    @GetMapping("/crawling/albums")
    public void getCrawlingAlbums(@RequestParam Long start,
                                  @RequestParam Long end) {
        albumService.crawlingAlbum(start, end);
    }
}
