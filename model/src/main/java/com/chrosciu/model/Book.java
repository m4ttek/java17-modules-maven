package com.chrosciu.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String author;
    private String title;
}
