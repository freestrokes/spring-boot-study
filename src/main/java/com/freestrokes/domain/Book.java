package com.freestrokes.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
//@NoArgsConstructor
//@Getter
public class Book {

    @Id
    @GeneratedValue
    private Integer idx;

    @Column
    private String title;

    @Column
    private LocalDateTime publishedAt;

    public Book() {
    }

    public int getIdx() {
        return idx;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

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

    // lombok 설정
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

}
