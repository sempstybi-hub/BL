✔️ 1. СУТЬ СВЯЗИ
📌 Автор → Книги
Один автор может написать много книг
Одна книга принадлежит одному автору
🌳 ЛОГИЧЕСКАЯ СТРУКТУРА БД
Author
------
id (PK)
name

Book
------
id (PK)
title
author_id (FK → Author.id)
💡 Связь
Author (1) ───── (∞) Book
✔️ 2. JPA РЕАЛИЗАЦИЯ
📄 Author.java (родитель)
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // 1 автор → много книг
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;

    public Author() {}
}
📄 Book.java (дочерняя сущность)
import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    // много книг → один автор
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Book() {}
}
💡 3. КАК ЭТО РАБОТАЕТ
📌 @OneToMany (в Author)
mappedBy = "author"

👉 говорит:

связь управляется со стороны Book

📌 @ManyToOne (в Book)
@JoinColumn(name = "author_id")

👉 создаёт внешний ключ в таблице Book

✔️ 4. ЧТО БУДЕТ В БД
Author
id	name
1	Tolstoy
Book
id	title	author_id
1	War and Peace	1
2	Anna Karenina	1