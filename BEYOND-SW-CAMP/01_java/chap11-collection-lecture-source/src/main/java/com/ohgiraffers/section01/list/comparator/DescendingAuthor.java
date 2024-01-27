package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class DescendingAuthor implements Comparator<BookDTO> {

    /* 설명. 작가별로 내림차순하기 */
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return -o1.getAuthor().compareTo(o2.getAuthor());
    }
}
