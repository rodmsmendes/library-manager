package org.librarymanager.domain;

public interface BookCopyRepository {
    BookCopy findById(Long bookCopyId);
}
