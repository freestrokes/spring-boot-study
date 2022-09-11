package com.freestrokes.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//@NoArgsConstructor
//@Getter
public class Book {

    private Integer idx;
    private String title;
    private LocalDateTime publishedAt;

//    @Builder
//    public Book(
//        Integer idx,
//        String title,
//        LocalDateTime publishedAt
//    ) {
//        this.idx = idx;
//        this.title = title;
//        this.publishedAt = publishedAt;
//    }

    public Book(int idx, String title, LocalDateTime publishedAt) {
    }

    public static BookBuilder builder() {
        return new BookBuilder();
    }

    public static class BookBuilder {
        private int idx;
        private String title;
        private LocalDateTime publishedAt;

        private BookBuilder() {
        }

        public BookBuilder idx(int idx) {
            this.idx = idx;
            return this;
        }

        public BookBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder publishedAt(LocalDateTime publishedAt) {
            this.publishedAt = publishedAt;
            return this;
        }

        public Book build() {
            return new Book(idx, title, publishedAt);
        }
    }

}
