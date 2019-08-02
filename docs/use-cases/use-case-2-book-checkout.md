# Use Case #2: Book Checkout

"As an attendant,
I want to checkout a book for a user,
so he/she can take the book and return it later."

## Main Scenario

1. The attendant searches the reservation by the user id
2. The system lists all the user's reservations
3. The attendant selects a reservation to checkout 
4. The system asks for checkout confirmation
5. The attendant confirms the checkout
6. The system shows a checkout confirmation message
7. The system sends an email notifying the user
8. End of use case

## Alternative Scenario #1

1. The attendant searches the reservation by the user id
2. The system does not find any reservation for the user
3. End of use case

## Alternative Scenario #2

1. The attendant searches the reservation by the user id
2. The system lists all the user's reservations
3. The attendant selects a reservation to checkout 
4. The system asks for checkout confirmation
5. The attendant cancels the checkout
6. End of use case

## Requirements

* After checking out the book, the system finishes the reservation and register a lending
* A book is borrowed by a period of 7 days, after this period the book must be returned
* If a book is not returned within the 7 days period, a pendency is created for the user
 