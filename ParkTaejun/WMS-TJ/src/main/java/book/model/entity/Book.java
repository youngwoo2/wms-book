package book.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Book {
    private int bookId;
    private String title;
    private String author;
    private String description;
    private int price;
    private String category;
    private Timestamp createdAt;
}
