package com.lvtuben.istio.domain;

import java.io.Serializable;

/**
 * book detail vo
 */
public class BookDetailVo implements Serializable {
    private String id;
    private String images;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BookDetailVo(String id, String images, String content) {
        this.id = id;
        this.images = images;
        this.content = content;
    }
}
