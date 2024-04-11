package com.mingxoo.crawling.service;

import com.mingxoo.crawling.domain.album.repository.AlbumRepository;
import com.mingxoo.crawling.domain.album.service.AlbumService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AlbumServiceTest {

    @InjectMocks
    private AlbumService target;

    @Mock
    private AlbumRepository albumRepository;

    @Test
    public void 크롤링실패_없는ID() {
        // given

        // when

        // then
    }
}
