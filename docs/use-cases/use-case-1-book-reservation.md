# Use Case #1: Book Reservation

"As a library user,
I want to reserve a book,
so I can checkout the book later at the library."

## Main Scenario

1. The user access the books search page
2. The user searches a book by a term
3. The system lists the books which match the search
4. The user selects a book from the list
5. The system shows the details of the book
6. The user clicks the button "Make reservation"
7. The system asks for confirmation
8. The user confirms the reservation
9. The system shows details of the reservation and sends an email to the user
10. End of use case

## Alternative Scenario #1

1. The user access the books search page
2. The user searches a book by a term
3. The system lists the books which match the search
4. The user does not find the book and leaves the search page
5. End of use case

## Alternative Scenario #2

1. The user access the books search page
2. The user searches a book by a term
3. The system lists the books which match the search
4. The user selects a book from the list
5. The system shows the details of the book
6. The user clicks the button "Make reservation"
7. The system asks for confirmation
8. The user cancels the reservation
9. The system goes back to the book details
10. End of use case

## Alternative Scenario #3

1. The user access the books search page
2. The user searches a book by a term
3. The system lists the books which match the search
4. The user selects a book from the list
5. The system shows the details of the book
6. The user clicks the button "Make reservation"
7. The system asks for confirmation
8. The user cancels the reservation
8. The user confirms the reservation
9. The system shows an error message indicating the user has pendencies
10. End of use case

## Requirements

* the search will return a book if the search term is present in the title, author, summary or tags
* the details page must show the title, author, summary, tags and a picture of the cover
* the details page will show the number of available copies to be reserved
* the user can only reserve a book if he/she does not have any pendencies (book not returned)
* the user can only reserve 3 books at the same time (configurable)
* a reservation is automatically canceled if the user does not checkout the book within 2 days (configurable)