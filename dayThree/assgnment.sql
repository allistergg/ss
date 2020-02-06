/*1. How many copies of the book titled A Brief History of Time
	 are owned by the library branch whose name is "Northcote"?
*/
SELECT title, branchName, noOfCopies FROM tbl_book b
INNER JOIN tbl_book_copies bc
ON b.bookId = bc.bookId
INNER JOIN tbl_library_branch lb
ON bc.branchId = lb.branchId
WHERE b.title = 'A Brief History of Time' and lb.branchName = 'Northcote';
/*2. How many copies of the book titled 
The Lost Tribe are owned by each library branch?
*/
SELECT branchName, title, noOfCopies FROM tbl_library_branch lb
LEFT JOIN tbl_book_copies bc
ON lb.branchId = bc.branchId
LEFT JOIN tbl_book b
ON bc.bookId =  b.bookId
WHERE title = 'A Brief History of Time';

/* 3. Retrieve the names of all borrowers who do not have any books checked out */
select * from tbl_borrower bo
LEFT JOIN tbl_book_loans bl
ON bo.cardNo = bl.cardNo
WHERE bookId IS NULL;

/*4. For each book that is loaned out from the "Wandsworth Town" branch 
and whose DueDate is today, retrieve the book title, the borrower's name, 
and the borrower's address. */
-- select * from tbl_book_loans;
-- select * from tbl_library_branch;
-- update tbl_book_loans set dueDate = ADDDATE('2020-01-30',7) where bookId = 18; 
-- update tbl_book_loans set dateOut = '2020-01-30' where bookId = 18;

SELECT title, bo.name, bo.address FROM tbl_book_loans bl
INNER JOIN tbl_library_branch lb
ON bl.branchId = lb.branchId
INNER JOIN tbl_borrower bo
ON bl.cardNo = bo.cardNo
INNER JOIN tbl_book b
ON b.bookId = bl.bookId
WHERE branchName = 'Wandsworth Town' and dueDate = CURDATE();

/* 5. For each library branch, retrieve the branch name and 
the total number of books loaned out from that branch.*/

SELECT branchName, count(bl.branchId) FROM tbl_library_branch lb
LEFT JOIN tbl_book_loans bl
ON lb.branchId = bl.branchId
GROUP BY branchName;

/*6. Retrieve the names, addresses, and number of books checked out 
for all borrowers who have more than five books checked out. */

-- select * from tbl_book_loans;
-- insert into tbl_book_loans (bookId, branchId, cardNo, dateOut, dueDate)
-- values (5, 17, 5, '2020-02-02', ADDDATE('2020-02-02', 7)),
-- 		(6, 17, 5, '2020-02-03', ADDDATE('2020-02-03', 7)),
--         (7, 17, 5, '2020-02-04', ADDDATE('2020-02-04', 7)),
--         (8, 17, 5, '2020-02-05', ADDDATE('2020-02-05', 7));
	
/*7.  For each book authored (or co-authored) by "Stephen King", retrieve the title 
and the number of copies owned by the library branch whose name is "Central"




select * from tbl_book_copies;